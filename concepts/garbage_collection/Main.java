/**
 * Using Garbage Collection in Java 
 * <p>
 *  Garbage Collection (GC) is the proccess of automatically reclaiming memory space
 *  that is no longer used by the Java program.
 * </p>
 */
public class Main {
    public static void main(String[] args) {
        // Create a large array to trigger garbage collection
        for (int i = 0; i < 1000; i++) {
            byte[] array = new byte[1024 * 1024];
        }    
    }
}