package homework9_AbstractClassesInheritance.animals;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Animal name: " + animal.getName() + " ,feeds with " + animal.getFood() + " ,with sound: " + animal.eat() +  " ,and located at: " + animal.getLocation());
    }
}