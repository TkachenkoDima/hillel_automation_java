package homework11.cloth;

public class Tie extends Clothes implements ManCloth{

    public Tie(Size size, int price, String color) {
        super(size, price, color);
    }

    public String toString() {
        return "Tie" +
                " Size: " + getSize() +
                ", price: " + getPrice() + " UAH" +
                ", color: " + getColor();
    }
}
