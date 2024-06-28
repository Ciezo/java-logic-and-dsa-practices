package concepts.apie.inheritance;
import java.util.Random;

public class Employee {

    private int empId;
    private String firstName;
    private String lastName;
    private String birthday;


    public Employee(String firstName, String lastName, String birthday) {
        this.empId = setEmpId();
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }


    public int getEmpId() {
        return empId;
    }


    public int setEmpId() {
        Random rand = new Random();
        int key = 2024000000; 
        key = key + rand.nextInt(999999);
        this.empId = key; 
        return empId;
    } 


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getBirthday() {
        return birthday;
    }


    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String toString() {
        return ("Employee Details: " + "\n"
                + "First name: " + firstName + "\n"
                + "Last name: " + lastName + "\n"
                + "Birthday: " + birthday + "\n"
                + "Employee ID: " + empId + "\n"
        );
    }

}
 