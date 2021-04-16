import java.io.PrintWriter;
import java.util.Scanner;

class Student {
    String name;
    int roll_no;
    double marks[];

    Student(String name, int roll_no, double[] marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    void display() {
        System.out.printf("\nName: %s\nRoll No: %d\nMarks: %s", name, roll_no, marks.toString());
    }
}

public class average {
    static PrintWriter out = new PrintWriter(System.out, true);
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Student std = new Student("Abcd", 0, new double[] { 89, 96, 84, 92 });
        std.display();
        double max_marks, min_marks, avg_marks;
        avg_marks = max_marks = 0.0;
        min_marks = 100.0;
        for (double mark : std.marks) {
            max_marks = Math.max(max_marks, mark);
            min_marks = Math.min(min_marks, mark);
            avg_marks += mark;
        }
        avg_marks /= std.marks.length;
        System.out.printf("\n\nMaximum Marks = %f\nMinimum Marks = %f\nAverage Marks = %f\n\n", max_marks, min_marks, avg_marks);
    }
}
