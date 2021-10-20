package homework15_Java_OOP;

public class Employee {
    String firstName;
    String lastName;
    int salary;
    int employee_bank_account;
    int join_year;
    int join_month;
    String gender;
    String department;

    public Employee(String firstName, String lastName, int salary, int employee_bank_account, int join_year, int join_month, String gender, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.employee_bank_account = employee_bank_account;
        this.join_year = join_year;
        this.join_month = join_month;
        this.gender = gender;
        this.department = department;
    }

    public void setEmployee_bank_account(int employee_bank_account) {
        this.employee_bank_account += employee_bank_account;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", employee_account=" + employee_bank_account +
                ", join_year=" + join_year +
                ", join_month=" + join_month +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
