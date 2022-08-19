package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/1040/problem
public class gcd {
    static int gcd(int a, int b)
    {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n1= s.nextInt();
        int n2= s.nextInt();
        System.out.println(gcd(n1,n2));
    }
}
