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
    
    static List<Integer> intLs1D = new ArrayList<>();        // 1-D 
    static List<List<Integer>> intLs2D = new ArrayList<>();  // 2-D 
    
    /**
     * Populate the List<Integer> with random integer numbers depending on the size
     * @param size the allocated capacity of the List
     * @param range the range of an individual element inside the List 
     * @return populated List<Integer> with full numbers inside  
     */
    public static List<Integer> populate(int size, int range) {
        List<Integer> temp = new ArrayList<>();
        Random r = new Random();
        r.nextInt(range);

        for (int i = 0; i < size; i++) {
            int elem = r.nextInt(range);
            temp.add(elem);
        }

        return temp;
    }

    public static void main(String[] args) {
        intLs1D = populate(10, 100);        
        Collections.sort(intLs1D);

        for (int e : intLs1D) {
            System.out.println(e);
        }
    }
}
