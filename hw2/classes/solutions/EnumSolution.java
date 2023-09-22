package hw2.classes.solutions;

import hw2.Trade;
import hw2.AbstractSolution;
import hw2.classes.CarType;


public class EnumSolution extends AbstractSolution {

    public EnumSolution(CarType carType, int price) {
        super(carType, price);
    }

    @Override
    public final Trade solve() {
        return carType.createTrade(price);
    }
}
