package homework13_Classes_exceptions_collections;

import java.util.Objects;

public class Vehicle {

    private String model;
    private String color;
    private String plate;

    public Vehicle(){}

    public Vehicle(String model, String color, String plate){
        this.model = model;
        this.color = color;
        this.plate = plate;
    }

    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }

    public String getPlate(){
        return plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(getModel(), vehicle.getModel()) && Objects.equals(getColor(), vehicle.getColor()) && Objects.equals(getPlate(), vehicle.getPlate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getColor(), getPlate());
    }
}