package hw2.classes.solutions;

import hw2.Trade;
import hw2.AbstractSolution;
import hw2.classes.trades.*;
import hw2.classes.CarType;


public class IfSolution extends AbstractSolution {

    public IfSolution(CarType carType, int price) {
        super(carType, price);
    }

    public final Trade solve() {
        Trade result = null;
        switch(carType) {
            case HATCHBACK:
                result = new HatchbackTrade(price);
                break;
            case SEDAN:
                result = new SedanTrade(price);
                break;
            case PICKUP:
                result = new PickupTrade(price);
                break;
            case SUV:
                result = new SUVTrade(price);
                break;
        }
        return result;
    }
}
