package coding_blocks_questions;

import java.util.Scanner;

//https://hack.codingblocks.com/app/contests/3446/696/problem
public class shopping_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- >0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i=0;
            int Aayush=0, Harshit=0;
            while(true){
                Aayush+=++i;
                if(Aayush>a){
                    System.out.println("Harshit");
                    break;
                }
                Harshit+=++i;
                if(Harshit>b){
                    System.out.println("Aayush");
                    break;
                }
            }

        }
    }
}
