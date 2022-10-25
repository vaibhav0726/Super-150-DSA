package Lecture_11;

import java.util.Scanner;

// backtracking
public class queen_permutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        printAnswer(board, tq, 0, "");
    }

    public static void printAnswer(boolean[] board, int tq, int qpsf, String ans) {

        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                printAnswer(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf);
                board[i] = false;
            }
        }
    }
}
