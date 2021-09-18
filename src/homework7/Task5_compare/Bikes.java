package homework7.Task5_compare;

import java.util.Objects;

public class Bikes {

    private String brand;
    private int size;

    public Bikes(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Bikes bike = (Bikes) o;
        return Objects.equals(brand, bike.brand) && Objects.equals(size, bike.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size);
    }
}