package concepts.apie.inheritance;
public class Main {
    public static void main(String[] args) {
        /**  Define an Employee */
        Employee emp = new Employee("Cloyd Van", "Secuya", "February 27, 2002");
        // Get Employee Details
        System.out.println(emp.toString());
    
        /** Define a Manager */
        Manager mangr = new Manager("Ciezo", "Sugondese", "February 27, 2002", "Software Engineering", "Manila");
        // Get Manager details
        System.out.println(mangr.toString());
    }
}
