import java.io.Serializable;

public class EmployeeObject implements Serializable {

    //For every Class or Object, you need to save it to Disk.
    //ALWAYS implement the Serializable Interface

    String name;
    int salary;

    public EmployeeObject(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
}
