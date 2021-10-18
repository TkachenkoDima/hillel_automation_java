package homework13_Classes_exceptions_collections;

public class Vehicle {
    private String model;
    private String color;
    private String plate;

    public Vehicle(String model, String color, String plate){
        this.model = model;
        this.color = color;
        this.plate = plate;
    }

    public String getColor(){
        return color;
    }

    public String getPlate(){
        return plate;
    }

    public String getModel() {
        return model;
    }
}