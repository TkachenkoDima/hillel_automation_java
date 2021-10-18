package homework13_Classes_exceptions_collections;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();

        parking.isCarNotCargo(new Car("Smart", "red", "111", 3, "passenger"));
        parking.isCarNotCargo(new Bike("Suzuki", "black", "222", "passenger"));
        parking.isCarNotCargo(new Car("Kamaz", "grey", "333", 4, "cargo"));

        System.out.println("=====");
        parking.isCarInTheList(new Car("Smart", "red", "111", 4, "passenger"));

//        System.out.println("parked vehicles: " + parking.left());
//
//        System.out.println("available slots: " + parking.available());

//        parking.printDetails(new Car("Smart", "red", "123", 3, "passenger"));
    }
}