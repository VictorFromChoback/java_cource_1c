package hw7.sync;

public class RWLock {
    
    private Mutex mutex = new Mutex();
    private int readCount = 0;
    private boolean writeState = false;

    public void readLock() {
        mutex.lock();
        while (writeState && readCount == 0) {
            mutex.unlock();
            Thread.yield();
            mutex.lock();
        }
        if (!writeState) {
            writeState = true;
            readCount = 1;
        } else {
            readCount += 1;
        }
        mutex.unlock();
    }

    public void readUnLock() {
        mutex.lock();
        if (readCount == 1) {
            writeState = false;
            readCount = 0;
        } else {
            readCount -= 1;
        }
        mutex.unlock();
    }

    public void lock() {
        mutex.lock();
        while (writeState) {
            mutex.unlock();
            Thread.yield();
            mutex.lock();
        }
        writeState = true;
        mutex.unlock();
    }

    public void unlock() {
        mutex.lock();
        writeState = false;
        mutex.unlock();
    }
}
