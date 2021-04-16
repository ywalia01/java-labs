import java.util.Scanner;
public class q3
{ 
    static String swap(String input, int i, int j) 
    { 
        char temp; 
        char[] char_Arr = input.toCharArray(); 
        temp = char_Arr[i] ; 
        char_Arr[i] = char_Arr[j]; 
        char_Arr[j] = temp; 
        return String.valueOf(char_Arr); 
    } 
    static void permutation_check(String input, int l, int r) 
    { 
        if (l == r) 
            System.out.println(input); 
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
                input = swap(input,l,i); 
                permutation_check(input, l+1, r); 
                input = swap(input,l,i); 
            } 
        } 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = sc.nextLine();

        int n = input.length(); 
        permutation_check(input, 0, n-1); 
    } 
 
}