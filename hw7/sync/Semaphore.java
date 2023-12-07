package hw7.sync;


public class Semaphore {
    private int tokens;

    public Semaphore(int size) {
        this.tokens = size;
    }

    public synchronized void acquire() {
        while (this.tokens == 0) {
            try {wait();}
            catch (InterruptedException e) {System.out.print("Here"); e.printStackTrace();}
        }
        this.tokens -= 1;
    }

    public synchronized void release() {
        this.tokens += 1;
        notify();
    }
}
