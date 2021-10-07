package homework9_AbstractClassesInheritance.animals;

public class AnimalMain {
    public static void main(String[] args) {

        Animal myDog = new Dog("Spike", "Labradoodle", "raw meat", "country house");
        Animal myCat = new Cat("Mouse The Cat", "Grey", "marshmallows", "my home");
        Animal myHorse = new Horse("Spirit", "Very fast", "steroids", "racing stable" );

        Veterinarian veterinarian = new Veterinarian();

        Animal[] animals = {myDog, myCat, myHorse};

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}