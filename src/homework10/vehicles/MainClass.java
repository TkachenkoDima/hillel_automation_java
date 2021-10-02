package homework10.vehicles;

public class MainClass {
    public static void main(String[] args) {

        MountainBike mountainBike1 = new MountainBike(1, 5, "Spark", 420, 15, 100, "Carbon");
        MountainBike mountainBike2 = new MountainBike(2, 5, "Voltage", 380, 22, 80, "Aluminium");
        RoadBike roadBike1 = new RoadBike(3, 9, 8, "Addict", 12, 90, "Alloy");
        RoadBike roadBike2 = new RoadBike(4, 10, 12, "Foil", 15, 100, "Carbon");

        System.out.println("Adjust seat height to: " + mountainBike1.getSeatHeight() + " ,then change gear to " + mountainBike1.changeGear() + " ,and " + mountainBike1.move());
        System.out.println("Adjust seat height to: " + mountainBike2.getSeatHeight() + " ,then change gear to " + mountainBike2.changeGear() + " ,and " + mountainBike2.move());
        System.out.println();
        System.out.println(mountainBike2.getModel() + " speed was too low, acceleration to " + mountainBike2.speedUp(mountainBike2.getSpeed()) + " km/h");
        System.out.println(mountainBike2.getModel() + " " + mountainBike2.applyBreak());
        System.out.println();
        System.out.println("Set bar to " + roadBike1.getRudderDepth() + " degrees" + " ,then change gear to " + roadBike1.changeGear() + " ,and " + roadBike1.move());
        System.out.println("Set bar to " + roadBike2.getRudderDepth() + " degrees" + " ,then change gear to " + roadBike2.changeGear() + " ,and " + roadBike2.move());
        System.out.println();

        Bicycle[] bikes = {mountainBike1, mountainBike2, roadBike1, roadBike2};
        for (Bicycle bike: bikes) {
            bike.calculateStiffness();
        }
        System.out.println();

        Car jeep = new Car(150, "Jeep", "Offroad", "automatic", 60, 100);
        Car smart = new Car(50, "Smart", "City", "manual",30, 100);

        System.out.println(jeep.move() + " " + jeep.getModel() + " and accelerate to " + jeep.speedUp(60) + " km/h then " + jeep.applyBreak() + " your speed to " + jeep.stop() + " and stop.");
        System.out.println(smart.move() + " " + smart.getModel() + " and accelerate to " + smart.speedUp(40) + " km/h then " + smart.applyBreak() + " your speed to " + smart.stop() + " and stop.");
        System.out.println();

        Helicopter apache1 = new Helicopter(300, "Apache", 20, 1000, 300, 200);
        Helicopter m8 = new Helicopter(200, "M8", 10, 500, 200, 80);


        Vehicle[] vehicles = {apache1, m8, jeep, smart};
        for (Vehicle vehicle: vehicles) {
            vehicle.calculateStiffness();
        }
    }
}
