package homework9.vehicles;

public abstract class Vehicle {
    int speed;
    private String model;

    public Vehicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    int speedUp(int speed) {
        return speed * 2;
    }

    String applyBreak() {
        return "slow down";
    }

    String getModel() {
        return model;
    }

    abstract public String move();

    final String stop() {
        return "stop.";
    }
}
