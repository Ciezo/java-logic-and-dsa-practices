import java.util.Random;

public class Arrays {
    
    private int[] array;
    private int SIZE;

    public Arrays(int SIZE) {
        this.SIZE = SIZE;
    }

    public int[] populateArray() {
        Random rand = new Random();
        array = new int[SIZE];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }
        
        return array;
    }

}
