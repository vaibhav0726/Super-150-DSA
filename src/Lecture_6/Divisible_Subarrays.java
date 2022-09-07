package Lecture_6;

import java.util.*;

public class Divisible_Subarrays{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        long t = s.nextLong();
        while(t-- > 0){
            int n = s.nextInt();
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = s.nextLong();
            }
            System.out.println(goodSubArray(arr));
        }
    }
    public static long goodSubArray(long[] arr){
        long sum = 0;
        int n = arr.length;
        long[] freq = new long[n];
        freq[0] = 1;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            long idx = sum %  n;
            if(idx < 0){
                idx += n;
            }
            freq[(int)idx] += 1;
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            if(freq[i] >= 2){
                long p = freq[i];
                ans += (p*(p-1))/2;
            }
        }
        return ans;
    }
}