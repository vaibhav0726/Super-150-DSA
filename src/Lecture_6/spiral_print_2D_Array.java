package Lecture_6;

import java.util.Scanner;

public class spiral_print_2D_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        printSpriral(arr);
    }
    public static void printSpriral(int[][] arr){
        int minr = 0;
        int maxr = arr.length -1;
        int minc = 0;
        int maxc = arr[0].length -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[minr][i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            
        }
    }
}
