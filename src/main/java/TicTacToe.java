/**
 * TicTacToe
 * UC5 validates whether a move is inside the board boundaries
 * and whether the selected cell is empty.
 */
public class TicTacToe {

    // Board initialization
    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    public static void main(String[] args) {

        // Test cases
        System.out.println(isValidMove(1, 1)); // true
        System.out.println(isValidMove(3, 0)); // false (out of bounds)

        board[1][1] = 'X';
        System.out.println(isValidMove(1, 1)); // false (already occupied)
    }

    static boolean isValidMove(int row, int col) {

        // Check bounds (0–2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }
}