import java.util.Scanner;

interface Calc_sum {
    void sum(int a, int b, int c);
}

abstract class Calculator{
    void add(int n1, int n2){
        System.out.println("Sum: " + (n1 + n2));
    }
    void subtract(int n1, int n2){
        System.out.println("Difference: " + (n1 - n2));
    }
}

class Basic_calculator extends Calculator
{
    void multiply(int n1, int n2) {
        System.out.printf("Multiplication: " + (n1 * n2));
    }
    void divide(int n1, int n2) {
        System.out.printf("\nDivision: " + (n1 / n2));
    }
}

class Advanced_calculator extends Calculator
{
    void and(int n1, int n2){
        System.out.println("\nAnd: " + (n1 & n2));
    }
    void or(int n1, int n2){
        System.out.println("Or: " + (n1 | n2));
    }
}

public class calc{
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        int n1,n2,n3;

        System.out.println("Enter two numbers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        Calculator cal;
        cal = new Basic_calculator();

        cal.add(n1, n2);
        cal.subtract(n1, n2);

        ((Basic_calculator) cal).multiply(n1, n2);
        ((Basic_calculator) cal).divide(n1, n2);

        cal = new Advanced_calculator();
        ((Advanced_calculator) cal).and(n1, n2);
        ((Advanced_calculator) cal).or(n1, n2);

        System.out.println("\nEnter another no: ");
        n3 = sc.nextInt();

        Calc_sum csum = (x, y, z) -> System.out.printf("Sum of all 3 nos: " + (x + y + z));
        csum.sum(n1, n2, n3);
        ;
        System.out.println("\n");
    }
}