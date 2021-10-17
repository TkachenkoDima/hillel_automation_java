package homework13_Classes_exceptions_collections;

import java.util.List;

public class VehicleDB {
    public List<Vehicle> vehicles;

    public List<Vehicle> vehicleList() {
        vehicles.add(new Vehicle("Smart", "red", "123"));
        vehicles.add(new Bike("Suzuki", "black", "000"));
        vehicles.add(new Truck("Belaz", "pink", "999"));
        return vehicles;
    }
}
