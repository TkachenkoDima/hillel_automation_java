package homework13_Classes_exceptions_collections;

public class Main {
    public static void main(String[] args) {
        Car redSmart = new Car("smart", "red", "111", "passenger", 3);
        Car redMitsubishi = new Car("mitsubishi lancer", "red", "222", "passenger", 5);
        Bike blackSuzuki = new Bike("suzuki", "black", "333");
        Bike greenKawasaki = new Bike("kawasaki", "green", "444");
        Car blackAudi = new Car("audi q3", "black", "555", "passenger", 5);
        Car orangeKamaz = new Car("kamaz", "orange", "666", "cargo", 2);
        Car yellowSkoda = new Car("skoda fabia", "yellow", "777", "passenger", 3);

        Parking parking = new Parking();
        parking.park(redSmart);

        parking.park(redMitsubishi);

        parking.park(blackSuzuki);

        parking.park(greenKawasaki);

        parking.park(blackAudi);

        parking.park(orangeKamaz);

        parking.park(yellowSkoda);

        parking.leaveParking(blackAudi);

        parking.park(redSmart);
    }
}