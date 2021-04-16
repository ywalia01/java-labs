import java.util.Scanner;

class Staff
{
    public String name;
    public int empid;
    public void inputData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Employee name: ");
        name = sc.nextLine();
        System.out.println("Employee ID: ");
        empid = sc.nextInt();
    }
}

class Teacher extends Staff
{
    Scanner sc=new Scanner (System.in);
    
    void teacherinfo()
    {
        System.out.print("Subject: ");
        String sub = sc.nextLine();
        System.out.print("Publication: ");
        String pub = sc.nextLine();
        System.out.println("Name: " + name + "\nEmployee ID: " + empid + "\nSubject: " + sub + "\nPublication: " + pub);
    }
}

class Typist extends Staff
{
    Scanner sc = new Scanner (System.in);
    
    void typistinfo()
    {
        System.out.print("Typing Speed (in WPM): ");
        int wpm = sc.nextInt();
        System.out.println("Name: " + name + "\nEmployee ID: " + empid + "\nTyping Speed: " + wpm + " words per minute");
    }
}

class Officer extends Staff
{
    Scanner sc = new Scanner (System.in);
    
    void officerinfo()
    {
        System.out.print("Grade: ");
        int grade = sc.nextInt();
        System.out.println("Name: " + name + "\nEmployee ID: " + empid + "\nGrade: " + grade);
    }
}

public class EduInstitution
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner (System.in);

        System.out.print("Position of Employee\n1.Teacher\n2.Typist\n3.Officer\nEnter choice: ");
        int pos=s.nextInt();

        if(pos==1)
        {
            Teacher ob1 = new Teacher();
            ob1.inputData();
            ob1.teacherinfo();
        }
        else if(pos==2)
        {
            Typist ob2 = new Typist();
            ob2.inputData();
            ob2.typistinfo();
        }
        else if(pos==3)
        {
            Officer ob3 = new Officer();
            ob3.inputData();
            ob3.officerinfo();
        }
        else
        {
            System.out.println("Invalid Input");
            System.exit(0);
        }
    }
}