package homework13_Classes_exceptions_collections;

import java.util.ArrayList;

public class Parking {
    private final ArrayList<Vehicle> carList;

    public Parking() {
        carList = new ArrayList<>();
    }

    public void park(Vehicle vehicle) {
        if (carList.size() > 10) {
            System.out.println("There is no free parking lots! The vehicle with plate " + vehicle.getPlate() + " was NOT parked");
            System.out.println("=====");
            return;
        }
        if (vehicle instanceof Car && ((Car) vehicle).getType().equals("cargo")) {
            System.out.println("No entry for cargo cars! The vehicle with plate " + vehicle.getPlate() + " was NOT parked");
            System.out.println("=====");
            return;
        }
        for (Vehicle v : VehicleDB.getVehiclesFromDB()) {
            if (v.getPlate().equals(vehicle.getPlate()) && v.getColor().equals(vehicle.getColor())) {
                carList.add(vehicle);
                System.out.println("The vehicle with plate " + vehicle.getPlate() + " was parked successfully");
                System.out.println("=====");
                return;
            }
        }
        System.out.println("There is no such vehicle in the database! The vehicle with plate " + vehicle.getPlate() + " was NOT parked");
        System.out.println("=====");
    }

    public void leaveParking(Vehicle vehicle) {
        carList.remove(vehicle);
        System.out.println("The vehicle with plate " + vehicle.getPlate() + " was left the parking");
        System.out.println("=====");
    }
}