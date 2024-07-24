package concepts.apie.encapsulation;

public class Student extends User {
    
    private int studentNumber; 

    public Student() {}

    public Student(
        String firstName, String lastName, String birthday,     // from User class
        int studentNumber
        ) {
            super(firstName, lastName, birthday);
            this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

}
