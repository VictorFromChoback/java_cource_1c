package hw7.sync;


public class Semaphore {
    private int tokens;
    private Mutex mutex;

    public Semaphore(int size) {
        this.mutex = new Mutex();
        this.tokens = size;
    }

    public void acquire() {
        this.mutex.lock();
        while (this.tokens == 0) {
            this.mutex.unlock();
            Thread.yield();
            this.mutex.lock();
        }
        this.tokens -= 1;
        this.mutex.unlock();
    }

    public void release() {
        this.mutex.lock();
        this.tokens += 1;
        this.mutex.unlock();
    }

}
