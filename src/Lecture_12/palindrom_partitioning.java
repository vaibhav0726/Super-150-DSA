package Lecture_12;

public class palindrom_partitioning {
    public static void main(String[] args) {
        String str = "nitin";
        partitioning(str, "");
    }

    public static void partitioning(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int cut = 1; cut <= ques.length(); cut++) {
            String s1 = ques.substring(0, cut);
            partitioning(ques.substring(cut), ans + s1 + "|");
        }
    }

    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length();
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
