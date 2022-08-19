package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/698/problem
public class inverse_of_a_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        int pos = 1;
        while(n!=0){
            int rem = n%10;
            sum = (int)(sum + pos*Math.pow(10,rem-1));
            n= n/10;
            pos++;
        }
        System.out.println(sum);
    }
}
