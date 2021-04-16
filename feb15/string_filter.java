import java.util.Scanner;
public class string_filter {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();

        System.out.print("Number of words in the string: " + count_Words(str)+"\n");
        no_splChar(str);
    }

    public static int count_Words(String str)
    {
       int count_word = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count_word++;
                }
            }
            count_word = count_word + 1; 
        }
        return count_word; 
    }

    public static void no_splChar(String str){
        int count_digit =0;
        int count_alph=0;
        int count_splChar =0;
        int j;
        char ch;

        for(j = 0; j < str.length(); j++)
		{
			ch = str.charAt(j);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				count_alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				count_digit++;
			}
			else {
				count_splChar++;
			}
		}
        System.out.println("\nNumber of Alphabet Characters  =  " + count_alph);
		System.out.println("Number of Digit Characters     =  " + count_digit);
		System.out.println("Number of Special Characters   =  " + count_splChar);
	}
}