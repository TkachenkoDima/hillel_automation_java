package homework15_OOP;

public class Employee {
    String firstName;
    String lastName;
    int salary;
    int employee_account;
    int year_of_joining;
    int month_of_joining;
    String gender;
    String department;

    public Employee(String firstName, String lastName, int salary, int employee_account, int year_of_joining, int month_of_joining, String gender, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.employee_account = employee_account;
        this.year_of_joining = year_of_joining;
        this.month_of_joining = month_of_joining;
        this.gender = gender;
        this.department = department;
    }
}
