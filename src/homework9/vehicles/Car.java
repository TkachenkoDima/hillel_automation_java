package homework9.vehicles;

public class Car extends Vehicle {

    static String carType;
    static String transmission;

    public Car(int speed, String model) {
        super(speed, model);
    }

    public Car(int speed, String model, String carType, String transmission) {
        super(speed, model);
        this.carType = carType;
        this.transmission = transmission;
    }



    @Override
    public String move() {
        return null;
    }
}
