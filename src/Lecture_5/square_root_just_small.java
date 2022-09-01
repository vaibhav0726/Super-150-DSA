package Lecture_5;

public class square_root_just_small {
    public static void main(String[] args) {
        int n = 47;
        System.out.println(root(n));
    }
    public static int root(int n){
        int low = 1;
        int hi = n;
        int ans = 0;
        while(low<=hi){
            int mid = (low + hi)/2;
            if(mid*mid <= n){
                ans = mid;
                low = mid +1;
            }
            else{
                hi = mid-1;
            }
        }
        return ans;
    }

}
