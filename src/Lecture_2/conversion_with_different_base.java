package Lecture_2;

public class conversion_with_different_base {
    public static void main(String[] args) {
        int n = 342;
        int sum = 0;
        int mul = 1;
        while(n!=0){
            int rem = n% 5;
            sum+=(rem*mul);
            n/=5;
            mul*=10;
        }
        System.out.println(sum);
    }
}


//import java.util.*;
//public class Main {
//    public static void main(String args[]) {
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        for(int i = 1; i<=n; i++){
//            for(int j=0; j<n-i; j++){
//                System.out.print("	");
//            }
//            int temp = i;
//            for(int j = 1; j<=i;j++){
//                System.out.print(temp++ + "	");
//            }
//            temp = 2*i-2;
//            for(int j = 1; j<i;j++){
//                System.out.print(temp-- + "	");
//            }
//
//            System.out.println();
//        }
//    }
//}