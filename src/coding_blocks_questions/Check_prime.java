package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/919/problem
public class Check_prime {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i = 3;
        if(n<=1){
            System.out.println("Not Prime");
            return;
        }
        else if(n==2){
            System.out.println("Prime");
            return;
        }
        boolean flag=false;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                flag = true;
                System.out.println("Not Prime");
                break;
            }
            i+=2;
        }
        if(!flag)
            System.out.println("Prime");
    }
}

