//-----------------------------------------------------
// Title: CMPE 343
// Author: Ahmet Cemal Sert
// Section: 1
// Assignment: HW5 Part2
// Description: Reader class that contains a read method that reads the text into a string array
//-----------------------------------------------------

package Part2;

import java.io.*;

import static java.lang.Integer.parseInt;

public class Reader {

    public static String [] read(String fileName){
        String [] strArr = new String[6];

        try
        {
            int numberOfCases = 0;

            File file=new File(fileName);    //creates a new file instance
            FileReader fileReader = new FileReader(file);   //reads the file
            BufferedReader bufferedReader = new BufferedReader(fileReader);  //creates a buffering character input stream
            String line;
            int count = 0;
            while((line=bufferedReader.readLine())!=null)
            {
                if(count == 0){
                    numberOfCases = parseInt(line); // Gives the size of the graph and initializes it
                    count ++;

                }

                while (numberOfCases>0){
                    line = bufferedReader.readLine();
                    String txt = line;
                    strArr[count-1] = txt;
                    count++;
                    numberOfCases--;
                }


            }
            fileReader.close();    //closes the stream
        }

        catch(IOException e)
        {
            e.printStackTrace();
        }
        return strArr;
    }

        // Tester Class
        public static void main(String [] args){
            String fileName  = "C:\\Users\\ACS\\Desktop\\sample_input2.txt";

           String [] arrayOfStrings = Reader.read(fileName);
           for(int i = 0;i<arrayOfStrings.length;i++){
               System.out.println(arrayOfStrings[i]);
           }
        }
}
