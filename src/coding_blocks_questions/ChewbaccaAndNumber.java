package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/132/problem
public class ChewbaccaAndNumber {
    static long reverse(long n){
        long rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n/=10;
        }
        return rev;
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        String str = String.valueOf(n);
        int len = str.length();
        int c=1;
        long temp = 1;
        while(n!=0){
            long rem = n%10;
            long ans = 9-rem;
            if(ans<rem){
                if(rem==9 && c==len){
                    temp=temp*10+rem;
                }
                temp=temp*10+ans;
            }
            else{
                temp=temp*10+rem;
            }
            n=n/10;
            c++;
        }
        temp = reverse(temp);
        System.out.println(temp/10);
    }
}
