package homework10.vehicles;

public class RoadBike extends Bicycle {

    private final int rudderDepth;

    public RoadBike(int id, int gear, int speed, String model, int rudderDepth) {
        super(id, gear, speed, model);
        this.rudderDepth = rudderDepth;
    }

    public int getRudderDepth() {
        return rudderDepth;
    }

    @Override
    int changeGear() {
        return gear * 3;
    }
}
