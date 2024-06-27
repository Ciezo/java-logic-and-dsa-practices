package main.java.override_overload;

// Demonstrate overloading
public class c {
        
    public static int getAge(int age) {
        return age;
    }

    public static String getAge(String age) {
        return age;
    }

    public static void main(String[] args) {
        a a = new a();
        String msg = a.getMsg("Hello, World!");
        String myName = a.getName();
        
        System.out.println("Message: " + msg);
        System.out.println("Name: " + myName);

        System.out.println(getAge(22));
        System.out.println(getAge("22"));
    }

}
