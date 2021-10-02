package homework10.vehicles;

public interface Movable {

    static String move() {
        return "move";
    }

    int stop();

    default double speedUp(int speed) {
        return speed * 1.1 ;
    }
}
