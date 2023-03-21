import java.io.File;
import java.io.IOException;

public class FilesAndDirectories {
    public static void main(String[] args) {

        //File
        File f1 = new File("hello.txt");

        try {
            if (f1.createNewFile()) { //Create New File called hello.txt
                System.out.println("File Created: " + f1.getAbsolutePath());
            } else {
                System.out.println("File Already Exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Directory
        File d1 = new File("Test Folder");
        d1.mkdir(); //Create the directory d1

        System.out.println("Created: " + d1.getAbsolutePath());

        //Get All Files in the Directory
        if (d1.isDirectory()) { //Always check if directory or not
            System.out.println(" Directory of: " + d1.getName());

            String[] files = d1.list(); // Returns a String Array of all Files in Directory

            for (int i = 0; i < files.length; i++) {
                File f2 = new File(d1 + "/" + files[i]);

                //Nested Directories
                if (f2.isDirectory()) {
                    System.out.println(files[i] + " is a Directory.");
                } else {
                    System.out.println(files[i] + " is a File.");
                }

            }
        } else {
            System.out.println("Not a Directory.");
        }

        //OTHER FUNCTIONS THAT CAN BE CALLED UNDER FILE CLASS

        System.out.println("Name: " + f1.getName());
        System.out.println("Path: " + f1.getPath());
        System.out.println("Parent: " + f1.getParent());
        System.out.println("Exists: " + f1.exists());
        System.out.println("Is Directory?: " + f1.isDirectory());
        System.out.println("Is File?: " + f1.isFile());
        System.out.println("Size: " + f1.length());
    }
}
