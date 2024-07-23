/**
 * Exponential Time complexity 
 * 
 * O (2^n) 
 */
public class ExponentialTime {
    public static void main(String[] args) {
        double base = 2;
        double exponent = 10;
        double result = Math.pow(base, exponent);
        
        System.out.println(result);
    }
}
