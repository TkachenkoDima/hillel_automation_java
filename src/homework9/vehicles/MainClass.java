package homework9.vehicles;

public class MainClass {
    public static void main(String[] args) {

        MountainBike mountainBike1 = new MountainBike(1, 5, "Spark", 420, 15);
        Bicycle mountainBike2 = new MountainBike(2, 5, "Voltage", 380, 20);
        RoadBike roadBike1 = new RoadBike(4, 9, 8, "Addict", -12);

        int mountainBikeSeatHeight = mountainBike1.getSeatHeight();
        int roadBikeDepthDegree = roadBike1.getRudderDepth();

        System.out.println("Adjust seat height to: " + mountainBikeSeatHeight + " ,then change gear to " + mountainBike1.changeGear() + " ,and " + mountainBike1.move());
        System.out.println("Adjust seat height to: " + mountainBikeSeatHeight + " ,then change gear to " + mountainBike2.changeGear() + " ,and " + mountainBike2.move());
        System.out.println();
        System.out.println(mountainBike2.getModel() + " speed was too low, acceleration to " + mountainBike2.speedUp(3));
        System.out.println(mountainBike2.getModel() + " " + mountainBike2.applyBreak());
        System.out.println();
        System.out.println("Set bar to " + roadBikeDepthDegree + " degrees" + " ,then change gear to " + roadBike1.changeGear() + " ,and " + roadBike1.move());
        System.out.println();

        Car jeep = new Car(100, "Jeep", "out", "automatic");
        Vehicle smart = new Car(3, "Smart");

        System.out.println(jeep.move() + " " + jeep.getModel() + " and accelerate to " + jeep.speedUp(50) + " km/h then " + jeep.applyBreak() + " and " + jeep.stop());
        System.out.println(smart.move() + " " + smart.getModel() + " and accelerate to " + smart.speedUp(40) + " km/h then " + jeep.applyBreak() + " and " + smart.stop());
        System.out.println();

        Helicopter apache1 = new Helicopter(300, "Apache", 20, 1000, 300);
        Helicopter apache2 = new Helicopter(300, "Apache", 20, 1000, 300);
        Vehicle apache3 = new Helicopter(300, "Apache", 20, 1000, 300);
        Vehicle apache4 = new Helicopter(300, "Apache");

        System.out.println("hashcode of helicopter1 = " + apache1.hashCode());
        System.out.println("hashcode of helicopter2 = " + apache2.hashCode());
        System.out.println("hashcode of helicopter3 = " + apache3.hashCode());
        System.out.println("hashcode of helicopter4 = " + apache4.hashCode());
        System.out.println("Comparing objects helicopter1 equals helicopter2: " + apache1.equals(apache2));
        System.out.println("Comparing objects helicopter1 equals helicopter3: " + apache1.equals(apache3) );
        System.out.println("Comparing objects helicopter1 == helicopter2: " + (apache1 == apache2));
        System.out.println("Comparing objects helicopter1 == helicopter3: " + (apache1 == apache3));
        System.out.println("Comparing objects helicopter3 equals helicopter4: " + apache3.equals(apache4));

        System.out.println(apache1.toString());
    }
}
