package hw7;

import java.util.ArrayList;
import java.util.List;
import hw7.sync.Mutex;


public class TestMutex {
    
    public int count = 0;
    public Mutex mutex = new Mutex();
    public int iters = 100;

    public void test() {
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < this.iters; ++i) {
            TestMutex cur = this;
            final int j = i;
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    cur.mutex.lock();
                    try {
                        Thread.sleep((j % 5) + 10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    cur.count += 1;
                    cur.mutex.unlock();
                }
            });
            thread.start();
            threads.add(thread);
        }
        for (Thread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (this.count == this.iters) {
            System.out.println("Mutex tests finished successfully");
        } else {
            System.out.println("Mutex tests failed");
        }
    }
}
