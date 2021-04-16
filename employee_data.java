class Employee{  
    int id;  
    String name;  
    float salary;  
    void insert(int i, String n, float s) {  
        id = i;  
        name = n;  
        salary = s;  
    }  
    void display(){
        System.out.println("\nEmployee Details: " + id);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }  
}  
public class employee_data {  
    public static void main(String[] args) {  

        Employee e1 = new Employee();  
        Employee e2 = new Employee();  
        Employee e3 = new Employee();  


        e1.insert(2241, "Gabe", 200000);  
        e2.insert(2294, "Darren", 250000);  
        e3.insert(2266, "Paul", 550000);  

        e1.display();  
        e2.display();  
        e3.display();  
    }  
}  