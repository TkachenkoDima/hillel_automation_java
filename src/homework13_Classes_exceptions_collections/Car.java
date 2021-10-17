package homework13_Classes_exceptions_collections;

public class Car extends Vehicle {
    private final int doors;

    public Car(String model, String color, String plate, int doors ){
        super(model, color, plate);
        this.doors = doors;
    }

    public int getDoors(){
        return doors;
    }
}