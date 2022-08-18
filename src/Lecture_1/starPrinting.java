package Lecture_1;

import java.util.Scanner;

public class starPrinting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = n; i > 0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = n - i - 1; j > 0; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//            }
//            for (int j = n - i; j > 0; j--) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("  ");
//                System.out.print("  ");
//            }
//            for (int j = n - i; j > 0; j--) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = n - i - 1; j > 0; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = n - i - 1; j > 0; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*   ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//*
//*  *
//*  *  *
//*  *  *  *
//*  *  *  *  *
//*  *  *  *
//*  *  *
//*  *
//*
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; i<n && j <= i; j++) {
                System.out.print("*  ");
            }
            for(int j=2*n-1; i>=n && j>i ;j--){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; i<n && j <= i; j++) {
                System.out.print("*  ");
            }
            for(int j=2*n-1; i>=n && j>i ;j--){
                System.out.print("*  ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 2*n-1; i++) {
            for (int j = 0; i<n && j <= i; j++) {
                System.out.print("*  ");
            }
            for(int j=2*n-1; i>=n && j>i ;j--){
                System.out.print("*  ");
            }
            System.out.println();
        }

//        hw:- 16,17,18,19,20,21,22,23,24,25,26,

    }
}
