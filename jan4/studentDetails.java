import java.util.Scanner;

class Student
{
    Scanner sc = new Scanner(System.in);
    String name;
    int roll;
    float cgpa;
    
    void get_value(){
        name = sc.nextLine();
        roll = sc.nextInt();
        cgpa = sc.nextFloat();
    }

    Student(){
        name = "Yash";
        roll = 17;
        cgpa = 10;
    }

    Student(String s,int r,float c){
        name = s;
        roll = r;
        cgpa = c;
    }
    void display(){
        System.out.println("Student name: " + name);
        System.out.println("Roll no.: "+ roll);
        System.out.println("Cgpa : "+ cgpa+"\n");
    }

}

public class studentDetails {
	public static void main (String[] args){
        Student std = new Student("Dhruv",12,8.5f);
        Student st = new Student();
        st.display();
        std.display();
        std.get_value();
        std.display();
    }
}
