package homework10_Interfaces.instruments;

public class Drum implements Instrument{
    int size;

    public Drum(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void play() {
        System.out.println("Drum plays with " + getSize() + " centimeter size and sounds not bad at " + KEY);
    }
}