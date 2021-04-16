import java.util.Scanner;

class emp {
    int id, salary;

    emp() {
        this.id = this.salary = 0;
    }

    emp(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }
}

public class salary {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        emp[] employees = new emp[3];
        for (int i = 0; i < 3; i++) {
            employees[i] = new emp(i, 1000* i + 10000);
        }
        int highest_salary = 0;
        for (emp employee : employees) {
            highest_salary = Math.max(highest_salary, employee.salary);
        }
        System.out.println("\n\nHighest Salary is: " + highest_salary);
    }
}
