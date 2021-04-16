import java.util.Scanner;

class Students
{
    String name;
    int rollno;
    int totalMarks = 0;

    public void inputData()
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Student name: ");
        name = sc.nextLine();
        System.out.print("Student roll no: ");
        rollno = sc.nextInt();
    }
}
class Exam extends Students
{
    Scanner sc = new Scanner (System.in);
    int marks[] = new int[6];
    void inputMarks()
    {
        for (int i=0;i<6;++i)
        {
            System.out.print("Enter Marks in Subject " + (i+1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks = totalMarks + marks[i];
        }
    }
}

class Result extends Exam
{
    void showResult()
    {
        double averageMarks = totalMarks / 6;
        double cgpa = (totalMarks/6) / 9.5;

        System.out.println("\n====Student Details====");
        System.out.println("Name: " + name + "\nRoll No: " + rollno + "\nTotal Marks: " + totalMarks + " / 600" + "\nAverage: " + averageMarks + "\nCGPA: " + cgpa + "\n=======================");
    }
}

public class StudentData
{
    public static void main(String[]args)
    {
        Result ob2 = new Result();
        ob2.inputData();
        ob2.inputMarks();
        ob2.showResult();
    }
}