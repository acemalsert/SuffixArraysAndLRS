//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID:43999263780
// Section: 1
// Assignment: HW5 Part2
// Description: This class finds the longest repeated substring with the help of suffix array. I tried to improve the other implementation which is LongestRepeatedSubstring
//-----------------------------------------------------

package Part2;

import Part1.Reader;
import Part1.SuffixArray;

public class ImprovedLongestRepeatedSubstring {

    private ImprovedLongestRepeatedSubstring() { }

    /**
     * Returns the longest common string of the two specified strings.
     *
     * @param  s one string
     * @param  t the other string
     * @return the longest common string that appears as a substring
     */

    /**
     * Returns the longest repeated substring of the specified string.
     *
     * @param  text the string
     * @return the longest repeated substring that appears in {@code text};
     *         the empty string if no such string
     */
    public static String lrs(String text) {
        int n = text.length();
        Part1.SuffixArray sa = new SuffixArray(text);
        String lrs = "";
        for (int i = 1; i < n; i++) {
            int length = sa.lcp(i);
            if (length > lrs.length()) {
                 lrs = sa.select(i).substring(0, length);
            }
        }
        return lrs;
    }

    // Class Tester
    public static void main(String[] args) {

        String fileName  = "C:\\Users\\ACS\\Desktop\\sample_input1.txt";
        StringBuilder stringBuilder;
        stringBuilder = Part1.Reader.read(fileName);
        String text = stringBuilder.toString().replaceAll("\\s+", " ").trim();
        System.out.println(text);
        System.out.println(lrs(text));
        System.out.println();

        System.out.println("*********************************");
        System.out.println();
        String file2 =  "C:\\Users\\ACS\\Desktop\\sample_input2.txt";
        StringBuilder stringBuilder2;
        stringBuilder2 = Reader.read(file2);
        String text2 = stringBuilder2.toString().replaceAll("\\s+", " ").trim();
        System.out.println(text2);
        System.out.println(lrs(text2));
    }
}