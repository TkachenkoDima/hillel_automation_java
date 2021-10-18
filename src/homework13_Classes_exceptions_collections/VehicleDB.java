package homework13_Classes_exceptions_collections;

import java.util.List;

public class VehicleDB {
    public List<Vehicle> vehicles;

    public List<Vehicle> vehicleList() {
        vehicles.add(new Vehicle("Smart", "red", "111"));
        vehicles.add(new Bike("Suzuki", "black", "222"));
        vehicles.add(new Car("Belaz", "pink", "999"));
        return vehicles;
    }
}
