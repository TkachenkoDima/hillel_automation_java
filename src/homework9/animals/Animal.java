package homework9.animals;

public abstract class Animal {
    private final String food;
    private final String location;
    private final String name;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;

    }

    public abstract String makeNoise();

    public abstract String eat();

    public void sleep() {
        System.out.println("Animal sleeps");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }
}
