package homework10.vehicles;

public class Helicopter extends Vehicle {

    int amountOfPassengers;
    int maxHeight;
    int tankSize;
    int vehicleStiffness;

    public Helicopter (int speed, String model, int amountOfPassengers, int maxHeigth, int tankSize, int vehicleStiffness) {
        super(speed, model);
        this.maxHeight = maxHeigth;
        this.tankSize = tankSize;
        this.vehicleStiffness = vehicleStiffness;
        this.amountOfPassengers = amountOfPassengers;
    }

    @Override
    public String move() {
        return "Check that tank fully filled with " + tankSize + " liters and press red button";
    }

    @Override
    public void calculateStiffness() {
        super.calculateStiffness(vehicleStiffness);
    }

    @Override
    public int stop() {
        return 0;
    }

    @Override
    public double speedUp(int speed) {
        return super.speedUp(speed);
    }


    @Override
    public String toString() {
        return "Helicopter{" +
                "amountOfPassengers=" + amountOfPassengers +
                ", maxHeight=" + maxHeight +
                ", tankSize=" + tankSize +
                '}';
    }
}
