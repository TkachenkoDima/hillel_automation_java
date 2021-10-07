package homework11_ENUM.cloth;

public class Trousers extends Clothes implements ManCloth, WomenCloth{

    public Trousers(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String clothName() {
        return Trousers.class.getSimpleName();
    }
}
