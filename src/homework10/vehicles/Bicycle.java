package homework10.vehicles;

public abstract class Bicycle extends Vehicle {

    public final int id;
    protected int gear;
    public String material;

    public Bicycle(int id, int gear, int speed, String model, String material) {
        super(speed, model);
        this.id = id;
        this.gear = gear;
        this.material = material;

    }

    public String move() {
        return "go go go";
    }

    abstract int changeGear();

    @Override
    public double speedUp(int speed) {
        return ENGINE_POWER / 125 * speed;
    }


    @Override
    String applyBreak() {
        return "drives too fast, need to slow down.";
    }

    public abstract void calculateStiffness();
}