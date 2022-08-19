package coding_blocks_questions;

import java.util.Scanner;

// https://hack.codingblocks.com/app/contests/3446/189/problem
public class patter_triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("	");
            }
            int temp = i;
            for(int j = 1; j<=i;j++){
                System.out.print(temp++ + "	");
            }
            temp = 2*i-2;
            for(int j = 1; j<i;j++){
                System.out.print(temp-- + "	");
            }
            System.out.println();
        }
    }
}
