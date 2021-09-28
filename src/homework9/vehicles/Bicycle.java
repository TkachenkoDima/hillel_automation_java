package homework9.vehicles;

public abstract class Bicycle extends Vehicle {

    public final int id;
    protected int gear;

    public Bicycle(int id, int gear, int speed, String model) {
        super(speed, model);
        this.id = id;
        this.gear = gear;
    }

    public String move() {
        return "go go go";
    }

    abstract int changeGear();

    @Override
    int speedUp(int speed) {
        return gear * gear;
    }

    @Override
    String applyBreak() {
        return "drives too fast, need to slow down.";
    }
}