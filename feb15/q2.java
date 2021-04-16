import java.util.Scanner;
import java.lang.*;
public class q2
{
    static char[] count(String input)
    {
        char[] ch = input.toCharArray();
        int chars=0;
        int spaces=0;
        int numbers=0;
        int special_characters = 0;
        char[] new_string = new char[50];
		
		for(int i = 0; i < input.length(); i++)
        {    
			if(Character.isLetter(ch[i]))
            {
				chars++ ;
				new_string[i]=ch[i];
			
			}
			else if(Character.isDigit(ch[i]))
            {
				numbers++ ;
			}
			else if(Character.isSpace(ch[i]))
            {
				spaces++ ;
			}
			else
            {
				special_characters++;
			}
		}
		System.out.println("Number of characters: " + chars);
		System.out.println("Number of Digits: " + numbers);
		System.out.println("Number of spaces: " + spaces);
		System.out.println("Number of special characters : " + special_characters);
		return new_string;
    }
    
	public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String input = sc.nextLine();
		char[] output = count(input);
		System.out.println(output);
	}
}