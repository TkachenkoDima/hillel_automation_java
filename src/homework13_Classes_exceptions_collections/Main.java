package homework13_Classes_exceptions_collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Car redSmart = new Car("Smart", "red", "111", "passenger", 3);
        Car redMitsubishi = new Car("Mitsubishi lancer", "red", "222", "passenger", 5);
        Bike blackSuzuki = new Bike("Suzuki", "black", "333");
        Bike greenKawasaki = new Bike("Kawasaki", "green", "444");
        Bike plotva = new Bike("Plotva", "brown", "THE PLOTVA");
        Car blackAudi = new Car("Audi q3", "black", "555", "passenger", 5);
        Car orangeKamaz = new Car("Kamaz", "orange", "666", "cargo", 2);
        Car yellowSkoda = new Car("Skoda fabia", "yellow", "777", "passenger", 3);

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
        parking.park(plotva);
    }
}