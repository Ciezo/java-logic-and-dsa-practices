public class SelectionSort {
    


    /**
     * Sort the elements of the array using Selection Sort.
     * Selects the lowest value in the array, and moves it in front of the array. 
     * @param arr 
     * @return sorted array
     * 
     * @reference: https://www.geeksforgeeks.org/selection-sort-algorithm-2/
     */
    private static int[] selectionSort(int[] arr) {
        int n = arr.length;
        int temp = 0;

        /** Iterate through each element */
        for (int i = 0; i < (n-1); i++) {
            /** Finding the minimum value by i+1 */
            for (int j = i+1; j < n; j++) {
                int min = i;
                if (arr[j] < arr[min]) {        // Compare each element such that, arr[i+1] < arr[i]
                    // Assign the index of the minimum value 
                    min = j;
                }

                // Swap the minimum value index to the current index i
                temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
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
        Arrays arr = new Arrays(8);
        
        int[] unsortedArr = arr.populateIntegerArray();
        System.out.print("Unsorted: ");
        display(unsortedArr);

        int[] sortedArr = selectionSort(unsortedArr);
        System.out.print("Sorted: ");
        display(sortedArr);
        
    }
}
