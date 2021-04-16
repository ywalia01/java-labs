import java.util.Scanner;
class Fibonacci extends Thread
{
    synchronized public void run()
    {
        try
        {
            int a=0, b=1, c=0;
            Scanner sc = new Scanner(System.in);

            System.out.print("\n********Fibonacci Series********");
            System.out.print("\nEnter Upper Limit: ");
            int n = sc.nextInt();

            System.out.println("Fibonacci series: ");
            while (n>0)
            {
                System.out.print(c+" ");
                a=b;
                b=c;
                c=a+b;
                n=n-1;
            }
        } catch (Exception e){
                System.out.println(e);
        }
        
    }
}

class Reverse extends Thread
{
    synchronized public void run()
    {
        int i;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("\n********Reverse Series********");
            System.out.println("\nEnter a number: ");
            int n = sc.nextInt();

            System.out.println("Reverse series: ");
            for (i = n; i > 0; i--)
            {
                System.out.println(i+" ");
            }
        } catch (Exception e)
        {
            System.out.println(e);
        } 
    }
}

class q1
{
    public static void main(String[] args)
    {
        Fibonacci fib = new Fibonacci();
        Reverse rev = new Reverse();
        fib.start();
        rev.start();
    }

}