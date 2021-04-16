import java.util.Scanner;

public class q1{
    static void StringAssess(String input){
        int Count = 0;
        int Words = 0;
        int Digits = 0;
        int Special = 0;
        for(int i=0;i<input.length(); i++){
            char ch = input.charAt(i);
            if(Character.isAlphabetic(ch)){
                Count++;    }
            else if(Character.isDigit(ch)){
                Digits++;   }
            else if(Character.isWhitespace(ch)){
                Words++;    }
            else{
                Special++;   }
        }
        System.out.println("In '" + input + "' : ");
        System.out.println("Words are " +Words);
        System.out.println("Digits Are " +Digits); 
        System.out.println("Special Characters Are " +Special);
    }
    static String Replace(String s){
        for(int i = 0;i<=s.length();i++){
           s=s.replaceAll("A "," ");
           s=s.replaceAll("An "," ");
           s=s.replaceAll("The "," ");
           s=s.replaceAll("a "," ");
           s=s.replaceAll("an "," ");
           s=s.replaceAll("the "," ");
           s=s.replaceAll("[^a-zA-Z]"," ");
        }
       return s;
    }
    public static void main(String[] args) {
        String Input;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the String :");
        Input=SC.nextLine();
        StringAssess(Input);
        String Final=Replace(Input);
        System.out.println(Final);
    }
}