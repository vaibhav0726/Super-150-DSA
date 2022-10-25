package Lecture_14;

//import static Lecture_13.Rat_In_Maze.Display;

// not completed
public class n_queen {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        solve(board, n, 0);
    }

    private static void solve(boolean[][] board, int tq, int row) {
        if (tq == 0) {
            Display(board);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                solve(board, tq - 1, row + 1);
                board[row][col] = false;
            }
        }
    }

    private static void Display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int r = row;
        // vertical
        while (r >= 0) {
            if (board[r][col] == true) {
                return false;
            }
            r--;
        }

        // left diagonal
        r = row;
        int c = col;
        while (r >= 0 && c >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            c--;
            r--;
        }

        // left diagonal
        r = row;
        c = col;
        while (r >= 0 && c < board.length) {
            if (board[r][c] == true) {
                return false;
            }
            c++;
            r--;
        }

        return false;
    }
}
