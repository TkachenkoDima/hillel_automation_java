package homework13_Classes_exceptions_collections;

import java.util.Objects;

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

    public void availableSapce(Vehicle vehicle) {
        if (capacity > 0) {
            System.out.println("car is parked");
            System.out.println(vehicle.getModel() + " " + vehicle.getColor() + " " + vehicle.getPlate() + " is parked.");
        }
        capacity ++;
        System.out.println(capacity);
    }

    public void isCarNotCargo(Car car) {
        if (Objects.equals(car.getType(), "passenger")) {
            System.out.println("Passenger car parked");
        }
        else {
            System.out.println("Cargo type is not permitted");
        }
    }

    public void isCarNotCargo(Bike bike) {
        if (Objects.equals(bike.getType(), "passenger")) {
            System.out.println("Passenger bike parked");
        }
        else {
            System.out.println("Cargo type is not permitted");
        }
    }

    public void typeCheck (Vehicle vehicle) {
        if (vehicle instanceof Bike || vehicle instanceof Car) {
            System.out.println("Passenger type is permitted");
        }
        else {
            System.out.println("Cargo type not permitted");
        }
    }

    public void isCarInTheList(Vehicle vehicle) {
        VehicleDB vehicleDB = new VehicleDB();
        if (vehicle.getPlate().equals(vehicleDB.vehicleList())) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Go away");
        }

    }
}