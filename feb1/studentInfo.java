import java.util.Scanner;

class Student
{
    public int rollno;

    public void getNumber()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Student Rollno: ");
        rollno = sc.nextInt();
    }

    public void putNumber()
    {
        System.out.println("Student Rollno: " + this.rollno);
    }

}

interface Sports
{
    public void sportwt();
    public void putwt();
}

class Test extends Student
{
    Scanner sc = new Scanner (System.in);
    int test1, test2;

    public void getMarks()
    {
        System.out.println("Enter marks in Test 1: ");
        test1 = sc.nextInt();
        System.out.println("Enter marks in Test 2: ");
        test2 = sc.nextInt();
    }
    public void putMarks()
    {
        System.out.println("Student: " + super(rollno));
        System.out.println("Marks in Test 1: " + test1);
        System.out.println("Marks in Test 2: " + test2);
    }
}

class Results extends Test implements Sports
{

}

public class studentInfo
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        
    }
}
