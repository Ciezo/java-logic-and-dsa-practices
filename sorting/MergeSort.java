public class MergeSort {
 
    public static void merge(int[] arr, int left, int middle, int right) {

    }



    /**
     * Sort the left[] and right[] sub-arrays from the main array[]
     * @param arr the main array[] of type int where two sub-arrays will be generated from
     * @param left starting index of the left[] array to middle point, where left[left...middle]
     * @param right last index of the right[] array from middle point, where right[middle + 1...right] 
     */
    public static void sort(int[] arr, int left, int right) {
        /**
         * left = arr[0], the left part of the arr[]
         * right = arr[length - 1], the right part of the arr[]
         */
        // Get the middle point to halve the arr[] into two sub-arrays
        int middle = (left + right) / 2;
        
        // Traverse the array and sort accordingly
        if (left < right) {
            sort(arr, left, middle);           // left[]
            sort(arr, middle + 1, right);     // right[]

            // Merge two-halves, left[] and right[]
            merge(arr, left, middle, right);
        }
    }

    public static void main(String[] args) {
        
    }
    
}
