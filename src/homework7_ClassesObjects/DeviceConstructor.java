package homework7_ClassesObjects;
public class DeviceConstructor {

    public String model;
    public String color;
    public int price;

    public DeviceConstructor() {
        model = "iPhone 12 Pro";
        color = "Black";
        price= 1300;
    }

    public DeviceConstructor(String m, String c, int p) {
        this.model = m;
        this.color = c;
        this.price = p;
    }

    public DeviceConstructor(int p) {
        this.price = p;
    }

    public String getModel() {
        return model;
    }

    public String toString() {
        return "Model: " + this.model + ", color: " + this.color + ", price: " + this.price;
    }
}
