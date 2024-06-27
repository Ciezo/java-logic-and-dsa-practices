package main.java.override_overload;

// Demonstrate the Overriding of Parent class 
public class Main {
    
    
    public static void main(String[] args) {
        Parent p = new Parent();
        
        // During run-time the methods of Parent class 
        // will be overridden by SubclassA and SubclassB

        p.display();            // This should display "Hello, world!"

        p = new SubclassA();    // Parent class is overriden by its child class, SubclassA
        p.display();            // Now, in run-time it will display "Hello from SubclassA"

        p.display();            // This will output into "Hello from SubclassB"

        
        Animal animal = new Animal();

        animal.makeSound();     // This should display "Animal makes sound!"

        animal = new Dog();     // Dog class overrides

        animal.makeSound();     // Output now is "Dog barks! Arf! Arf!"


        /** 
         * Interfaces and overriding. 
         * In this section, I also performed multi-level inheritance
        */
        ChildA childA = new ChildA();
        childA.speak();             // Output is "ChildA"

        childA = new ChildAa();     // Override with ChildAa class
        childA.speak();             // Output here is "ChildAa" as implemented with the overridden method

        ChildB childB = new ChildB();       
        childB.speak();             // Output is "ChildB"

        childB = new ChildBb();     // Override with ChildBb class
        childB.speak();             // Output is "ChildBb"
    
    }
}
