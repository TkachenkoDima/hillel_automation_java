package homework13_Classes_exceptions_collections;

import java.util.ArrayList;

public class Parking {

    private static final int capacity = 2;
    private final ArrayList<Vehicle> carArray;

    public Parking() {
        this.carArray = new ArrayList<Vehicle>(capacity);
    }

    public int available() {
        return capacity - this.carArray.size();
    }

    public int left() {
        return this.carArray.size();
    }

    public void addVehicles(Vehicle vehicle) {
        if (this.available() > 0) {
            this.carArray.add(vehicle);
            vehicle.printDetails();
            System.out.println("=====");
        }
        else {
            System.out.println("Full");
        }
    }
}