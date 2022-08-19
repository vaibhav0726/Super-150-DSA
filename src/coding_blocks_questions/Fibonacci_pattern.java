package coding_blocks_questions;

import java.util.Scanner;

public class Fibonacci_pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=1;
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(i==0){
                System.out.println(0);
                b=1;
                continue;
            }
            for(int j=0; j<=i;j++){
                System.out.print(b+" ");
                sum=a+b;
                a=b;
                b=sum;
            }
            System.out.println();
        }
    }
}
