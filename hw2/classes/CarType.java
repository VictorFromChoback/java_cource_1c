package hw2.classes;


public enum CarType {
    
    HATCHBACK("HATCHBACK"),
    SEDAN("SEDAN"),
    SUV("SUV"),
    PICKUP("PICKUP");

    public String name;

    private CarType(String name) {
        this.name = name;
    }

}
