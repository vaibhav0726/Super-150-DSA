package Lecture_11;

import java.util.Scanner;

public class coin_change_backtracking {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] coin = {2, 3, 5, 7};
        int amount = 10;
        printAnswer(coin, amount, "");
    }

    public static void printAnswer(int[] coin, int amount, String ans) {
        if (amount == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < coin.length; i++) {
            if (amount >= coin[i]) {
                amount -= coin[i];
                printAnswer(coin, amount, ans + coin[i]);
            }
        }
    }
}
