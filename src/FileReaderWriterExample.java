import java.io.*;

public class FileReaderWriterExample {

    public static void main(String[] args) {

        /*******FILE READER*******/
        //Character Array for Reader
        char[] charArray = new char[100];

        try {
            //Create Reader
            Reader reader = new FileReader("/Users/rgcomendador/Documents/Programming Projects/Intelli J/Java Input Output/hello.txt");

            //Check if Reader is Ready
            System.out.println("Ready: " + reader.ready());

            //Reading the Characters in File
            reader.read(charArray); //Store in charArray after reading
            System.out.println("Data in the Stream: ");
            System.out.print(charArray);

            //Close the Reader
            reader.close();

        } catch (FileNotFoundException e) { //Exception for File
            e.printStackTrace();
        } catch (IOException e) { //Exception for Stream
            e.printStackTrace();
        }



        /*******FILE WRITER*******/

        String wordString = "Hey! Great Example!";
        try {

            Writer writer = new FileWriter("/Users/rgcomendador/Documents/Programming Projects/Intelli J/Java Input Output/hello.txt");

            //Write to File
            writer.write(wordString);

            //Close Writer
            writer.close();

        } catch (FileNotFoundException e) { //Exception for File
            e.printStackTrace();
        } catch (IOException e) { //Exception for Stream
            e.printStackTrace();
        }
    }
}
