package homework13_Classes_exceptions_collections;

import java.util.ArrayList;
import java.util.List;

public class VehicleDB {

    public static List<Vehicle> getVehiclesFromDB() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("Smart", "red", "111"));
        vehicles.add(new Car("mitsubishi lancer", "red", "222"));
        vehicles.add(new Bike("Suzuki", "black", "333"));
        vehicles.add(new Bike("Kawasaki", "green", "444"));
        vehicles.add(new Bike("Plotva", "brown", "THE PLOTVA"));
        vehicles.add(new Car("audi q3", "black", "555"));
        return vehicles;
    }
}