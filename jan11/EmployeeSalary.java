import java.util.*;

class Employee {
    int empid, leaves;
    String name, leaveType;
    double salary;

    Scanner sc = new Scanner(System.in);

    void getData() {
        System.out.print("\nEnter Details");
        System.out.print("\nName: ");
        name = sc.nextLine();
        System.out.print("Employee ID: ");
        empid = sc.nextInt();
        System.out.print("Salary: ");
        salary = sc.nextDouble();
    }

    double salaryDeduction() {
        System.out.println("Enter : ");
        System.out.println("1.Casual leave\n2.Sick leave\n3.Earned leave\nChoice : ");
        int ch = sc.nextInt();
        System.out.print("\nEnter the days of leave: ");
        leaves = sc.nextInt();

        switch (ch) {
            case 1: {
                leaveType = "casual";
                if (leaves > 12)
                    return (salary * (0.01));
                else
                    return 0;
            }
            case 2: {
                leaveType = "sick";
                if (leaves > 10)
                    return (salary * (0.01));
                else
                    return 0;
            }
            case 3: {
                leaveType = "earned";
                if (leaves > 30)
                    return (salary * (0.01));
                else
                    return 0;
            }
            default:
                return 0;
        }

    }

    void display() {
        System.out.print("\nDetails \nName: " + name);
        System.out.print("\nEmployee ID: " + empid);
        System.out.print("\nSalary: " + salary);
        System.out.print("\nType of leave: " + leaveType);
        System.out.println("\nNumber of leaves: " + leaves);
    }
}

public class EmployeeSalary {
    public static void main(String args[]) {
        Employee emp1 = new Employee();
        emp1.getData();
        System.out.println();
        double deductedSalary = emp1.salaryDeduction();
        emp1.display();
        System.out.println("Deducted salary: " + deductedSalary);
    }
}
