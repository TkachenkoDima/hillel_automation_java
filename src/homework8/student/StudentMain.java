package homework8.student;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student("Kek", "Ololoev", "Student-1", 5);
        Student student2 = new Student("Ololoev", "Kek", "Student-2", 4.5);
        Student aspirant1 = new Aspirant("Mr. Kek", "Smith", "Aspirant-1", 5, "work");
        Student aspirant2 = new Aspirant("John", "Doe", "Aspirant-2", 3, "scientific work");

        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (Student all : students) {
            System.out.println("Name: " + all.getFirstName() + " from " + all.group + " get " + all.getScholarship() + " UAH scholarship");
        }
    }
}
