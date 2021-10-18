package homework13_Classes_exceptions_collections;

import java.util.ArrayList;

public class Parking {
    private final ArrayList<Vehicle> carList;

    public Parking() {
        carList = new ArrayList<>();
    }

    public void park(Vehicle vehicle) {
        try {
            if (carList.size() > 9) {
                System.out.println("There is no free parking lots! The vehicle with plate " + vehicle.getPlate() + " was NOT parked");
                System.out.println("=====");
                return;
            } else if (vehicle instanceof Car && ((Car) vehicle).getType().equals("cargo")) {
                throw new CarTypeExeption("Cargo type car is detected! No cargo type car at this parking!");
            }
            for (Vehicle v : VehicleDB.getVehiclesFromDB()) {
                if (v.getPlate().equals(vehicle.getPlate()) && v.getColor().equals(vehicle.getColor())) {
                    carList.add(vehicle);
                    System.out.println("Vehicle " + vehicle.getModel() + " with plate " + vehicle.getPlate() + " was parked successfully");
                    System.out.println("=====");
                    return;
                }
            }
            System.out.println("There is no such vehicle in the database! The vehicle with plate " + vehicle.getPlate() + " was NOT parked");
            System.out.println("=====");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("=====");
        }
    }

    public void leaveParking(Vehicle vehicle) {
        carList.remove(vehicle);
        System.out.println("Vehicle " + vehicle.getModel() + " with plate " + vehicle.getPlate() + " was left the parking");
        System.out.println("=====");
    }
}