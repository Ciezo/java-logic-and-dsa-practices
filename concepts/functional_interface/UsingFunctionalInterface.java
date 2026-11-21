package concepts.functional_interface;

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
     * Add and get the sum for two values
     * @param x first value
     * @param y second value
     * @return the sum = x + y
     */
    public int computeForSum(int x, int y) {
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
    public int computeForSum(int x, int y, Operations add) {
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
    public int addForSum(int x, int y) {
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
     * Main entry application
     * @param args
     */
    public static void main(String[] args) {
        final int VALUE_X = 10;
        final int VALUE_Y = 30;

        int result1 = doubleNumber(VALUE_X, (value) -> {
            int product = value * 2;
            return product;
        });
        System.out.println("Result 1: " + result1);

        Function<Integer, Integer> timesTwo = (x) -> x * 2;
        int result2 = timesTwo.apply(VALUE_X);
        System.out.println("Result 2: " + result2);
    }

}
