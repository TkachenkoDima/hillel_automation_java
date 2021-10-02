package homework10.vehicles;

public class RoadBike extends Bicycle {

    private final int rudderDepth;
    public int bikeStiffness;

    public RoadBike(int id, int gear, int speed, String model, int rudderDepth, int bikeStiffness, String material) {
        super(id, gear, speed, model, material);
        this.rudderDepth = rudderDepth;
        this.bikeStiffness = bikeStiffness;
    }

    public int getRudderDepth() {
        return rudderDepth;
    }

    @Override
    public int stop() {
        return speed/100;
    }

    @Override
    int changeGear() {
        return gear * 3;
    }

    @Override
    public void calculateStiffness() {
        if(bikeStiffness >= STIFFNESS) {
            System.out.println(getModel() + " is very nice bike, try TouDeFrance race.");
            return;
        }
        System.out.println(getModel() + " bike seems to be shitty, alcorace this is the top of your capabilities.");
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "id=" + id +
                ", gear=" + gear +
                ", seatHeight=" + rudderDepth +
                ", speed=" + speed +
                ", Default stiffness=" + STIFFNESS +
                ", bike stiffness" + bikeStiffness +
                ", Default engine power=" + ENGINE_POWER +
                '}';
    }
}
