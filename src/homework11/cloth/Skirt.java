package homework11.cloth;

public class Skirt extends Clothes implements WomenCloth{

    public Skirt(Size size, int price, String color) {
        super(size, price, color);
    }

    @Override
    public String toString() {
        return "Skirt" +
                " Size: " + getSize() +
                ", price: " + getPrice() + " UAH" +
                ", color: " + getColor();
    }
}
