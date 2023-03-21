import java.io.*;

public class ObjectStreamExample {

    public static void main(String[] args) {

        /*******OBJECT OUTPUT STREAM*******/
        //Sample Object
        EmployeeObject employee1 = new EmployeeObject("Glenn", 1000);

        //Saving Object to Disk
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/rgcomendador/Documents/Programming Projects/Intelli J/Java Input Output/ObjectStreamExample.txt");

            //Creating Object Output Stream
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Writing Objects to the Output Stream
            objectOutputStream.writeObject(employee1);

            //Close Stream
            objectOutputStream.close();
            fileOutputStream.close();

        }  catch (FileNotFoundException e) { //Exception for File
            e.printStackTrace();
        } catch (IOException e) { //Exception for Stream
            e.printStackTrace();
        }



        /*******OBJECT INPUT STREAM*******/
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/rgcomendador/Documents/Programming Projects/Intelli J/Java Input Output/ObjectStreamExample.txt");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //Read Objects from the Disk
            EmployeeObject employeeReceived = (EmployeeObject) objectInputStream.readObject();

            System.out.println("Employee Name: " + employeeReceived.name);
            System.out.println("Salary: " + employeeReceived.salary);

            //Close Stream
            objectInputStream.close();
            fileInputStream.close();

        } catch (FileNotFoundException e) { //Exception for File
            e.printStackTrace();
        } catch (IOException e) { //Exception for Stream
            e.printStackTrace();
        } catch (ClassNotFoundException e) { //Exception for readObject()
            e.printStackTrace();
        }

    }
}
