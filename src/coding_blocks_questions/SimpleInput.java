package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/206/problem
public class SimpleInput {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int sum=0;
        while(true)
        {
            int n = s.nextInt();
            sum+=n;
            if(sum<0)
                break;
            else
                System.out.println(n);
        }
    }
}
