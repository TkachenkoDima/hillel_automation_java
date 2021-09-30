package homework10.instruments;

public class InstrumentsMain {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(7);
        Instrument drum = new Drum(30);
        Instrument tube = new Tube(2);

        Instrument[] instruments = {guitar, drum, tube};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
