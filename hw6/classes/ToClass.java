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
        return "someString: " + this.someString 
        + ", firstInt: " + Integer.toString(this.firstInt)
        + ", secondInt: " + Integer.toString(this.secondInt);
    }

    public void setSomeString(String someString) {
        this.someString = someString;
    }

    private void setFirstInt(String someString) {
        this.someString = someString;
    }


    public void setSecondInt(int secondInt) {
        this.secondInt = secondInt;
    }

}
