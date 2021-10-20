package homework15_Java_OOP;

import java.util.ArrayList;
import java.util.List;

public class Firm {
    String title;
    String address;
    int company_bank_account = 1000;
    private final List<Employee> employees;
    int currentYear = 2021;
    int currentMonth = 10;

    public Firm() {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Harry", "Potter", 500, 1, 2015, 9, "man", "Auror"));
        list.add(new Employee("Hermione", "Granger", 100, 2, 2020, 1, "woman", "Minister of magic"));
        list.add(new Employee("Ron", "Weasley", 200, 3, 2021, 6, "man", "Auror"));
        list.add(new Employee("Tom", "Riddle", 100, 4, 2000, 12, "man", "Death Eater"));
        this.employees = list;
    }

    public List<Employee> employeeList() {
        return employees;
    }

    public void printAllEmployees() {
        for (Employee e : employeeList()) {
            System.out.println(e);
        }
    }

    public void giveSalaryForAll() {
        for (Employee e : employeeList()) {
            if (company_bank_account < e.salary) {
                System.out.println("Company don't have enough money for pay salary to " + e.firstName + " " + e.lastName);
                System.out.println("=====");
            } else {
                company_bank_account -= e.salary;
                System.out.println("Company bank account decreased for: " + e.salary);
                System.out.println("+");
                System.out.println("Company bank account balance: " + company_bank_account);
                System.out.println("-----");

                e.setEmployee_bank_account(e.salary);
                System.out.println(e.firstName + " " + e.lastName + " bank account charged for: " + e.salary);
                System.out.println("+");
                System.out.println(e.firstName + " " + e.lastName + " bank account balance: " + e.employee_bank_account);
                System.out.println("=====");
            }
        }
    }

    public void calcVacations() {
        for (Employee e : employeeList()) {
            int months = ((currentYear - e.join_year) * 12) + (currentMonth - e.join_month);
            if (months > 6) {
                System.out.println("Employee " + e.firstName + " " + e.lastName + " can take: " + months*2 + " vacation days.");
            }
            else {
                System.out.println("Employee " + e.firstName + " " + e. lastName + " can't take a vacation.");
            }
        }
    }
}
