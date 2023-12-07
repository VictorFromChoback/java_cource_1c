package hw7.sync;

public class RWLock {
    
    private int readCount = 0;
    private boolean writeState = false;

    public synchronized void readLock() {
        while (writeState && readCount == 0) {
            try {wait();} catch (InterruptedException e) {e.printStackTrace();}
        }
        if (!writeState) {
            writeState = true;
            readCount = 1;
        } else {
            readCount += 1;
        }
        notify();
    }

    public synchronized void readUnLock() {
        if (readCount == 1) {
            writeState = false;
            readCount = 0;
        } else {
            readCount -= 1;
        }
        notifyAll();
    }

    public synchronized void lock() {
        while (writeState) {
            try {wait();} catch (InterruptedException e) {e.printStackTrace();}
        }
        writeState = true;
        notifyAll();
    }

    public synchronized void unlock() {
        writeState = false;
        notifyAll();
    }
}
