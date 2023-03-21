import java.io.*;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {

        InputStream inputstream = new FileInputStream("/Users/rgcomendador/Documents/Programming Projects/Intelli J/Java Input Output/hello.txt");

        int data = inputstream.read();

        while(data != -1) { //after finished reading, it will always return -1
            System.out.print((char) data); //must cast since int data will output ascii numbers of contents in text file

            data = inputstream.read();
        }

        inputstream.close(); //always close after input stream
    }
}
