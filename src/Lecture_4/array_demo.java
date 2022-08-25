package Lecture_4;

import java.util.Scanner;

public class array_demo {
    public static void main(String[] args) {
//        java is a call by value
        int arr[] =new int[5];
//        System.out.println(arr);
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        int[] other = arr; // this will not create any other array it will create a reference with arr
        other[1]=100;
//        System.out.println(arr[1]);
//        System.out.println(other[1]);
        Scanner s =new Scanner(System.in);
//        int n= s.nextInt();
//        c type declaration
//        int arr1[] = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = s.nextInt();
//        }
        int[] arr3 = {1,2,3,4,5};
//        System.out.println(arr3[0]+" "+arr3[3]);
//        swap(arr, 0, 1);
//        System.out.println(arr3[0]+" "+arr3[1]);
//        System.out.println(arr3+" "+other);
//        swapArray(arr3,other);
//        System.out.println(arr3+" "+other);
        arr = new int[]{2, 3, -1, 4, 7,11,9};
//        for(int i=0; i<arr.length;i++){
//            if(arr[i]==11){
//                System.out.println(i);
//            }
//        }
//        int min = Integer.MAX_VALUE, index=-1;
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//                index=i;
//            }
//        }
//        System.out.println(index);
        int n = arr.length-1;
        for (int i = 0; i < arr.length / 2; i++ ,n--) {
            int temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//    public static void swap(int[] arr, int i, int j){
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    public static void swapArray(int arr[], int other[]){
        int[] temp = arr;
        arr = other;
        other = temp;
        System.out.println(temp+" "+other+" "+arr);
    }
//    public static void Dispaly(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]+" ");
//        }
//    }
}
