package homework13_Classes_exceptions_collections;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();

        parking.addVehicles(new Car("Smart", "red", "123", 3));
        parking.addVehicles(new Bike("Suzuki", "black", "000"));
        parking.addVehicles(new Truck("Kamaz", "grey", "1"));

        System.out.println("parked vehicles: " + parking.left());

        System.out.println("available slots: " + parking.available());
    }
}