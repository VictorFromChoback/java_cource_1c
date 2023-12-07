package hw7;

import hw7.sync.Semaphore;

public class TestSemaphore {
    public int count = 0;
    public Semaphore semaphore = new Semaphore(2);

    public void test() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Run semaphore tests");
        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    semaphore.acquire();
                    System.out.println("Started thread");
                    Thread.sleep(10);
                    System.out.println("Finished");
                    semaphore.release();    
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread_1 = new Thread(runnable);
        Thread thread_2 = new Thread(runnable);
        Thread thread_3 = new Thread(runnable);
        Thread thread_4 = new Thread(runnable);
        thread_1.start();
        thread_2.start();
        thread_3.start();
        thread_4.start();
        try {
            thread_1.join();
            thread_2.join();
            thread_3.join();
            thread_4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-------------------------------------------------------------------");
    }
}
