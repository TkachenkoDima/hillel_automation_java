package homework9.vehicles;

public abstract class Vehicle {
    int speed;
    private String model;

    public Vehicle(int speed, String model) {
        this.speed = speed;
        this.model = model;
    }

    public Vehicle(int speed) {
        this.speed = speed;
    }

    int speedUp(int speed) {
        return speed * 2;
    }

    String applyBreak() {
        return "stop";
    }

    String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    abstract public String move();

    final void stop() {
    }
}
