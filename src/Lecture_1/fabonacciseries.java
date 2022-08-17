package Lecture_1;

import java.util.Scanner;

public class fabonacciseries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int prev = 0, next =1;
        if(n==0){
            System.out.println(0);
        }
        else if(n==1){
            System.out.println(1);
        }
        else{
            int num = 0;
            for(int i= 2; i<=n;i++){
                num = prev + next;
                prev = next;
                next = num;
            }
            System.out.println(num);
        }
    }
}
