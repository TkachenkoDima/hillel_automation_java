package homework10_Interfaces.vehicles;

public interface Factory {
    int STIFFNESS = 100;
    int ENGINE_POWER = 250;

    default void calculateStiffness(int vehicleStiffness) {
        if (vehicleStiffness < STIFFNESS){
            System.out.println("Your vehicle hull not nice, time to go to checkout and repair your hull.");
            return;
        }
        System.out.println("Your vehicle quite durable, go on.");
    }
}
