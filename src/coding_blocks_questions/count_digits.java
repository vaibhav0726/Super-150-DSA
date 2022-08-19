package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/64/problem
public class count_digits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a = s.nextInt();
        int count=0;
        while(n!=0){
            if(n%10==a)
                count++;
            n/=10;
        }
        System.out.println(count);
    }
}
