package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/224/problem
public class PatternNumberLadder {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = 1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(temp++ +"	");
            }
            System.out.println();
        }

    }
}
