package homework13_Classes_exceptions_collections;

import java.util.ArrayList;

public class Parking {

    private static final int maxCapacity = 10;
    private int capacity = 0;


//    private final ArrayList<Vehicle> carArray;

//    public Parking() {
//        this.carArray = new ArrayList<>(capacity);
//    }

//    public int available() {
//        return capacity - this.carArray.size();
//    }
//
//    public int left() {
//        return this.carArray.size();
//    }

    public void printDetails(Vehicle vehicle) {
        System.out.println(vehicle.getModel() + " " + vehicle.getColor() + " " + vehicle.getPlate() + " is parked.");
    }

//    public void addVehicles(Vehicle vehicle) {
//        if (this.available() > 0) {
//            this.carArray.add(vehicle);
//            System.out.println("=====");
//        } else {
//            System.out.println("Full");
//        }
//    }

    public void addVehicles(Vehicle vehicle) {
        if (capacity > 0) {
        }

    }
}