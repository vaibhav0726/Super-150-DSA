package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/571/problem
public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n*2-3;
        for(int i = 0; i<n; i++){
            int m = 1;
            for(int j=0; j<=i; j++){
                System.out.print(m++ + "	");
            }
            for(int j =0; j<temp; j++){
                System.out.print("	");
            }
            temp-=2;
            int temp2=0;
            if(i+1!=n)
                temp2=i+1;
            else
                temp2=i;
            for(int j =0; j<=i; j++){
                if(temp2!=0)
                    System.out.print(temp2-- +"	");
            }
            System.out.println();

        }
    }
}
