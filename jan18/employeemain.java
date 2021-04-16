import java.util.Scanner;

class Employee
{
    public String name;
    public int empid;
    public void inputData()
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Employee Name: ");
        name = sc.nextLine();
        
        System.out.println("Employee ID: ");
        empid = sc.nextInt();
    }
}

class Programmer extends Employee
{
    void display()
    {
        System.out.println("Name: " + name + "\nEmployee ID: " + empid + "\nPosition: Programmer");
    }
}

class Analyst extends Employee
{
    void display()
    {
        System.out.println("Name: " + name + "\nEmployee ID: " + empid + "\nPosition: Analyst");
    }
}

class Project_Leader extends Employee
{
    void display()
    {
        System.out.println("Name: " + name + "\nEmployee ID: " + empid + "\nPosition: Project Leader");
    }
}

public class EmployeeMain
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner (System.in);

        Programmer ob1 = new Programmer();
        Analyst ob2 = new Analyst();
        Project_Leader ob3 = new Project_Leader();

        System.out.print("Position of the Employee\n1.Programmer\n2.Analyst\n3.Project Leader\nEnter choice: ");
        int pos = s.nextInt();

        if(pos==1)
        { 
            ob1.inputData();
            ob1.display(); 
        }
        else if(pos==2)
        {
            ob2.inputData();
            ob2.display();
        }
        else if(pos==3)
        {
            ob3.inputData();
            ob3.display();
        }
        else{
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}