package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/242/problem
//printing nth fibnacci number
public class nth_fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int a=0,b=1;
        for(int i=0; i<n; i++){
            int temp = a+b;
            a=b;
            b=temp;
        }
        System.out.println(a);
    }
}
