package concepts.multi_threading;

class Counter {
    int count = 0;
    synchronized void counter() {
        count++;
    }
} 


class Main {
    public static void main(String[] args) throws InterruptedException{
        Counter count = new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 99; i++) {
                    count.counter();
                }   
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 99; i++) {
                    count.counter();
                }   
            }
        });
        
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 99; i++) {
                    count.counter();
                }   
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();

        int result = count.count;
        System.out.println("Result: " + result);
    }
}