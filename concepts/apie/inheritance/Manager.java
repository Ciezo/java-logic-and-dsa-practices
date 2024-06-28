package concepts.apie.inheritance;
public class Manager extends Employee {
    
    private String department;
    private String branchLocation;

    public Manager(
        String firstName, String lastName, String birthday, 
        String department, String branchLocation
        ) {
            super(firstName, lastName, birthday);
            this.department = department;
            this.branchLocation = branchLocation;
        }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBranchLocation() {
        return branchLocation;
    }

    public void setBranchLocation(String branchLocation) {
        this.branchLocation = branchLocation;
    }


    @Override
    public String toString() {
        return ("Manager Details: " + "\n"
                + "First name: " + super.getFirstName() + "\n"
                + "Last name: " + super.getLastName() + "\n"
                + "Birthday: " + super.getBirthday() + "\n"
                + "Employee ID: " + super.getEmpId() + "\n"
                + "Department Assigned: " + department + "\n"
                + "Branch Location: " + branchLocation + "\n"
        );
    }
    
}
 