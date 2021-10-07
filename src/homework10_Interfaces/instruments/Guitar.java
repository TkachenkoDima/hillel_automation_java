package homework10_Interfaces.instruments;

public class Guitar implements Instrument{
    public static int strings;

    public Guitar(int strings) {
        Guitar.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    @Override
    public void play() {
        System.out.println("Guitar plays with " + getStrings() + " strings and sounds great with " + KEY);
    }
}
