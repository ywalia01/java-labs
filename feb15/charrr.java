import java.util.Scanner;

public class charrr
{
    static String count(String input){
        
        int chars = 0;
		int spaces = 0;
		int numbers = 0;
		int special_characters = 0;
		
		for(int i = 0; i < input.length(); i++){
		    
			if(Character.isLetter(input[i])){
				chars++ ;
			}
			else if(Character.isDigit(input[i])){
				numbers++ ;
				input[i] = input[i+1];
			}
			else if(Character.isSpace(input[i])){
				spaces++ ;
				input[i] = input[i+1];
			}
			else{
				special_characters++;
				input[i] = input[i+1];
			}
		}
		return input;
    }
    
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String input = sc.nextLine();
		String output = count(input);
		System.out.println(output);
	}
}