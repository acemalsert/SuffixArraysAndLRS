//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID:43999263780
// Section: 1
// Assignment: HW5 Part2
// Description: This class finds the longest repeated substring with the help of suffix array
//-----------------------------------------------------

package Part2;

import Part1.Reader;
import Part1.SuffixArray;

public class LongestRepeatedSubstring {

    private LongestRepeatedSubstring() { }

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
        SuffixArray sa = new SuffixArray(text);
        String lrs = "";
        for (int i = 1; i < n; i++) {
            int length = sa.lcp(i);
            if (length > lrs.length()) {
                lrs = text.substring(sa.index(i), sa.index(i) + length);
            }
        }
        return lrs;
    }

    // Class Tester
    public static void main(String[] args) {

        String fileName  = "C:\\Users\\ACS\\Desktop\\sample_input1.txt";
        StringBuilder stringBuilder;
        stringBuilder = Reader.read(fileName);
        String text = stringBuilder.toString().replaceAll("\\s+", " ").trim();
        System.out.println(text);
        System.out.println(lrs(text));
        System.out.println();

    }
}
