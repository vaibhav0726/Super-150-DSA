package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/853/problem
public class Odd_and_Even_back_in_Delhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int even=0,odd=0;
            while(n!=0){
                int rem = n%10;
                if(rem%2==0){
                    even+=rem;
                }
                else{
                    odd+=rem;
                }
                n=n/10;
            }
            if(even%4==0 || odd%3==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
