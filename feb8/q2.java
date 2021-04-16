import java.lang.*;
import java.util.*;

class NoException extends Exception
{
    public String toString()
    {
        return "\nEntered string !~ Javalang";
    }
}

public class q2
{
    public static void main(String[] args) throws NoException
    {
        Scanner sc = new Scanner(System.in);

        String str;
        String str1 = "Javalang";

        System.out.print("\nEnter a string: ");
        str = sc.nextLine();

        if(!str.equalsIgnoreCase(str1))
        {
            throw new NoException();
        }

        System.out.println("String ~ " + str1 + "\n");
    }
}