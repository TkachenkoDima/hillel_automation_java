package homework11.cloth;

public abstract class Clothes {
    private final Size size;
    public int price;
    public String color;

    public Clothes(Size size, int cost, String color) {
        this.size = size;
        this.price = cost;
        this.color = color;
    }

    abstract String clothName();

    public Size getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}
