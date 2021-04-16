class Factor implements Runnable
{
    Thread t;
    int n;
     
    Factor(int x)
    {
        n = x;
        t=new Thread(this,"Factor Thread");
        System.out.println("\nFactor thread created : "+t);
        t.start();
    }
     
    public void run()
    {
        try
        {
            System.out.print("Factors of "+n+" are : ");
            for(int i = 1;i<=n;i++)
            {
                if(n%i == 0 )
                    System.out.print(i+" ");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\nExiting "+t);
    }
}
 
class Factorial implements Runnable
{
    Thread t;
    int n;
     
    Factorial(int x)
    {
        n = x;
        t=new Thread(this,"Factorial Thread");
        System.out.println("\nFactorial thread created : "+t);
        t.start();
    }
     
    public void run()
    {
        try
        {
            long f = 1;
            for(int i = 2;i<=n;i++)
            {
                f*=i;
            }
            System.out.print("Factorial of "+n+" is : "+f);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\nExiting "+t);
    }
}
 
class q3
{
    public static void main(String []args)
    {
        Factor obj = new Factor(12);
        Factorial obj2 = new Factorial(5);
         
        try
        {
            obj2.t.join();
            obj.t.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
         
        System.out.println("Exiting main thread");
    }
}