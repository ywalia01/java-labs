import java.util.*;

interface AdvancedArithmetic{
  int sumOfDivisor(int n);
}

class Calculator implements AdvancedArithmetic 
{
    public int sumOfDivisor(int n) 
    {
        int i;
        int sum = 0;
        for(i = 1; i <= n; i++)
        {
            if(n % i == 0)
            {
                sum += i;
            }
        }
        return sum;
    }
}

class q1
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        Calculator my_calculator = new Calculator();

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println(my_calculator.sumOfDivisor(n));
    }
}