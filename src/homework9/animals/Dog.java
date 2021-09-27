package homework9.animals;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed, String food, String location) {
        super(name, food, location);
        this.breed = breed;
    }

    @Override
    public String makeNoise() {
        return "woof-woof";
    }

    @Override
    public String eat() {
        return "crunch-crunch";
    }
}
