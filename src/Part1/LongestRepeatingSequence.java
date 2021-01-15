//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID:43999263780
// Section: 1
// Assignment: HW5 Part1
// Description: This class defines another longest repeating substring
// Reference: https://www.javatpoint.com/program-to-find-longest-repeating-sequence-in-a-string
//-----------------------------------------------------
package Part1;

public class LongestRepeatingSequence {
    //Checks for the largest common prefix
    public static String lcp(String s, String t){
        int n = Math.min(s.length(),t.length());
        for(int i = 0; i < n; i++){
            if(s.charAt(i) != t.charAt(i)){
                return s.substring(0,i);
            }
        }
        return s.substring(0,n);
    }

    // Class Tester
    public static void main(String[] args) {
        String str = "acbdfghybdf";
        String lrs="";
        int n = str.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                //Checks for the largest common factors in every substring
                String x = lcp(str.substring(i,n),str.substring(j,n));
                //If the current prefix is greater than previous one
                //then it takes the current one as longest repeating sequence
                if(x.length() > lrs.length()) lrs=x;
            }
        }
        System.out.println("Longest repeating sequence: "+lrs);
    }
}