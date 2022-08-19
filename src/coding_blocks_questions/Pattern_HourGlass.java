package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/1364/problem
public class Pattern_HourGlass {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // int temp = 2*n-1;
        for(int i=0; i<2*n+1;i++){
            if(i<=n){
                for(int j=0; j<i;j++){
                    System.out.print("  ");
                }
                for(int j=0; j<=n-i;j++){
                    System.out.print(n-i-j+" ");
                }
                for(int j=1; j<=n-i;j++){
                    System.out.print(j+" ");
                }
            }
            else if(i>n){
                for(int j=0; j<2*n-i;j++){
                    System.out.print("  ");
                }
                int temp = i-n;
                for(int j=0; j<=i-n;j++){
                    System.out.print(temp-- +" ");
                }
                temp=i-n;
                for(int j=1; j<=temp;j++){
                    System.out.print(j+" ");
                }
            }

            System.out.println();
        }
    }
}
