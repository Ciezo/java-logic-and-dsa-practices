package concepts.functional_interface;

/**
 *
 * SimpleFunctionalInterface
 * A showcase and study about using lambda expressions along with Functional interface
 */
public class SimpleFunctionalInterface {

    /**
     * A declared functional interface using its annotation.
     * A @FunctionalInterface contains only one abstract method
     */
    @FunctionalInterface
    interface DisplayMessages {
        // This is a user-defined functional interface
        // There are built-in functional interfaces in Java
        // such as ActionLister, Runnable, Thread
        void message(String msg);
    }

    /**
     * Main entry point application
     * @param args
     */
    public static void main(String[] args) {
        // Here, we provided a body by using an anonymous class
        DisplayMessages displayMessages = new DisplayMessages() {
            @Override
            public void message(String msg) {
                System.out.println(msg);
            }
        };
        // invoke the message from its parent interface
        displayMessages.message("Hello");


        // But, it is much cleaner to do this with the help of lambda
        DisplayMessages displayMessages2 = (msg) -> {
            // We can see that it is much cleaner with less boilerplate code
            System.out.println(msg);
        };
        // invoke the message from its parent interface
        displayMessages2.message("World");
    }

}
