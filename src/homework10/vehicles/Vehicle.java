package homework10.vehicles;

public abstract class Vehicle implements Factory, Movable {
    int speed;
    private final String model;

    public Vehicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    String applyBreak() {
        return "slow down";
    }

    public String getModel() {
        return model;
    }

    abstract public String move();

    public abstract void calculateStiffness();
}

