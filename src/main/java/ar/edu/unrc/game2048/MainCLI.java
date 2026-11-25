package ar.edu.unrc.game2048;

import java.util.Scanner;

import static ar.edu.unrc.game2048.Board.WINNING_VALUE;

/**
 * Command-line interface for the 2048 game.
 * 
 * This class handles user input and displays the board state.
 * It demonstrates how to use the Board class and its methods.
 */
public class MainCLI {
    private final Board board;
    private final Scanner scanner;
    
    public MainCLI(String boardString, int size) {
        if (boardString != null) {
            this.board = new Board(boardString, size);
            assert board != null;
            assert board.getSize() == size;
        } else {
            this.board = new Board();
            assert board.getSize() == Board.DEFAULT_SIZE;
        }
        assert board.repOk();
        assert board != null;
        this.scanner = new Scanner(System.in);
    }
    
    /**
     * Main game loop.
     */
    public void play() {
        System.out.println("=== 2048 Game ===");
        System.out.println("Controls: W(up), S(down), A(left), D(right), Q(quit)");
        System.out.println();
        
        while (true) {
            displayBoard();
            
            if (board.isWinningBoard()) {
                System.out.println("🎉 Congratulations! You reached 2048! 🎉");
                System.out.println("You can continue playing or quit.");
                assert board.repOk();
                assert (board.getScore() >= WINNING_VALUE);
                assert hasCellWithValue(board, WINNING_VALUE);
            }
            
            if (board.isLosingBoard()) {
                System.out.println("💀 Game Over! No more moves available. 💀");
                System.out.println("Final score: " + board.getScore());
                assert board.repOk();
                assert board.isLosingBoard();
                assert board.isFull();
                break;
            }
            
            System.out.print("Enter move: ");
            String input = scanner.nextLine().trim().toUpperCase();
            
            if (input.equals("Q")) {
                System.out.println("Thanks for playing! Final score: " + board.getScore());
                break;
            }
            
            // Snapshot taken before applying the move (also covers the invalid-input case below).
            Board before = new Board(board);
            int scoreBefore = board.getScore();
            int sumBefore = sumOfTiles(board);

            boolean moved = false;
            switch (input) {
                case "W": moved = board.moveUp(); break;
                case "S": moved = board.moveDown(); break;
                case "A": moved = board.moveLeft(); break;
                case "D": moved = board.moveRight(); break;
                default:
                    System.out.println("Invalid input! Use W, A, S, D, or Q.");
                    // Invalid input must not mutate the board or score.
                    assert board.equals(before);
                    assert board.getScore() == scoreBefore;
                    continue;
            }
            assert board.repOk();

            if (moved) {
                // A successful move changes the board and adds exactly one new tile (2 or 4).
                assert !board.equals(before);
                int tileAdded = sumOfTiles(board) - sumBefore;
                assert tileAdded == 2 || tileAdded == 4;
            } else {
                // A no-op move must leave the board and score untouched.
                assert board.equals(before);
                assert board.getScore() == scoreBefore;
            }
            // Score never decreases and is always even (tiles are powers of two).
            assert board.getScore() >= scoreBefore;
            assert board.getScore() % 2 == 0;

            if (moved) {
                System.out.println("Tile moved!");
            } else {
                System.out.println("No tiles moved. Try a different direction.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
    
    /**
     * Displays the current board state.
     */
    private void displayBoard() {
        System.out.println(board);
    }
    
    /**
     * Sums the values of every cell on the board (empty cells contribute 0).
     * Used to detect the value of a newly spawned tile after a move.
     */
    private static int sumOfTiles(Board b) {
        int sum = 0;
        for (int r = 0; r < b.getSize(); r++) {
            for (int c = 0; c < b.getSize(); c++) {
                sum += b.getCell(r, c).getValue();
            }
        }
        return sum;
    }

    /**
     * Checks whether any cell on the board holds the given value.
     */
    private static boolean hasCellWithValue(Board b, int value) {
        for (int r = 0; r < b.getSize(); r++) {
            for (int c = 0; c < b.getSize(); c++) {
                if (b.getCell(r, c).getValue() == value) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String board = args.length > 0 ? args[0] : null; // Allow passing a board string as the first argument
        String sizeArg = args.length > 1 ? args[1] : null; // Allow passing a size as the second argument
        int size = sizeArg != null ? Integer.parseInt(sizeArg) : Board.DEFAULT_SIZE; // Parse size to int or use default
        MainCLI game = new MainCLI(board, size);
        game.play();
    }
}
