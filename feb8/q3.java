class q3
{
    public static void main(String args[]) 
    {
     int d = 0;
     int n = 20;

     try {
      int fraction = n / d;
     }
     catch (ArithmeticException e) 
     {
      System.out.println("fillIn: " + e.fillInStackTrace());
      System.out.println("cause: " + e.getCause());
      System.out.println("local: " + e.getLocalizedMessage());
      System.out.println("message: " + e.getMessage());
      System.out.println("trace: ");  e.printStackTrace();
      System.out.println("string: ");  e.toString();
     }
    }
   }