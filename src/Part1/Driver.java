//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW5 Part1
// Description: This class is the driver class of the part1 using the command line arguments.
//-----------------------------------------------------

package Part1;

public class Driver {
    public static void main(String [] args){
        /*
        * Double variables for calculating the passed time during these longest repeated substring methods
        * */
        double initialTime;
        double finishTime;
        double totalTime;

        /*
        * Prints the output as expected using the LongestSubstring.java class. Also calculates the passed time and prints it,too.
        * */
        System.out.println("*********************************");
        initialTime =  System.currentTimeMillis();
        String fileName  = args[0];
        StringBuilder stringBuilder;
        stringBuilder = Reader.read(fileName);
        String text = stringBuilder.toString().replaceAll("\\s+", " ").trim();
        System.out.println(LongestRepeatedSubstring.lrs(text).length());
        System.out.println(LongestRepeatedSubstring.lrs(text));
        finishTime = System.currentTimeMillis();
        totalTime = finishTime - initialTime;
        System.out.println(totalTime);

        /*
         * Prints the output as expected using the LongestRepeatingSequence.java class. Also calculates the passed time and prints it,too.
         * */
        System.out.println("*********************************");
        initialTime =  System.currentTimeMillis();
        String fileName2  = args[0];
        StringBuilder stringBuilder2;
        stringBuilder2 = Reader.read(fileName2);
        String text2 = stringBuilder2.toString().replaceAll("\\s+", " ").trim();
        String lrs="";
        int n = text2.length();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                //Checks for the largest common factors in every substring
                String x = LongestRepeatingSequence.lcp(text2.substring(i,n),text2.substring(j,n));
                //If the current prefix is greater than previous one
                //then it takes the current one as longest repeating sequence
                if(x.length() > lrs.length()) lrs=x;
            }
        }
        System.out.println(lrs.length());
        System.out.println(lrs);

        finishTime = System.currentTimeMillis();
        totalTime = finishTime - initialTime;
        System.out.println(totalTime);

        System.out.println("*********************************");

        /*
         * Prints the output as expected using the ImprovedLongestSubstring.java class. Also calculates the passed time and prints it,too.
         * */
        System.out.println("*********************************");
        initialTime =  System.currentTimeMillis();
        String fileName3  = args[0];
        StringBuilder stringBuilder3;
        stringBuilder3 = Reader.read(fileName);
        String text3 = stringBuilder3.toString().replaceAll("\\s+", " ").trim();
        System.out.println(ImprovedLongestRepeatedSubstring.lrs(text).length());
        System.out.println(ImprovedLongestRepeatedSubstring.lrs(text));
        finishTime = System.currentTimeMillis();
        totalTime = finishTime - initialTime;
        System.out.println(totalTime);
        System.out.println("*********************************");
    }
}
