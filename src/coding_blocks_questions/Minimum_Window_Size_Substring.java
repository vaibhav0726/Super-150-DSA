import java.util.*;
public class Main {
    private static int[] t_freq;
    private static int[] countFreq(String str){
        int[] freq = new int[52];
        if(str.length() > 0){
            for(int i=0; i<str.length(); i++){
                char c = str.charAt(i);
                if(c>='a') freq[c-97+26]+=1;
                else freq[c-65] += 1;
            }
        }
        return freq;
    }
    private static boolean matchFreq(int[] freqArr){
        for(int i=0;i<52;i++){
            if(t_freq[i]!=0 && t_freq[i]>freqArr[i]) return false;
        }
        return true;
    }
    private static String minW(String s, String t){
        t_freq = countFreq(t);
        String curSTR = "";
        String ans = "";
        for(int i=0;i<s.length();i++){
            curSTR += s.charAt(i);
            String prev = curSTR;
            while(matchFreq(countFreq(curSTR))){
                prev = curSTR;
                curSTR = curSTR.substring(1);
            }
            curSTR = prev;
            if(matchFreq(countFreq(curSTR))){
                if(ans.length() == 0 || ans.length() > curSTR.length()) ans = curSTR;
            }
        }
        return ans;
    }
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println(minW(sc.next(),sc.next()));
        sc.close();
    }
}
