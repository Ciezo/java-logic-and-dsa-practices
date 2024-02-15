/**
 * @author Cloyd Van Secuya
 * 
 * <p>
 *  <b>HashMaps</b> are key-value pairs. 
 * </p>
 */
package main.java.dsa;

import java.util.HashMap;


public class HashMaps {
    
    // capital, country
    // String, String
    private static HashMap<String, String> countriesCapital = new HashMap<>();
    
    // id, name
    // int, String
    private static HashMap<Integer, String> userDetails = new HashMap<>();

    public static void main(String[] args) {
        countriesCapital.put("Manila", "Philippines");
        countriesCapital.put("Beijing", "China");
        countriesCapital.put("Paris", "France");
        countriesCapital.put("New Delhi", "India");


        String[] users = {
            "Cloyd Van Secuya", 
            "Chariz Valerie Secuya", 
            "Nueva Samindao Secuya", 
            "Clemente Manubag Secuya", 
            "Pluto the dog", 
            "Venus the dog", 
            "Chaplin the cat", 
            "Sugondese Nuts", 
            "Cheese balls",
            "Cheese rings"
        }; // insert all keys and users values using for-loop respectively
        for(int i = 0; i < 10; i++) { userDetails.put(i, users[i]); }



        // Output
        System.out.println(countriesCapital);
        System.out.println(userDetails);
    }
}