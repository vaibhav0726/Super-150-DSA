package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/100/problem
public class print_inverse {
    static int reverse(int n){
        int rev=0;
        while(n!=0){
            rev = rev*10+ n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String args[]) {
        // Your Code Here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(reverse(n));
    }
}
