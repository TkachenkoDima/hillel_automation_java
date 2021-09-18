package homework7.Task5;

import java.util.Objects;

public class Bikes {

    private final String brand;
    private final int size;

    public Bikes(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bikes)) return false;
        Bikes bikes = (Bikes) o;
        return size == bikes.size && brand.equals(bikes.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, size);
    }
}