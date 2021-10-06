package homework9_AbstractClassesInheritance.vehicles;

public class MountainBike extends Bicycle {

    private final int seatHeight;

    public MountainBike(int id, int gear, String model, int seatHeight, int speed) {
        super(id, gear, speed, model);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    @Override
    int changeGear() {
        return gear * 2;
    }
}
