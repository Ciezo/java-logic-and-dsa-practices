/**
 * @author Cloyd Van Secuya
 * 
 * 
 * <p>
 * <b>List</b> in Java is an interface that allows engineers to create an
 * <b>ordered collection</b> or a sequence. This interface helps engineers 
 * to insert element wherever they please.
 * 
 * This can be done by doing the List.add(i, e) method where i = index and e = element in int type 
 * </p>
 * 
 * <p>
 * Lists allow duplicate elements, and a user can access its elements using 
 * the integer index (pointing to the position of a specific element).
 * 
 * It allows duplicate elements. 
 * </p>
 * 
 * <p>
 * Again, the List interface is an extension of the Collections class, and it is used to 
 * store collections where duplicates are allowed and elements are accessed by index.
 * </p>
 */
package main.java.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Lists {
    
    static List<Integer> oneDim = new ArrayList<>();        // 1-D 

    /**
     * This is a "List of list", 2D list where each row is another List.
     * https://www.geeksforgeeks.org/java/how-to-iterate-over-a-2d-list-or-list-of-lists-in-java/ 
     */
    static List<List<Integer>> twoDim = new ArrayList<List<Integer>>();
    
    static Random r = new Random();
    
    /**
     * Populate the List<Integer> with random integer numbers depending on the size
     * @param size the allocated capacity of the List
     * @param range the range of an individual element inside the List 
     * @return populated List<Integer> with full numbers inside  
     */
    public static List<Integer> populate(int size, int range) {
        List<Integer> temp = new ArrayList<>();
        r.nextInt(range);

        for (int i = 0; i < size; i++) {
            int elem = r.nextInt(range);
            temp.add(elem);
        }

        return temp;
    }

    /**
     * Populate a 2-D array (matrix) with random integer values depending on the specified table size.
     * @param rowSize the number of rows from index 0...n as a plot of X-axis
     * @param colSize the number of cols from index 0...n as a plot of Y-axis
     * @param range the scale of the number element to be used as part of the matrix
     * @return populated matrix List<List<Integer>> with full integers inside
     */
    public static List<List<Integer>> populateMatrix(int rowSize, int colSize, int range) {
        List<List<Integer>> graph = new ArrayList<List<Integer>>();

        for(int i = 0; i < rowSize; i++) {
            /** To fill in a matrix of a "List-of-List", we need to create a row List */
            List<Integer> row = new ArrayList<>();      // row (or the first List)
            /** Next, we loop through the row filling in each index then move downward to the next col */
            for (int j = 0; j < colSize; j++) {
                int elem = Integer.valueOf(r.nextInt(range));
                // Here, fill in the row 
                row.add(j, elem);
            }
            // Once, the row is filled. Add it to the matrix (graph)
            graph.add(row);
        }

        return graph;

    }

    public static void main(String[] args) {
        oneDim = populate(10, 100);        
        Collections.sort(oneDim);

        twoDim = populateMatrix(2, 10, 10);

        for (int e : oneDim) {
            System.out.println(e);
        }

        for (List<Integer> row : twoDim) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
