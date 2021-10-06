package homework11_ENUM.cloth;

public class TShirt extends Clothes implements ManCloth, WomenCloth {

    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String clothName() {
        return TShirt.class.getSimpleName();
    }
}
