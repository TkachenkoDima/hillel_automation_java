package homework11.cloth;

public class Tie extends Clothes implements ManCloth{

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String clothName() {
        return Tie.class.getSimpleName();

    }
}
