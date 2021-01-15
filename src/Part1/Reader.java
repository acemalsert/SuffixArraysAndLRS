//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW5 Part1
// Description: Reader class that reads the text into a stringbuilder
//-----------------------------------------------------

package Part1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

        public static StringBuilder read(String fileName)  {
            String text;
            StringBuilder stringBuilder =  new StringBuilder();
            File file = new File(fileName);
            try (Scanner input = new Scanner(file)) {
                int i = 0;
                while (input.hasNext()) {
                    String word = input.next();
                    stringBuilder.append(word);
                    i++;
                }
            }
            catch (FileNotFoundException e){
                System.out.println("The file path could not found.");
            }
            return stringBuilder;
        }

        // Tester Class
        public static void main(String [] args){
            String fileName  = "C:\\Users\\ACS\\Desktop\\sample_input1.txt";
            StringBuilder stringBuilder;
            stringBuilder = Reader.read(fileName);
            System.out.println(stringBuilder);
        }
}
