package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/484/problem
public class Pattern_with_zeroes {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int temp = 1;
        for(int i=0; i<n; i++){
            System.out.print(i+1 + " ");
            if(i>1){
                for(int j=0;i>=2 && j<temp;j++){
                    System.out.print("0 ");
                }
                temp++;
            }
            if(i!=0){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}

