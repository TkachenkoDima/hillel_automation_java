package homework14_Collections;

public enum Goods {

    LAPTOP ("Laptop", 1000),
    PHONE("Phone", 900),
    TABLET("Tablet", 800),
    WATCH("Watch", 700);

    private final String name;
    private final double price;

    Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
