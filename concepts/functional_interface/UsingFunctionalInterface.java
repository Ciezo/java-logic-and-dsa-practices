package concepts.functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;

/**
 *
 * UsingFunctionalInterface.
 * Complex uses with user defined functional interfaces and its body through lambda
 */
public class UsingFunctionalInterface {

    /**
     *
     * Operations.
     * A functional interface that contains one sum abstract method
     */
    @FunctionalInterface
    public interface Operations {
        int sum(int x, int y);
    }

    /**
     *
     * DisplayAndRender
     * Another functional interface that contains a single method
     */
    @FunctionalInterface
    public interface DisplayAndRender {
        void display(String msg);
    }

    /**
     *
     * AverageOperation
     * Perform average = summation / n
     */
    @FunctionalInterface
    interface AverageOperation {
        double average(int[] elems);
    }

    /**
     * Add and get the sum for two values
     * @param x first value
     * @param y second value
     * @return the sum = x + y
     */
    public static int computeForSum(int x, int y) {
        // Here, the body of the functional interface is provided.
        // Lambda expressions are a good use with @FunctionalInterface
        // The syntax is like this: (arguments) -> { statements }
        Operations add = (val1, val2) -> {
            int result = val1 + val2;
            return result;
        };

        // Then, we invoke the method here that returns the result from Operations.sum(int x, int y)
        return add.sum(x, y);
    }

    /**
     * Add and get the sum for two values
     * @param x first value
     * @param y second value
     * @param add the proceeding lambda add operation for Operations.sum(int x, int y)
     * @return the sum = x + y
     */
    public static int computeForSum(int x, int y, Operations add) {
        // Here, the body for Operations is not implemented inside this.
        // But, we pass it as an argument
        return add.sum(x, y);
    }

    /**
     * Gets the sum of two values
     * @param x the value to add against y
     * @param y the value to add against x
     * @return the sum = x + y
     */
    public static int addForSum(int x, int y) {
        // This is a traditional statement without using functional interfaces nor lambda
        return x + y;
    }

    /**
     * Double the given value by multiplying it to 2
     * @param x the value to double
     * @return the result of x * 2
     */
    public static int doubleNumber(int x) {
        // This is a traditional statement without using functional interfaces nor lambda
        return x * 2;
    }

    /**
     * Double the given value by multiplying to 2
     * @param x the value to double
     * @param operation the lambda expression for (value) -> {x * 2}
     * @return
     */
    public static int doubleNumber(int x, Function<Integer, Integer> operation) {
        return operation.apply(x);
    }

    /**
     * Display a message
     * Utilize the Consumer<String> to perform accept() in printing the message
     * @param msg the string value to display
     */
    public static void display(String msg) {
        // Here, we provide the type String to Consumer<T>
        // as its expected argument type to accept
        Consumer<String> method = (val) -> {
            // Then, using lambda expressions the implementatio is supplied
            System.out.println("Consumer1");
            System.out.println(val);
        };
        // Lastly, we execute and perform the lambda by accept()
        // But, this does not return any value unlike Function<T, R>
        method.accept(msg);
    }

    /**
     * Display a message.
     * Supply a lambda expression for implementation
     * @param msg the string value to display
     * @param view the implementation for {@link DisplayAndRender#display(String)}
     */
    public static void display(String msg, DisplayAndRender view) {
        view.display(msg);
    }

    /**
     * Compute for average.
     * Utilize the AverageOperation functional interface
     * @param elems the series to compute for average
     * @return the computed average
     */
    public static double computeAverage(int[] elems) {
        // the values lambda argument becomes an array if it is supplied
        // with an array type
        AverageOperation ave = (values) -> {
            int sum = 0;
    	    for (int i = 0; i < values.length; i++) {
    	        sum += values[i];
    	    }

    	    return sum / values.length;
        };

        return ave.average(elems);
    }

    /**
     * Compute for the average.
     * Supply the implementation for AverageOperation through argument operation
     * @param elems the series to compute for average
     * @param operation the implementation for {@link AverageOperation#average(int[])}
     * @return the computed average
     */
    public static double computeAverage(int[] elems, AverageOperation operation) {
        return operation.average(elems);
    }

    /**
     * Main entry application
     * @param args
     */
    public static void main(String[] args) {
        final int VALUE_X = 10;
        final int VALUE_Y = 30;

        // In sum1, we don't provide the body for the functional interface
        // because Operations is done inside the method hence, only
        // VALUE_X and VALUE_Y are provided
        int sum1 = computeForSum(VALUE_X, VALUE_Y);
        System.out.println("Sum 1: " + sum1);

        // In sum2, the functional interface is provided as an argument.
        // Its implementation is expressed as a lambda expression
        int sum2 = computeForSum(VALUE_X, VALUE_Y, (x, y) -> {
            int result = x + y;
            return result;
        });
        System.out.println("Sum 2: " + sum2);

        // In result1, we expressed the Function<Integer, Integer> as an argument provided
        // to the doubleNumber method, and it is the same as a functional interface.
        // A Function<T, R> only accepts one input and returns one result
        int result1 = doubleNumber(VALUE_X, (value) -> {
            int product = value * 2;
            return product;
        });
        System.out.println("Result 1: " + result1);

        // In result2, we simply declared a Function<T, R> type and supplied
        // its implementation as a simple lambda expression where
        // (x) -> x * 2
        Function<Integer, Integer> timesTwo = (x) -> x * 2;
        int result2 = timesTwo.apply(VALUE_X);  // Using the apply() call, we perform the to get the result for the given argument x
        System.out.println("Result 2: " + result2);

        // In the code below, it can be seen that
        // Consumer<T> class is used to perform and accept
        // a String type as an input without returning a value unlike Function
        display("Hello from Consumer!");

        // In another code below, we supply the Consumer<String> implementation
        // as an argument to the method. This is done so it can fulfill
        // the contract for DisplayAndRender#view
        display("Hello from Consumer2!", (value) -> {
            System.out.println("Consumer 2");
            System.out.println(value);
        });

        int[] elems = {10, 20, 30, 40};
        double result3 = computeAverage(elems);
        double result4 = computeAverage(elems, (values) -> {
            int sum = 0;
            for (int i = 0; i < values.length; i++) {
                sum += values[i];
            }
            return sum / values.length;
        });

        System.out.println("Result 3 (Average): " + result3);
        System.out.println("Result 4 (Average): " + result4);
    }

}
