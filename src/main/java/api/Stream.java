/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 * `java.util.stream` is an internal Java API that is used to efficiently filter, map, and reduce large streams of data. 
 * According to Oracle,  streams do not provide a means to directly access or manipulate their elements, and are instead concerned with 
 * declaratively describing their source and the computational operations which will be performed in aggregate on that source.
 * 
 * This means that the stream API is focused solely on how to effectively process huge amounts of data sources. 
 * Remember that in Streams, the use of Java lambda expressions are effective!
 * </p>
 * 
 * <p>
 * A given scenario for better understanding....
 * 
 * A good example will be a large Employee ArrayList with thousands of Employee objects. 
 * Now, when we want to sift through the total salary of Employees from "RDD" department then, 
 * we can use the filter() to get the department name and sum() the results. 
 * </p>
 * 
 * <p>
 * References: 
 * https://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html 
 * https://mylearn.oracle.com/ou/course/overview/79727/110389 
 * </p>
 */

package main.java.api;



import java.util.ArrayList;
import java.util.Random;
import java.util.*;



class Order {
    private String name; 
    private int cost; 
    
    /**
     * Default constructor
     */
    public Order() {
        
    }
    
    /**
     * Create an Order object with name and assigned cost
     * @param name : `String`   assigns an order name 
     * @param cost : `Integer`  assigns an order cost
     */
    public Order(String name, int cost) {
        this.name = name;
        this.cost = cost; 
    }
    
    /** 
     * Returns the order name 
     * @return name : `String`
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Returns the order cost 
     * @return cost : `Integer`
     */
    public int getCost() {
        return this.cost; 
    }
    
    /**
     * Assigns an order name
     * @param name : `String`   the name of an order 
     */
    public void setOrderName(String name) {
        this.name = name; 
    }
    
    /**
     * Assigns an order cost 
     * @param cost : `Integer`  the cost of an order
     */
    public void setOrderCost(int cost) {
        this.cost = cost; 
    }
}


/**
 * Main program 
 */
public class Stream {

    /**
     * Main application entry-point
     */
	public static void main(String[] args) {
	    Order order = new Order();
		ArrayList<Order> orders = new ArrayList<>();
		int SIZE = 10;
		
		// Populate
		for (int i = 0; i < SIZE; i++) {
		  //  String tempName = (String) "burger " + Integer.valueOf(i);
		    Random r = new Random();
		    orders.add(new Order("burger", r.nextInt(100) + 1));
		}
		
		// Display 
		for (Order o : orders) {
		    System.out.println(o.getName() + " " + o.getCost());
		}
		
		int sumOfAllOrders = orders.stream()
		                        .filter((o) -> o.getName() == "burger")       // this is a lambda expression....it can be seen that the o object refers to Order class
		                        .mapToInt((o) -> o.getCost())
		                        .sum();
		                        
		System.out.println("Sum of all orders: " + sumOfAllOrders);
		
	}
}



