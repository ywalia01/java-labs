import java.util.Scanner;

class Employee{  
    float basic_salary=40000;  
    int hra=10000;
    int ch, exp=0, gratuity=0;

   }  

   class Programmer extends Employee{ 
    
       Scanner in = new Scanner(System.in);
    System.out.println("1. Software application developer  2. Web developer  3. Android/iOS developer");
    System.out.println("Enter a choice : ");
    ch = in.nextInt();

    switch(ch){
        case(1):
        System.out.println("Input your experience : ");
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 5000;
        }
        System.out.println("You are a Software application developer with a monthly salary of " + basic_salary+gratuity+hra);
        break;

        case(2):
        System.out.println("Input your experience : ")
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 6000;
        }
        System.out.println("You are a Web developer with a monthly salary of " + basic_salary+gratuity+hra);
        break;

        case(3):
        System.out.println("Input your experience : ");
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 5500;
        }
        System.out.println("You are a App Developer with a monthly salary of " + basic_salary+gratuity+hra);
        break;
    }
    
   }  

   class Analyst extends Employee{

    Scanner in = new Scanner(System.in);
    System.out.println("1. Computer Systems analyst  2. Software quality analyst  3. Business intelligence analyst");
    System.out.println("Enter a choice : ");
    ch = in.nextInt();

    switch(ch){
        case(1):
        System.out.println("Input your experience : ");
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 3000;
        }
        System.out.println("You are a Computer Systems analyst with a monthly salary of " + basic_salary+gratuity+hra);
        break;

        case(2):
        System.out.println("Input your experience : ");
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 6000;
        }
        System.out.println("You are a Software quality analyst with a monthly salary of " + basic_salary+gratuity+hra);
        break;

        case(3):
        System.out.println("Input your experience : ")
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 8000;
        }
        System.out.println("You are a Business intelligence analyst with a monthly salary of " + basic_salary+gratuity+hra);
        break;
    }
   }

   class Project_Leader extends Employee{

    Scanner in = new Scanner(System.in);
    System.out.println("1. Database administrator  2. Network System administrator  3. Cloud engineer");
    System.out.println("Enter a choice : ");
    ch = in.nextInt();

    switch(ch){
        case(1):
        System.out.println("Input your experience : ")
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 7000;
        }
        System.out.println("You are a Databse administrator with a monthly salary of " + basic_salary+gratuity+hra);
        break;

        case(2):
        System.out.println("Input your experience : ")
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 9000;
        }
        System.out.println("You are a Network System administrator with a monthly salary of " + basic_salary+gratuity+hra);
        break;

        case(3):
        System.out.println("Input your experience : ")
         exp = in.nextInt();
        if(exp >= 5){
            gratuity = 10000;
        }
        System.out.println("You are a Cloud Engineer with a monthly salary of " + basic_salary+gratuity+hra);
        break;
    }
   }

   class emptestm{
       public static void main(String args[]){
           Scanner in = new Scanner(System.in);
           System.out.println("Welcome! Are you a: 1. Programmer  2. Analyst or a 3. Project leader ");
           int choice = in.newInt();
           Switch(in){

            case 1:
                Programmer obj = new Programmer;
                break;
           
           
           case 2:
                Analyst obj = new Analyst;
                break;
           

           case 3:
                Project_Leader obj = new Project_Leader;
                break;
           }
       }
   }