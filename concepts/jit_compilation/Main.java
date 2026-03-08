package concepts.jit_compilation;

import java.util.Random;

public class Main {

    static void display(int[] arr) {
        System.out.println("[");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        final int SIZE = 50000;
        int[] arr = new int[SIZE];
        Random r = new Random();
        
        for (int i = 0; i < SIZE; i++) {
            arr[i] = r.nextInt(1000);
        }

        display(arr);

    }
}