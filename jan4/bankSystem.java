import java.util.Scanner;
 
class Bank {
    int acc;
    float bal = 0;
    Scanner get = new Scanner(System.in);
    Bank()
    {
        System.out.println("Enter Account Number: ");
        acc = get.nextInt();
        System.out.println("Enter Initial Balance: ");
        bal = get.nextFloat();        
    }
    void deposit()
    {
        float amount;
        System.out.println("Enter Amount to be Deposited: ");
        amount = get.nextFloat();
        bal = bal + amount;
        System.out.println("Deposited, Account Balance is " + bal);
    }
    void withdraw()
    {
        float amount;
        System.out.println("Enter Amount to be Withdrawn: ");
        amount = get.nextFloat();
        if(amount<bal)
        {
            bal = bal-amount;
            System.out.println("Amount Withdrawn, Available Balance: " + bal);
        }
        else
        {
            System.out.println("Insufficient Funds ");
        }
    }
}
 
public class bankSystem {
    public static void main(String[] args)
    {
        Bank myObj = new Bank();
        myObj.deposit();
        myObj.withdraw();       
    }
}