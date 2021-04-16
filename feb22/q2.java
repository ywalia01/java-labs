import java.util.Scanner;
class Prime extends Thread
{
    synchronized public void run()
    {
        int i, j, temp;
        Scanner sc = new Scanner(System.in);
        try
        {
            
            System.out.println("\n********Prime Series********");
            System.out.println("\nEnter a number: ");
            int n = sc.nextInt();

            System.out.println("Reverse series: ");
            for (i = 1; i <= n; i--)
            {
                if (i == 1 || i == 0) 
                    continue; 
                temp = 1;

                for (j = 2; j <= i / 2; ++j) 
                { 
                    if (i % j == 0)
                    { 
                        temp = 0; 
                        break; 
                    } 
                } 

                if (temp == 1) 
                    System.out.print(i + " ");
            }
        } catch (Exception e)
        {
            System.out.println(e);
        } 
    }
}

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

class q2
{
    public static void main(String[] args)
    {
        Prime pr = new Prime();
        Fibonacci fib = new Fibonacci();
        
        pr.start();
        fib.start();
        
    }

}