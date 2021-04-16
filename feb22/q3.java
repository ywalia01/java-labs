import java.util.Scanner;

class Factorial{
    synchronized public static int print_fact(int n){
        if(n==0)
        return 1;
        return n * print_fact(n-1);
    }
}

class Fact1 extends Thread
{
    int i;
    public void run()
    {
        for(i=0; i <= 5; i++)
        {
            System.out.println("Factorial of " + i + ": " + Factorial.print_fact(i));
        }
    }
}

class Fact2 extends Thread
{
    int i;
    public void run()
    {
        for(i = 6; i <= 10; i++)
        {
            System.out.println("Factorial of " + i + ": " + Factorial.print_fact(i));
        }
    }
}

public class q3
{
    public static void main(String[] args){
        System.out.println("\n********Factorial Series********");
        Fact1 obj1 = new Fact1();
        Fact2 obj2 = new Fact2();
        obj1.start();
        obj2.start();
    }
}