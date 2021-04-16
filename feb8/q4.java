public class q4 
{  
    private static final String inputString = "146.66";      

    public static void main(String[] args) 
    {  
        try {  
            int a = Integer.parseInt(inputString);  
        }
        catch(NumberFormatException e)
        {  
            System.err.println(e);  
        }  
    }  
}