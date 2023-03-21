import java.io.*;

public class OutputStreamExample {

    public static void main(String[] args) {

        //Data for File
        String data = "Hello Friends! I'm reviewing Java!";

        //Writing Data for File
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("/Users/rgcomendador/Documents/Programming Projects/Intelli J/Java Input Output/OutputStreamExample.txt");


        //Converts String to Bytes
        byte[] dataBytes = data.getBytes();

        //Write to File
        outputStream.write(dataBytes);
        System.out.println("Data has been Written.");

        //Close Output Stream
        outputStream.close();
        
        } catch (FileNotFoundException e) { //Exception for File
            e.printStackTrace();
        } catch (IOException e) { //Exception for Stream
        e.printStackTrace();
    }
    }
}
