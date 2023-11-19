package hw7;

public class Main {
    
    public static void main(String[] args) {
        TestMutex testMutex = new TestMutex();
        testMutex.test();
        TestSemaphore testSemaphore = new TestSemaphore();
        testSemaphore.test();
        TestRWLock testRWLock = new TestRWLock();
        testRWLock.test();
    }
}
