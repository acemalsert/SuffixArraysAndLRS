//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// ID:43999263780
// Section: 1
// Assignment: HW5 Part2
// Description: Driver class of the part2 of the homework that uses the command line arguments and prints out the order of movements in the required format
//-----------------------------------------------------
package Part2;

public class Driver {

    public static void main(String [] args){
        String fileName  = args[0];

        String [] arrayOfStrings = Reader.read(fileName);

        System.out.println(ImprovedLongestRepeatedSubstring.lrs(arrayOfStrings[0]+arrayOfStrings[0])+"...");
        System.out.println(ImprovedLongestRepeatedSubstring.lrs(arrayOfStrings[1]+arrayOfStrings[1])+"...");
        System.out.println(ImprovedLongestRepeatedSubstring.lrs(arrayOfStrings[2]+arrayOfStrings[2])+"...");
        System.out.println(ImprovedLongestRepeatedSubstring.lrs(arrayOfStrings[3]+arrayOfStrings[3])+"...");
        System.out.println(ImprovedLongestRepeatedSubstring.lrs(arrayOfStrings[4]+arrayOfStrings[4])+"...");
        System.out.println(ImprovedLongestRepeatedSubstring.lrs(arrayOfStrings[5]+arrayOfStrings[5])+"...");
    }
}
