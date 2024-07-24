import java.util.Random;


/**
 * Create and utilize pseudorandom generated Arrays of the following types:
 * int, double
 * 
 * @note The generated random values have a defined bound from 1 to 999
 * 
 */
public class Arrays implements IArrays {
    
    // Types
    private int[] array;
    private double[] arrayD;
    
    // Declared finite size
    private int SIZE;

    // Random instance
    private Random rand = new Random();



    /**
     * Instantiate a pseduorandom Array with a definite size
     * @param SIZE for the array to instantiate
     */    
    public Arrays(int SIZE) {
        this.SIZE = SIZE;
    }

    

    /**
     * Assign pseudorandom values for an integer array with 1000 bound
     */@Override
    public int[] populateIntegerArray() {
        array = new int[SIZE];

        for (int i = 0; i < array.length; i++) 
            array[i] = rand.nextInt(1000);
        
       return array;
    }



    /**
     * Assign pseudorandom values for a double array with 1000.00 bound
     */@Override
    public double[] populateDoubleArray() {
        arrayD = new double[SIZE];

        for (int i = 0; i < array.length; i++) 
            arrayD[i] = rand.nextDouble(1000.00);

        return arrayD;
    }

}
