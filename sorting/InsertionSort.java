public class InsertionSort {
    

    /**
     * Arrange the elements of the array from least to greatest using insertion sort
     * @param arr of type int
     * @return sorted array
     * 
     * @reference: https://www.geeksforgeeks.org/insertion-sort-algorithm/
     *             https://www.programiz.com/dsa/insertion-sort     
     *             https://www.javatpoint.com/insertion-sort-in-java
     */
    private static int[] insertionSort(int[] arr) {
        int n = arr.length;
        int key;

        // Assume the 0th index is sorted so, start with index 1
        for(int i = 1; i < n; i++) {        // compare each key against current element at the next index
            key = arr[i];   // assign the current element to compare against the left side
            int currentIndex = i - 1;       // get the current index to move the scan of the array

            /** 
             * Our array is now moving from arr[0]...arr[i-1]
             * where, currentIndex is assigned as the previous index to compare
             */
            // Compare left side against right side of the array
            // Therefore,
            // arr[0] >= arr[i-1]
            // Assume that at arr[0], the element assigned is sorted
            while (currentIndex >= 0 && arr[currentIndex] > key) {
                arr[currentIndex + 1] = arr[currentIndex];      // swap 
                currentIndex = currentIndex - 1;
            }
            arr[currentIndex + 1] = key;        // assign the key smaller than the swapped element
        }

        return arr;
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
        Arrays arr = new Arrays(3);
        
        int[] unsortedArr = arr.populateIntegerArray();
        System.out.print("Unsorted: ");
        display(unsortedArr);

        int[] sortedArr = insertionSort(unsortedArr);
        System.out.print("Sorted: ");
        display(sortedArr);
        
    }

}
