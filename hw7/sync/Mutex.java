package hw7.sync;

import java.util.concurrent.atomic.AtomicBoolean;


public class Mutex {
    private AtomicBoolean state;

    public Mutex() {
        this.state = new AtomicBoolean(false);
    }

    public void lock() {
        while (state.getAndSet(true)) {
            Thread.yield();
        }
    }

    public void unlock() {
        state.set(false);
    }

}
