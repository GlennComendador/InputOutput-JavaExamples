import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class StringReaderExample {

    public static void main(String[] args) {

        /*String Reader
            package can be used to read data (in characters) from Strings.

            In StringReader, the specified string acts as a source from
            where the characters are read individually.
         */

        String sourceText = "Hello Friends!";

        try {
            //Reading the String Resource
            Reader reader = new StringReader(sourceText);

            //Storing the chars in array
            char[] readData = new char[100];
            reader.read(readData); //Store in readData after reading

            //Display Read Data
            System.out.println("The read data: ");
            System.out.print(readData);

            //Close IO
            reader.close();

        } catch (FileNotFoundException e) { //Exception for File
            e.printStackTrace();
        } catch (IOException e) { //Exception for Stream
            e.printStackTrace();
        }
    }
}
