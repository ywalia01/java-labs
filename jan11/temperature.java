import java.util.Scanner;

public class temperature {

    static float f2c(float fahr) { 
        return (fahr - 32) * 5 / 9;
    }

 	public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float f, c;

 		System.out.println("\nEnter temperature in Fahrenheit: ");
        f = input.nextFloat();
        c = f2c(f);
        System.out.println(f + " F" + " = " + c + " C "); 
        System.out.println(" ");
 	}
}