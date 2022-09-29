package Lecture_9;

import java.util.*;
public class count_subsequence {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(subSequence(s, ""));
    }
    public static int subSequence(String input, String output){
        if(input.length() == 0){
            System.out.println(output);
            return 1;
        }
        char ch = input.charAt(0);
        int ans = subSequence(input.substring(1), output);
        int ans2 = subSequence(input.substring(1), output + ch);
        return ans + ans2;
    }
}
