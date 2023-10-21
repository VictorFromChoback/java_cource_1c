package hw6.classes;

public class ToClass {
    private String someString;
    private int firstInt;
    private int secondInt;

    public ToClass(String someString, int firstInt, int secondInt) {
        this.someString = someString;
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public String toString() {
        return "someString: " + this.someString + ", Value: " + Integer.toString(this.firstInt);
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

}
