/**
 * Constant Time Complexity 
 * 
 * O(1)
 */
public class ConstantTime {

    private static int[] arr = {1, 2, 3, 4, 5};

    /**
     * Returns the element of an integer array at a specified index.
     * Accessing the given element takes a constant time, O(1), 
     * where the given input size does not matter
     * @param index
     * @return specified element from the array
     */
    public static int getElement(int index) {
        return arr[index];
    }

    public static void main(String[] args) {
        System.out.println(getElement(2));
    }

}