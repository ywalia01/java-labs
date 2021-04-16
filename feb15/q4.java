import java.util.Scanner;
public class q4 
{    
    static void repeated_chars(String input)
    {
        int count;  
        char string[] = input.toCharArray();  
        System.out.println("Duplicate character(s) in the string: ");
        for(int i = 0; i <string.length; i++) 
        {  
            count = 1;  
            for(int j = i+1; j <string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ') {  
                    count++;  
                    string[j] = '0';  
                }  
            }  
              
            if(count > 1 && string[i] != '0'){ 
                System.out.println(string[i]);
                System.out.println("Repeated " + count + " times");
            }
        }
    }
     public static void main(String[] args) { 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the string: ");
         String input = sc.nextLine();
         repeated_chars(input);
    }  
}  