package homework13_Classes_exceptions_collections;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();

        parking.addVehicles(new Car("Smart", "red", "123", 3, "passenger"));
        parking.addVehicles(new Bike("Suzuki", "black", "000", "passenger"));
        parking.addVehicles(new Car("Kamaz", "grey", "1", 4, "cargo"));

//        System.out.println("parked vehicles: " + parking.left());
//
//        System.out.println("available slots: " + parking.available());

        parking.printDetails(new Car("Smart", "red", "123", 3, "passenger"));
    }
}