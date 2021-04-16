package thread;

import java.util.Scanner;


class FactThread implements Runnable{
    int lowerLimit;
    int upperLimit;
   
    FactThread(int lowerLimit,int upperLimit){
        this.lowerLimit=lowerLimit;
        this.upperLimit=upperLimit;
       new Thread(this,"Thread 1").start();
    }
   
    @Override
    public void run(){
      calculate();
    }
    protected synchronized void calculate(){
        for(int i=lowerLimit;i<upperLimit;i++){
            int fact=1;
            int temp=i;
            if(temp<0){
                System.out.println("Factorial not defined!");
            }

            if(temp==0){
                fact=1;
                System.out.println("Factorial of "+i+" is 1.");
            }

            if(temp>0){
                while(temp>0){
                    fact=fact*(temp--);
                }
                System.out.println("Factorial of "+i+" is "+fact);
            }
        }
    }
}
public class q3_2 {

  
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       
        System.out.println("Enter the lower Limit");
        int lowerLimit=scanner.nextInt();
       
        System.out.println("Enter the upper Limit");
        int upperLimit=scanner.nextInt();
       
        if(upperLimit<lowerLimit){
            int temp=lowerLimit;
            lowerLimit=upperLimit;
            upperLimit=lowerLimit;
        }
        int range=(lowerLimit+upperLimit)/2;
       
        FactThread ft1=new FactThread(lowerLimit,(int)range);
        FactThread ft2=new FactThread(((int)range+1),upperLimit+1);}
   
}