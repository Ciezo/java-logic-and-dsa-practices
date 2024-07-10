package simple_exercises;

/**
 * Find duplicate number in an array by comparing left and right elements
 */
public class FindDuplicateNumberInArr {
    

    /**
     * Checks if an integer array is empty 
     * @param arr an array of integer type
     * @return true if the array has elements, otherwise false
     */
    public static boolean checkArray(int[] arr) {
        int length = arr.length;
        if (length < 1) 
            return false;
        
        return true;
    }

    /**
     * Returns the duplicate element from the array
     * @param arr an integer type of array 
     * @return the duplicate element, otherwise -1
     */
    public static int findDuplicate(int[] arr) {
        int left, right, duplicate;

        if (checkArray(arr)) {
            // Scan each element of the array
            for (int i = 0; i < arr.length - 1; i++) {          // stops at length - 1 so it won't go overbound
                left = arr[i];              // Store the left element at i
                right = arr[i+1];           // Store the right element at i + 1
    
                // Compare left and right elements 
                if (left == right) {
                    duplicate = left;
                    return duplicate;
                }
            }
        } else {
            System.out.println("Array is empty!");
            return -1;
        }
        
        return -1; 
    }
    

    public static int findDuplicateFromTwoArr(int[] arr_X, int[] arr_Y) {
        int duplicate;

        if (checkArray(arr_X) && checkArray(arr_Y)) {
            // Scan two arrays 
            for (int i = 0; i < arr_X.length; i++) {
                for (int j = 0; j < arr_Y.length; j++) {
                    // Compare each element from top to bottom
                    // Array_X      ....Scanning 
                    // Array_Y      ....Scanning
                    if (arr_X[i] == arr_Y[j]) {
                        duplicate = arr_X[i];
                        return duplicate;
                    }
                    
                }
            }
        } else {
            System.out.println("Array is empty!");
            return -1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5};
        int[] arr2 = {2, 6, 7, 8, 9, 10};
        
        // Get the duplicate from a single array
        System.out.println(findDuplicate(arr));
        
        // Get the duplicate element between two arrays
        System.out.println(findDuplicateFromTwoArr(arr, arr2));
    }

}
