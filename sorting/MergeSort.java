public class MergeSort {
 


    /**
     * Merging two sub-arrays from arr[]
     * @param arr the main array 
     * @param left the sub-array for left side where arr[left....middle]
     * @param middle the middle point to split the array 
     * @param right the sub-array for right side where [middle + 1....right]
     * 
     * @reference: https://www.geeksforgeeks.org/java-program-for-merge-sort/ 
     *             https://www.w3schools.com/dsa/dsa_algo_mergesort.php 
     *             https://www.programiz.com/java-programming/examples/merge-sort
     */
    public static void merge(int[] arr, int left, int middle, int right) {
        // Length for sub-arrays
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Two sub-arrays from arr[]
        int LEFT[] = new int[n1];        // left[0...middle] 
        int RIGHT[] = new int[n2];          // right[middle + 1...arr.length - 1]
        
        // Copy elements to LEFT[] from arr[0...middle]
        for (int i = 0; i < n1; i++) {
            LEFT[i] = arr[left + i];
        }
        // Copy elements to RIGHT[] from arr[middle + 1...arr.length-1]
        for (int j = 0; j < n2; j++) {
            RIGHT[j] = arr[middle + 1 + j];
        }

        // Indices for the merge arrays on left and right
        int i = 0; 
        int j = 0;
        int k = left;    // initial index, technically 0

        // Merge back LEFT[] and RIGHT[] to the arr[] 
        while(i < n1 && j < n2) {
            if(LEFT[i] <= RIGHT[j]) {
                arr[k] = LEFT[i];   // merge left first
                i++;
            } else {
                arr[k] = RIGHT[j]; // then, merge right 
                j++;
            }

            k++; // increment index pointer to arr[] for allocating space
        }

        while (i < n1) {
            arr[k] = LEFT[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = RIGHT[j];
            j++;
            k++;
        }

    }



    /**
     * Sort the left[] and right[] sub-arrays from the main array[]
     * @param arr the main array[] of type int where two sub-arrays will be generated from
     * @param left starting index of the left[] array to middle point, where left[left...middle]
     * @param right last index of the right[] array from middle point, where right[middle + 1...right] 
     * 
     * @reference: https://www.geeksforgeeks.org/java-program-for-merge-sort/ 
     *             https://www.w3schools.com/dsa/dsa_algo_mergesort.php 
     *             https://www.programiz.com/java-programming/examples/merge-sort
     */
    public static void sort(int[] arr, int left, int right) {
        /**
         * left = arr[0], the left part of the arr[]
         * right = arr[length - 1], the right part of the arr[]
         */
        // Get the middle point to halve the arr[] into two sub-arrays
        int middle = (left + right) / 2;
        System.out.println("\t\tMiddle: " + middle);
        System.out.println("\t\tLeft: " + left);
        System.out.println("\t\tRight: " + right);
        
        // Traverse the array and sort accordingly
        if (left < right) {
            sort(arr, left, middle);           // left[]
            sort(arr, middle + 1, right);     // right[]

            // Merge two-halves, left[] and right[]
            merge(arr, left, middle, right);
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
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Unsorted: ");
        display(arr);

        int leftStartingIndex = 0; 
        int rightStartingIndex = arr.length - 1; 
        sort(arr, leftStartingIndex, rightStartingIndex);

        System.out.println("Sorted: ");
        display(arr);
    }
    
}
