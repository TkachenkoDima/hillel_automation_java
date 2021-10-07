package homework10_Interfaces.vehicles;

public class Car extends Vehicle {

    static String carType;
    static String transmission;
    public int tankSize;
    int vehicleStiffness;

    public Car(int speed, String model, String carType, String transmission, int tankSize, int vehicleStiffness) {
        super(speed, model);
        Car.carType = carType;
        Car.transmission = transmission;
        this.tankSize = tankSize;
        this.vehicleStiffness = vehicleStiffness;
    }

    @Override
    public String move() {
        return "Engine started, time to speed up this";
    }

    @Override
    public void calculateStiffness() {
        if (vehicleStiffness < STIFFNESS){
            System.out.println("Your car is not very durable, time to pass the checkup");
            return;
        }
        System.out.println("Yor car is quite durable, you can drive more " + (speed/tankSize * ENGINE_POWER) + " km on your " + getModel());
    }

    @Override
    public int stop() {
        return 0;
    }

    @Override
    public double speedUp(int speed) {
        return super.speedUp(speed);
    }
}
