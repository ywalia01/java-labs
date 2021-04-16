import java.util.Scanner;
import java.lang.Exception;

class MyErrorException extends Exception
{
    MyErrorException(String message)
    {
        super(message);
    }
}

class Bank
{
    double bal;

    void withdrawal() throws MyErrorException
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter amount to be withdrawn: ");
        double val=sc.nextInt();
        if(val<=0)  System.out.println("Invalid amount, try Again");
        if(val>bal) 
        throw new MyErrorException("Error! Insufficient Funds");
        bal-=val;
    }

    void deposit()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to be deposited: ");
        double val = sc.nextInt();
        bal += val;
        System.out.println("Amount deposited, updated balance: " + bal);

    }
}

public class q6 
{
    public static void main(String args[]) throws MyErrorException
    {
        Bank bankHolder = new Bank();
        bankHolder.deposit();
        bankHolder.withdrawal();
    }
}