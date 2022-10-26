import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int grid[][] = new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				grid[i][j] = s.nextInt();
			}
		}
        solve(grid, 0, 0, n);
    }

    private static void solve(int[][] grid, int row, int col, int n) {

        if (col == n) {
            row++;
            col = 0;
        }
        if (row == n) {
            display(grid);
            return;
        }

        if (grid[row][col] != 0) {
            solve(grid, row, col + 1, n);
        } else {
            for (int val = 1; val <= n; val++) {
                if (isitPossible(grid, row, col, val) == true) {
                    grid[row][col] = val;
                    solve(grid, row, col + 1, n);
                    grid[row][col] = 0;
                }
            }
        }
    }

    private static boolean isitPossible(int[][] grid, int row, int col, int val) {
//        column check
        int r = 0;
        int c = col;
        while (r < 9) {
            if (grid[r][c] == val)
                return false;
            r++;
        }
//        row check
        r = row;
        c = 0;
        while (c < 9) {
            if (grid[r][c] == val)
                return false;
            c++;
        }

//        3*3 matrix
        r = row - row % 3;
        c = col - col % 3;
        for (int i = r; i < r + 3; i++) {
            for (int j = c; j < c + 3; j++) {
                if (grid[i][j] == val) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void display(int ans[][]) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

