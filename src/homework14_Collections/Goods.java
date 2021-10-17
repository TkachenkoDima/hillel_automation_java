package homework14_Collections;

public enum Goods {

    KEK ("kek", 22.2);


    private String name;
    private double price;

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
