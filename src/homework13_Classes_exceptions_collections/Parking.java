package homework13_Classes_exceptions_collections;

public class Parking {

    private static final int maxCapacity = 10;
    private int capacity = 0;


    public void printDetails(Vehicle vehicle) {
        System.out.println(vehicle.getModel() + " " + vehicle.getColor() + " " + vehicle.getPlate() + " is parked.");
    }

    public void availableSpace(Vehicle vehicle) {
        if (capacity > 0) {
            System.out.println("car is parked");
            System.out.println(vehicle.getModel() + " " + vehicle.getColor() + " " + vehicle.getPlate() + " is parked.");
        }
        capacity++;
        System.out.println(capacity);
    }

    public void typeCheck(Vehicle vehicle) {
        if (vehicle instanceof Bike || vehicle instanceof Car) {
            System.out.println("Passenger type is permitted");
        } else {
            System.out.println("Cargo type not permitted");
        }
    }

    public void vehicleTypeCheck(Vehicle vehicle) {
        if (((Car) vehicle).getType() == "cargo") {
            System.out.println("No entry for cargo cars!");
        } else System.out.println("welcome");
        ;
    }

    public void bikeCheck(Vehicle vehicle) {
        if (((Bike) vehicle).getType() == "cargo") {
            System.out.println("No entry for cargo cars!");
        } else System.out.println("welcome");
        ;
    }

    public void validate(Vehicle vehicle) {
        if (!VehicleDB.vehicles.contains(vehicle)) {
            System.out.println("There is no such vehicle in the database!");
        }
    }
}

