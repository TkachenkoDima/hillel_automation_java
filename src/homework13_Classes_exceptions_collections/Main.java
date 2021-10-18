package homework13_Classes_exceptions_collections;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();

        parking.vehicleTypeCheck(new Car("Smart", "red", "111", 3, "passenger"));
//        parking.vehicleTypeCheck(new Car("Kamaz", "grey", "333", 4, "cargo"));
//        parking.bikeCheck(new Bike("Suzuki", "black", "222", "passenger"));
        parking.validate(new Car("Smart", "red", "111", 3, "passenger"));

    }
}