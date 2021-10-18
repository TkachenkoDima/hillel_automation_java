package homework13_Classes_exceptions_collections;

import java.util.List;

public class VehicleDB {
    public static List<Vehicle> vehicles;

    private List<Vehicle> vehicleList() {
        vehicles.add(new Car("Smart", "red", "111", 3, "passenger"));
        vehicles.add(new Bike("Suzuki", "black", "222"));
        vehicles.add(new Car("Belaz", "pink", "999"));
        return vehicles;
    }
}
