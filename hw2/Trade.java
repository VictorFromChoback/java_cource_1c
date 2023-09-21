package hw2;

public abstract class Trade {
    public int price;

    public Trade(int price) {
        this.price = price;
    }

    public final void log() {
        System.out.format("Class name: %s\n", getClass().getName());
        System.out.format("Trade price: %d\n", price);
    }

}
