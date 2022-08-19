package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/25/problem
public class sum_of_odd_placed_and_even_placed_digits {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        // n = reverse(n);
        int even=0, odd=0;
        int i=0;
        while(n!=0){
            if(i%2==1)
                even+=n%10;
            else
                odd+=n%10;
            i++;
            n/=10;
        }
        System.out.println(odd+"\n"+even);
    }
}
