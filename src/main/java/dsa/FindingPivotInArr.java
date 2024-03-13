/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * A pivot (or pivot element) is a "middle value" which is selected first 
 * by an algorithm or sorting methods. It is essentially used to start a
 * computational series or data analysis. 
 * </p>
 * 
 * <p>
 * The concept of “pivot” in computer science primarily falls into 
 * the domain of algorithms, specifically related to 
 * sorting, searching, and numerical computations. 
 * </p>
 * 
 * <p>
 * Common similarities are shared between a pivot and median value. 
 * In statistics, a median is defined as a "value in the middle" in a data set.
 * While, in computer science, a pivot is used during 
 * sorting algorithms and numerical computations. 
 * 
 * <b>A pivot is an element that is used to partition data</b>
 * </p>
 * 
 * <p>
 * Finding a pivot element is commonly used in Quicksort algorithm.
 * </p>
 * 
 * <p>
 * References:
 * https://stackoverflow.com/questions/73702009/finding-the-pivot-point-for-the-given-array-java
 * <a href="https://shorturl.at/hmnK0">Calculating the median value</a>
 * </p>
 */
package main.java.dsa; 

public class FindingPivotInArr {

    private static int[] dataSet = {1, 7, 3, 6, 5, 6};


    /**
     * Gets the pivot from an input of array by 
     * getting the sum of left side and right side.
     * If, both left side and right side are equal 
     * assign a pivot value and return it. 
     * @param arr
     * @return pivot element
     */
    private static int getPivotFromArr(int[] arr) {
        // Initialize the pivot from the first element in the array
        int pivot = arr[0];     
        // I chose the firstmost element from the arr as a pivot before partitioning 

        // Left and right pointers
        int left = 0;                       // moves right (left++)
        /** Move left from the start of the array towards the right until 
         * you find an element GREATER THAN or equal to the pivot. */



        int right = arr.length - 1;         // moves left (right--)
        /** Move right from the end of the array towards left until 
         * you find an element LESS THAN or equal to the pivot. */


        /**
         * Partitioning the array */
        // Scan the array from both ends (left and right)
        if(left < right) {
            // Move towards right using left pointer...
            if(left < right && arr[left] <= pivot) {
                left++;
            } 

            // Move towards left using right pointer...
            if(right < left && arr[right] <= pivot) {
                right--;
            }

            // Swap elements in the partitioning process
            /**
             * Here we check if the left pointer has not crossed
             * the right pointer.
             * 
             * The goal here is to assign elements on the left side
             * which are less than or equal to the pivot.
             * And, on the right, elements are assigned which are 
             * greater than or equal to the pivot element.
             * 
             * 
             * TLDR: 
             * - left side HAS ELEMENTS LESS THAN OR EQUAL THAN PIVOT 
             * - right side HAS ELEMENTS GREATHER THAN OR EQUAL THAN PIVOT
             */
            System.out.println("Swapping...");
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            } 

        }

        /**
         * Finally, after the partitioning process..*/
        // Place the pivot in its correct position
        // base on the left and right pointers
        System.out.println("Last updated pointers....");
        System.out.println("Left: " + arr[left]);
        System.out.println("Right: " + arr[right]);

        pivot = arr[left];
        return pivot;
    }


    public static void main(String[] args) {
        int myPivot = getPivotFromArr(dataSet);
        System.out.println("My Pivot Element: " + myPivot);
    }
    
}