package hw7;


public class Main {
    
    public static void main(String[] args) {
        TestSemaphore testSemaphore = new TestSemaphore();
        testSemaphore.test();
        TestRWLock testRWLock = new TestRWLock();
        testRWLock.test();
    }
}
