package homework11.cloth;

public class Trousers extends Clothes implements ManCloth, WomenCloth{

    public Trousers(Size size, int price, String color) {
        super(size, price, color);
    }

    public String toString() {
        return "Trousers" +
                " Size: " + getSize() +
                ", price: " + getPrice() + " UAH" +
                ", color: " + getColor();
    }
}
