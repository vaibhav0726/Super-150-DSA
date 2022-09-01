package Lecture_5;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,10,20,30,60};
        int si = 0, ei=arr.length-1;
        int n = 20, i=-1;
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid] == n){
                i = mid;
                break;
            } else if (arr[mid]>n) {
                ei = mid-1;
            }
            else{
                si = mid+1;
            }
        }
        System.out.println(i);
    }
}
