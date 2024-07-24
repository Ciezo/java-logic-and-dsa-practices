/**
 * Three different solutions in bubble sort
 */
public class BubbleSort {
    


    /**
     * Sort the elements of the array from least to greatest using Bubble Sort.
     * This method also checks if there are swapping in-between elements. 
     * If there are not swapping then, it assumes the array is already sorted
     * @param arr of type int
     * @return sorted array
     * 
     * @reference: https://www.geeksforgeeks.org/bubble-sort-algorithm/
     */
    private static synchronized int[] bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        boolean swapped;

        if (n < 1) {
            System.out.println("Array is empty!");
            return null;
        }        
        
        for(int i = 0; i < (n-1); i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {        // if the next element > current element then, swap
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }

        
        return arr;
    }



    /**
     * Arrange the elements in least to greatest using Bubble Sort.
     * This method does not check for swapping in-between variables, 
     * meaning, it will still sort an already sorted array
     * @param arr of type int 
     * @return sorted array
     */
    private static synchronized int[] bubbleSort2(int[] arr) {
        int n = arr.length;
        int temp = 0; 

        for (int i = 0; i < (n-1); i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) { 
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        return arr;
    }



    /**
     * Sort an array from least to greatest using Bubble Sort.
     * This method uses a single for-loop and does not check for 
     * swapping in between variables
     * @param arr of type int 
     * @return sorted array
     */
    public static synchronized int[] bubbleSort3(int[] arr) {
        int n = arr.length;
        int temp = 0; 

        for(int i = 0; i < (n-1); i++) {
            if (arr[i+1] < arr[i]) {
                temp = arr[i+1];
                arr[i+1] = arr[i];
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

    

    public static void main(String[] args) throws InterruptedException {
        // Create a random filled array 
        Arrays array = new Arrays(6);
        // Assign random array with pseudorandom elements
        int[] unsortedArr = array.populateIntegerArray();
        
        Thread t1 = new Thread(new Runnable() {
           @Override
           public void run() {
                int[] sortedArr = bubbleSort(unsortedArr);
                display(sortedArr);
                System.out.println();
           } 
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                 int[] sortedArr = bubbleSort2(unsortedArr);
                 display(sortedArr);
                 System.out.println();
            } 
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                 int[] sortedArr = bubbleSort3(unsortedArr);
                 display(sortedArr);
                 System.out.println();
            } 
        });


        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

    }
}