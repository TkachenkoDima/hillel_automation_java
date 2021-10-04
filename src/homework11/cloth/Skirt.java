package homework11.cloth;

public class Skirt extends Clothes implements WomenCloth{

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String clothName() {
        return Skirt.class.getSimpleName();
    }
}
