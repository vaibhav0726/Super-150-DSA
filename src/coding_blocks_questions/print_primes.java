package coding_blocks_questions;

import java.util.Scanner;

//  https://hack.codingblocks.com/app/contests/3446/77/problem
public class print_primes {
    static boolean isPrime(int n){
        int i = 2;
        if(n<=1){
            return false;
        }
        else if(n==2){
            return true;
        }
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                return false;
            }
            i+=1;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=2;i<=n;i++){
            if(isPrime(i))
                System.out.println(i);
        }

    }
}
