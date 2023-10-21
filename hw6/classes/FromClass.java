package hw6.classes;

public class FromClass {
    private String someString;
    private int firstInt;
    private int secondInt;

    public FromClass(String someString, int firstInt, int secondInt) {
        this.someString = someString;
        this.firstInt = firstInt;
        this.secondInt = secondInt;
    }

    public String getSomeString() {
        return this.someString;
    }

    public int getFirstInt() {
        return this.firstInt;
    }

}
