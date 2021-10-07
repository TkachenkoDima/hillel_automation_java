package homework7_ClassesObjects;

import java.util.concurrent.ThreadLocalRandom;

public class Worker {
    private String name;
    private int age;
    private String position;
    private int salary;

    public Worker() {
        int minAge = 15;
        int maxAge = 60;
        int minSalary = 100;
        int maxSalary = 10000;

        //initialize default values for Worker class
        name = "Neo";
        age = ThreadLocalRandom.current().nextInt(minAge, maxAge);
        position = "The One";
        salary = ThreadLocalRandom.current().nextInt(minSalary, maxSalary);
    }
    //initialize toString method
    public String toString() {
        return "Name: " + this.name + ", age: " + this.age + ", position: " + this.position + ", salary: " + this.salary;
    }

    //initialize getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

