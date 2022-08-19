package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/231/problem
public class Hollow_rhombus_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0; i<=n-1;i++){
            if(i==0){
                for(int j=0; j<n-i-1;j++){
                    System.out.print(" ");
                }
                for(int j=0; j<n;j++){
                    System.out.print("*");
                }
            }else{
                for(int j=0; j<n-i-1;j++){
                    System.out.print(" ");
                }
                for(int j=0; j<1;j++){
                    System.out.print("*");
                }
            }

            if(i!=0 && i!=n-1){
                for(int j=0; j<n-2;j++){
                    System.out.print(" ");
                }
                for(int j=0; j<1;j++){
                    System.out.print("*");
                }
            }
            if(i==n-1){
                for(int j=0; j<n-1; j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
