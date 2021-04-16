import java.util.*;

interface AdvancedArithmetic{
  int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic 
{
    public int divisor_sum(int n) 
    {
        int sum = 0;
        int sqrt = (int) Math.sqrt(n);

        for (int i = 1; i <= sqrt; i++) 
        {
            if (n % i == 0) {
                sum += i + n / i;
            }
        }

        if (sqrt * sqrt == n) 
        {
            sum -= sqrt;
        }

        return sum;
    }
}

class advanced
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }

    static void ImplementedInterfaceNames(Object obj)
    {
        Class[] theInterfaces = obj.getClass().getInterfaces();

        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}