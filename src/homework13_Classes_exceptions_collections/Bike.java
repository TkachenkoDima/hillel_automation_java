package homework13_Classes_exceptions_collections;

public class Bike extends Vehicle {

    String type;

    public Bike(String model, String color, String plate, String type){
        super( model, color, plate);
        this.type = type;
    }

    public Bike(String model, String color, String plate) {
        super(model, color, plate);
    }

    public String getType() {
        return type;
    }
}