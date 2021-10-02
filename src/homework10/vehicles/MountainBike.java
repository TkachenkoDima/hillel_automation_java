package homework10.vehicles;

public class MountainBike extends Bicycle {

    private final int seatHeight;
    public int bikeStiffness;

    public MountainBike(int id, int gear, String model, int seatHeight, int speed, int bikeStiffness, String material) {
        super(id, gear, speed, model, material);
        this.seatHeight = seatHeight;
        this.bikeStiffness = bikeStiffness;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    @Override
    public int stop() {
        return speed / 100;
    }

    @Override
    int changeGear() {
        return gear * 2;
    }

    @Override
    public void calculateStiffness() {
        if(bikeStiffness >= STIFFNESS) {
            System.out.println(getModel() + " is nice, very stiff mountainbike.");
            return;
        }
        System.out.println(getModel() + " mountainbike seems to be shitty, not so stiff.");
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "id=" + id +
                ", gear=" + gear +
                ", seatHeight=" + seatHeight +
                ", speed=" + speed +
                ", Default stiffness=" + STIFFNESS +
                ", bike stiffness" + bikeStiffness +
                ", Default engine power=" + ENGINE_POWER +
                '}';
    }
}