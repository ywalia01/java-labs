import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your birth-date, month, year:");
        int dd = input.nextInt();
        int mm = input.nextInt();
        int yyyy = input.nextInt();

		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(yyyy, mm, dd);

		int years = Period.between(birthDate, today).getYears();
		int months = Period.between(birthDate, today).getMonths();
		int days = Period.between(birthDate, today).getDays();

		System.out.println("\nToday's date: " + today);
		System.out.println("\nYour birth date: " + birthDate);
		System.out.println("Your age is: ");
		System.out.println("Years: " + years);
		System.out.println("Months: " + months);
		System.out.println("Days: " + days);
	}

}