package homework10_Interfaces.instruments;

public class Tube implements Instrument{
    int diameter;

    public Tube(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public void play() {
        System.out.println("Tube plays with " + getDiameter() + " centimeter diameter, but " + KEY + " sounds awful");
    }
}