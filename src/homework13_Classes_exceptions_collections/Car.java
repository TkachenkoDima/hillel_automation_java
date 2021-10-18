package homework13_Classes_exceptions_collections;

public class Car extends Vehicle {
    int doors;
    String type;

    public Car(String model, String color, String plate, String type, int doors){
        super(model, color, plate);
        this.doors = doors;
        this.type = type;
    }
    public Car(String model, String color, String plate) {
        super(model, color, plate);
    }

    public String getType() {
        return type;
    }
}