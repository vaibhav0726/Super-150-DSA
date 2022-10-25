package Lecture_11;

import java.util.Scanner;

public class queen_combination {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 4;
        int tq = 2;
        boolean[] board = new boolean[n];
        printAnswer(board, tq, 0, "", 0);
    }

    public static void printAnswer(boolean[] board, int tq, int qpsf, String ans, int idx) {
        if (qpsf == tq) {
            System.out.println(ans);
            return;
        }
        for (int i = idx; i < board.length; i++) {
            if (board[i] == false) {
                board[i] = true;
                printAnswer(board, tq, qpsf + 1, ans + "b" + i + "q" + qpsf, i + 1);
                board[i] = false;
            }
        }
    }
}
