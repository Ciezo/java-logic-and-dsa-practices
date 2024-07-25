public class Quicksort {
    


    /**
     * <p>
     * Partition the unsorted array by defining a lower bound (left side) and 
     * higher bound (right side) based on the selected pivot element.
     * </p>
     * 
     * <p>
     * This method also <b>selects the right most element as pivot element.</b>
     * </p>
     * 
     * @param arr of type int
     * @param lowerBound values less than the pivot element at the left-side  
     * @param higherBound values higher than the pivot element at the right-side
     * @return the position of the partition based on the last update of pivot element
     * 
     * @reference: https://www.programiz.com/java-programming/examples/quick-sort 
     *             https://www.geeksforgeeks.org/java-program-for-quicksort/ 
     *             https://www.javatpoint.com/quick-sort  
     */
    private static int partition(int[] arr, int lowerBound, int higherBound) {
        // Choose the right most element as pivot, arr[length-1]
        int pivot = arr[higherBound];
        // Index to point for values less than pivot element
        int i = (lowerBound-1);
        // Temp variable for swapping
        int temp = 0;

        /** Start traversing each element from left side */
        // Compare each element against pivot element
        // Move lower values to left-side and higher values to right-side
        for(int j = lowerBound; j < higherBound; j++) {
            if (arr[j] <= pivot) {      // If the current element is less than or equal to the pivot
                // Update the index to point at lower values 
                i++;    // ex. -1 + -1 = 0

                /** 
                 * Swap element at i and j 
                 * where i points to lowerbound 
                 * j points to current traversal element at j..j++
                 */
                temp = arr[i];
                arr[i] = arr[j]; 
                arr[j] = temp;      // technically, all lower values are moved to left side
            }
        }

        /**
         * Updating pivot element pointed by i
         * when all value at arr[j] are <= to the pivot element
         */
        int newPivot = arr[i+1];        // select the right most element as pivot
        arr[i+1] = arr[higherBound];    // move by one index to right 
        arr[higherBound] = newPivot;
        
        // Return the partitioning index after updating left-side and right-side
        return (i+1);
    }




    
    /**
     * <p>
     * Arrange elements in an array using quick sort algorithm. 
     * Quick sort is a recursive call to perform sorting of elements in 
     * lower bound (left side) and higher bound (right side) elements of 
     * the array.
     * </p>
     * 
     * <p>
     * This method is choosing the <b>last element as pivot.</b>
     * </p>
     * 
     * <p>
     * A pivot element is used to recursively sort the array wherein 
     * we continously swap elements and update pivot accordingly.
     * </p>
     * 
     * <p>
     * It is important to note that a pivot element has two bounds:
     *  1. Lower bound - where values lower than pivot are inserted to the left side of the array
     *  2. Higher bound - where values greater than pivot are inserted to the right side of the array.
     * </p>
     * 
     * <p>
     * Such that, each recursive call has the following constraint:
     * </p>
     * 
     * <p>
     * <b>arr[i-1] <= arr[i] >= arr[i+1]</b> 
     * </p>
     * 
     * <p>
     * where, 
     * </p>
     * 
     * <p>
     * arr[i] = pivot elemenet
     * arr[i-1] = lower bound element
     * arr[i+1] = higher bound element
     * </p>
     *
     * @param arr of type int
     * @param lowerBound elements lower than the pivot
     * @param higherBound elements higher than the pivot
     * 
     * @reference: https://www.programiz.com/java-programming/examples/quick-sort 
     *             https://www.geeksforgeeks.org/java-program-for-quicksort/ 
     *             https://www.javatpoint.com/quick-sort 
     */
    private static void quickSort(int[] arr, int lowerBound, int higherBound) {
        // Traversal starts from the leftmost part of the array 
        if (lowerBound < higherBound) {
            /** 
             * Partioning to keep updating the pivot element.
             * All values lower than pivot are lowerBound, 
             * while value higher than pivot are higherBound.
             * 
             * Such that, 
             * arr[partionIndex] = pivot element
             * arr[lowerBound] = values less than pivot element 
             * arr[higherBound] = values less than pivot element 
            */
            int partionIndex = partition(arr, lowerBound, higherBound);
    
            /** 
             * Recursive call to keep updating the 
             * swapped elements and pivot 
             */
            // Sort the elements less than pivot to the LEFT SIDE
            quickSort(arr, lowerBound, partionIndex - 1);
            // Sort the elements higher than pivot to the RIGHT SIDE
            quickSort(arr, partionIndex + 1, higherBound);
        }

    }


    
    /**
     * Display an array in a single line
     * @param arr of type int
     */
    private static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    
    public static void main(String[] args) {
        Arrays arr = new Arrays(5);

        int[] unsortedArr = arr.populateIntegerArray();
        System.out.print("Unsorted: ");
        display(unsortedArr);

        int n = unsortedArr.length;
        quickSort(unsortedArr, 0, n-1);
        
        // Assign the overwritten unsortedArr[] to new variable
        int[] sortedArr = unsortedArr;

        System.out.print("Sorted: ");
        display(sortedArr);
    }
}
