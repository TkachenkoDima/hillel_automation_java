package homework9.vehicles;

public class Helicopter extends Vehicle {

    int amountOfPassengers;
    int maxHeight;
    int tankSize;

    public Helicopter (int speed, String model, int amounOfPassengers, int maxHeigth, int tankSize) {
        super(speed, model);
        this.amountOfPassengers = amounOfPassengers;
        this.maxHeight = maxHeigth;
        this.tankSize = tankSize;
    }
    public Helicopter(int speed, String model) {
        super(speed, model);
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "amountOfPassengers=" + amountOfPassengers +
                ", maxHeight=" + maxHeight +
                ", tankSize=" + tankSize +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
