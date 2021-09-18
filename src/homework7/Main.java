package homework7;

public class Main {
    public static void main(String[] args) {
//Task 1,2
        Worker worker1 = new Worker();
        worker1.setName("Peter Parker");
        worker1.setPosition("Spiderman");

        System.out.println("Name: " + worker1.getName());
        System.out.println("Age: " + worker1.getAge());
        System.out.println("Position: " + worker1.getPosition());
        System.out.println("Salary: " + worker1.getSalary());
        System.out.println("___");
        System.out.println("toString() -> " + worker1);
        System.out.println("___");

        Worker worker2 = new Worker();
        worker2.setAge(33);

        System.out.println("Name:" + worker2.getName());
        System.out.println("Age: " + worker2.getAge());
        System.out.println("Position: " + worker2.getPosition());
        System.out.println("Salary: " + worker2.getSalary());
        System.out.println("toString() -> " + worker2);
        System.out.println("___");

//Task3
        System.out.println("My dog breed is: " + Dog.getBreed());

//Task4
        DeviceConstructor iPhone = new DeviceConstructor();
        DeviceConstructor iPad = new DeviceConstructor("Pro", "White", 900);
        DeviceConstructor iPod = new DeviceConstructor(300);

        System.out.println("iPhone model: " + iPhone.getModel());
        System.out.println("iPad model: " + iPad.getModel());
        System.out.println("iPad toString() -> " + iPad);
        System.out.println("iPod price: " + iPod.price);
    }
}
