package simple_exercises;



/**
 * Input: arr[] = {1, 2, 4, 6, 3, 7, 8} , N = 8
 * Output: 5
 * Explanation: Here the size of the array is 8, so the range will be [1, 8]. The missing number between 1 to 8 is 5
 * 
 * Input: arr[] = {1, 2, 3, 5}, N = 5
 * Output: 4
 * Explanation: Here the size of the array is 4, so the range will be [1, 5]. The missing number between 1 to 5 is 4
 */
public class FindMissingNumberInArr {
    
    /**
     * Returns the missing number from the array 
     * @param arr an integer array of any given size
     * @param n the supposed range where [1, N] 
     * @return the missing number
     */
    public static int findMissingNum(int[] arr, int n) {
        int[] tempArr = new int[n + 1];     // create a hash

        // Create a copy of the array by following its frequencies
        for (int i = 0; i < n - 1; i++) {
            tempArr[arr[i]]++;
        }

        // Scan the array and find the missing element
        // Start from [1, N] 
        // 1...i++....N
        for (int i = 1; i <= n; i++) {
            if (tempArr[i] == 0) {
                return i;
            }
        }

        return -1;
    }


    /**
     * Using the summation technique, where first N natural numbers is given by the formula N * (N + 1) / 2
     * We compute a sum from all the elements of the array, and use the formula to find the expected sum
     * then, return the missing number based on the difference between expected sum and sum of array
     * @param arr an integer array 
     * @param n the supposed range (limit) where [1, N]
     * @return missing number if any
     */
    public static int findMissingNumUsingSummation(int[] arr, int n) {
        int sum = 0;
        int expectedSum = (n * (n + 1)) / 2;

        // Get all sum of the array 
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        // Return the missing number
        return expectedSum - sum;
    }

    
    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5};
        int n = 5;

        System.out.println(findMissingNum(arr, n));
        System.out.println(findMissingNumUsingSummation(arr, n));
    }
}
