package homework9_AbstractClassesInheritance.vehicles;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Helicopter that = (Helicopter) o;
        return amountOfPassengers == that.amountOfPassengers && maxHeight == that.maxHeight && tankSize == that.tankSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfPassengers, maxHeight, tankSize);
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
