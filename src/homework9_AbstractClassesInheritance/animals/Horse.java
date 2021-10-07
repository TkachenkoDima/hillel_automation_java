package homework9_AbstractClassesInheritance.animals;

public class Horse extends Animal{

    private String racingType;

    public Horse(String name, String racingType, String food, String location) {
        super(name, food, location);
        this.racingType = racingType;
    }

    @Override
    public String makeNoise() {
        return "neigh";
    }

    @Override
    public String eat() {
        return "chunk-chunk";
    }
}
