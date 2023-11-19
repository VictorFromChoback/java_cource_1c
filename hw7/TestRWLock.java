package hw7;

import hw7.sync.RWLock;

public class TestRWLock {
    private int resource = 0;
    private RWLock rwlock = new RWLock();

    public void test() {
        System.out.println("Run RWLock tests");
        Runnable runnableRead = new Runnable() {
            public void run() {
                rwlock.readLock();
                System.out.println("Read started " + resource);
                System.out.println("Read finished");
                rwlock.readUnLock();
            }
        };
        Runnable runnableWrite = new Runnable() {
            public void run() {
                rwlock.lock();
                System.out.println("Write started ");
                resource += 1;
                System.out.println("Write finished");
                rwlock.unlock();
            }
        };

        Thread read_thread_1 = new Thread(runnableRead);
        Thread read_thread_2 = new Thread(runnableRead);
        Thread read_thread_3 = new Thread(runnableRead);
        Thread read_thread_4 = new Thread(runnableRead);
        
        Thread write_thread_1 = new Thread(runnableWrite);
        Thread write_thread_2 = new Thread(runnableWrite);
        Thread write_thread_3 = new Thread(runnableWrite);

        read_thread_1.start();
        read_thread_2.start();
        write_thread_1.start();
        write_thread_2.start();
        read_thread_3.start();
        read_thread_4.start();
        write_thread_3.start();

        try {
            read_thread_1.join();
            read_thread_2.join();
            write_thread_1.join();
            write_thread_2.join();
            read_thread_3.join();
            read_thread_4.join();
            write_thread_3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
