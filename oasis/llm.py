"""
LLM access: configuration from oasis/.env and queries to an OpenAI-compatible API.

Configuration (environment variables or oasis/.env file):
    OASIS_API_KEY   API key (OpenRouter or NVIDIA)
    OASIS_BASE_URL  default https://openrouter.ai/api/v1
    OASIS_MODEL     model name
"""

import json
import os
import time
import urllib.error
import urllib.request

ACTUAL_PATH = os.path.dirname(os.path.abspath(__file__))


def load_env():
    """Read KEY=VALUE lines from oasis/.env into os.environ (if present)."""
    path = os.path.join(ACTUAL_PATH, ".env")
    if os.path.exists(path):
        for line in open(path):
            line = line.strip()
            if line and not line.startswith("#") and "=" in line:
                k, v = line.split("=", 1)
                os.environ.setdefault(k.strip(), v.strip())


def ask_llm(prompt):
    """Send one chat message to an OpenAI-compatible API and return the answer text."""
    base = os.environ.get("OASIS_BASE_URL", "https://openrouter.ai/api/v1")
    body = {
        "model": os.environ["OASIS_MODEL"],
        "messages": [{"role": "user", "content": prompt}],
        "temperature": 0.7,
    }
    req = urllib.request.Request(
        base + "/chat/completions",
        data=json.dumps(body).encode(),  # POST data must be bytes
        headers={
            "Authorization": "Bearer " + os.environ["OASIS_API_KEY"],
            "Content-Type": "application/json",
        },
    )
    for attempt in range(
        5
    ):  # The free models has rate limit (429 Error), so we retry a few times with a delay
        try:
            with urllib.request.urlopen(req, timeout=300) as resp:
                return json.load(resp)["choices"][0]["message"]["content"]
        except urllib.error.HTTPError as e:
            if e.code != 429 or attempt == 4:
                raise
            print("  rate limited, retrying in 30s...")
            time.sleep(30)
