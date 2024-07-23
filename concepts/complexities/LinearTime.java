import java.util.LinkedList;

/**
 * Linear Time Complexity 
 * 
 * O(n)
 */
public class LinearTime {
    
    private static int[] arr = {1, 2, 3, 4, 5};
    private static LinkedList<Integer> ll = new LinkedList<>();


    public LinearTime() {
        addElement();
    }


    /**
     * Add element into a LinkedList<Integer>.
     * This method has O(n) or Linear Time complexity 
     * as adding element into the List takes an N amount of time
     * based on the given arr.length
     * 
     * The running time for this method can increase in a linear manner
     * because our input size, N, can also increase. 
     */
    public static void addElement() {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            ll.add(arr[i]);
        }
    }


    public static void main(String[] args) {
        LinearTime linearTime = new LinearTime();
        
        for (int elem : ll) {           // Printing each element using foreach loop is also in O(n)
            System.out.println(elem);
        }    
    }

}
