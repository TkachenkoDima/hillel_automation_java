package homework10_Interfaces.instruments;

public class InstrumentsMain {
    public static void main(String[] args) {
        Instrument guitar = new Guitar(7);
        Instrument drum = new Drum(30);
        Instrument tube = new Tube(3);

        Instrument[] instruments = {guitar, drum, tube};

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
