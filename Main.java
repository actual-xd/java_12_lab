public class Main{
    public static void main(String[] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        Thread t4 = new Thread(new MyRunnable());
        Thread t5 = new Thread(new MyRunnable());
        Thread t6 = new Thread(new MyRunnable());


        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();


        Counter counter = new Counter();
        Thread[] threads = new Thread[10];

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final count: " + counter.getCount());
    }
}

