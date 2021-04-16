import java.util.Scanner;
public class numorder {
   public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double n3 = input.nextDouble();
        
        if (n1 < n2 && n2 < n3)
        {
            System.out.println("Increasing order");
        }
        else if (n1 > n2 && n2 > n3)
        {
            System.out.println("Decreasing order");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}