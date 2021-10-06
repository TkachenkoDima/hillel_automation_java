package homework9_AbstractClassesInheritance.animals;

public class Cat extends Animal {

    private String color;

    public Cat(String name, String color, String food, String location) {
        super(name, food, location);
        this.color = color;
    }

    @Override
    public String makeNoise() {
        return "meow";
    }

    @Override
    public String eat() {
        return "omnomnom";
    }
}

