package hw2;

import hw2.classes.CarType;

public abstract class AbstractSolution {
    
    public CarType carType;
    public int price;

    public AbstractSolution(CarType carType, int price) {
        this.carType = carType;
        this.price = price;
    }

    public abstract Trade solve();
}
