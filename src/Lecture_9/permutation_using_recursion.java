package Lecture_9;

public class permutation_using_recursion {
    public static void main(String[] args) {
        String s = "ABCA";
        permu(s, "");
    }

    public static void permu(String input, String output) {
        if (input.length() == 0) {
            System.out.println(output);
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            boolean flag = false;
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                String s1 = input.substring(0, i) + input.substring(i + 1);
                permu(s1, output + ch);
            }
        }
    }
}