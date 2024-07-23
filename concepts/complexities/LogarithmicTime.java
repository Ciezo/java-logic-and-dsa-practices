/**
 * Logarithmic Time complexity 
 * 
 * O(log n) 
 */
public class LogarithmicTime {
    public static void main(String[] args) {
        int N = 200;

        /**
         * The operation in this for loop is a
         * Logarithmic time complexity as the runtime 
         * will increase very slowly depending on the input size N
         */
        for(int i = 1; i <= N; i = i*2 ) {
            System.out.println(i);
        }
    }
}
