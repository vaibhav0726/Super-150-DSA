package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/201/problem
public class print_series {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int i=1;
        while(n>0){
            if((3*i+2)%a!=0){
                System.out.println(3*i+2);
                n--;
            }
            i++;
        }
    }
}
