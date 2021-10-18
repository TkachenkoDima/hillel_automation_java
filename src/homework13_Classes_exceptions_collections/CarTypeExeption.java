package homework13_Classes_exceptions_collections;

public class CarTypeExeption extends Exception {

    String carType;

    public CarTypeExeption(String message) {
        super(message);
        carType = message;

    }
}
