package Lecture_13;

import java.util.Scanner;

public class Rat_In_Maze {
    static boolean f = false;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int o = s.nextInt();
        char[][] maze = new char[n][o];
        for (int i = 0; i < maze.length; i++) {
            String str = s.next();
            for (int j = 0; j < str.length(); j++) {
                maze[i][j] = str.charAt(j);
            }
        }
        int[][] ans = new int[n][o];
        HasPath(maze, 0, 0, ans);
        if (!f) System.out.println("NO PATH FOUND");
    }

    // cc:- current column
    // cr:- current row
    public static void HasPath(char[][] maze, int cc, int cr, int[][] ans) {

        if (cr == maze.length - 1 && cc == maze[0].length - 1 && maze[cr][cc] != 'X') {
            ans[cr][cc] = 1;
            Display(ans);
            f = true;
            return;
        }

        if (cc < 0 || cc >= maze[0].length || cr < 0 || cr >= maze.length || maze[cr][cc] == 'X') {
            return;
        }

        maze[cr][cc] = 'X';
        ans[cr][cc] = 1;
        HasPath(maze, cc, cr - 1, ans); // up
        HasPath(maze, cc, cr + 1, ans); // down
        HasPath(maze, cc - 1, cr, ans); // left
        HasPath(maze, cc + 1, cr, ans); // right
        ans[cr][cc] = 0;
        maze[cr][cc] = '0';
    }

    public static void Display(int[][] ans) {
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
