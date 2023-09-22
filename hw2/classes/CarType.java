package hw2.classes;

import hw2.classes.trades.*;
import hw2.Trade;


public enum CarType {
    
    HATCHBACK("HATCHBACK") {
        @Override
        public HatchbackTrade createTrade(int price) {
            return new HatchbackTrade(price);
        }
     },
    SEDAN("SEDAN") {
        @Override
        public SedanTrade createTrade(int price) {
            return new SedanTrade(price);
        }
    },
    SUV("SUV") {
        @Override
        public SUVTrade createTrade(int price) {
            return new SUVTrade(price);
        }
    },
    PICKUP("PICKUP") {
        @Override
        public PickupTrade createTrade(int price) {
            return new PickupTrade(price);
        }
    };

    public String name;

    private CarType(String name) {
        this.name = name;
    }

    public abstract Trade createTrade(int price);
}
