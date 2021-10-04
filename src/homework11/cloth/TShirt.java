package homework11.cloth;

public class TShirt extends Clothes implements ManCloth, WomenCloth {

    public TShirt(Size size, int price, String color) {
        super(size, price, color);
    }

    public String toString() {
        return "T-shirt" +
                " Size: " + getSize() +
                ", price: " + getPrice() + " UAH" +
                ", color: " + getColor();
    }
}
