import java.util.Scanner;

public class days_since_birth[
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int curryear = 2020, currmonth = 12, currdate = 21, i=1, elapsed=0, month_diff=0, year_diff=0;

        System.out.println("Enter your birth date: ");
        int bdate = input.nextInt();
        System.out.println("Enter your birth month(number): ");
        int bmonth = input.nextInt();
        System.out.println("Enter your birth year: ");
        int byear = input.nextInt();

        if (bmonth==1||bmonth==3||bmonth==5||bmonth==7||bmonth==8||bmonth==10||bmonth==12){
            month_diff = 31-bdate;
        }
        else if(bmonth == 2){
            if(curryear%4==0){
                month_diff = 29-bdate;
            }
            else{
                month_diff = 29-bdate;
            }
        }
        else{
            month_diff = 30-bdate;
        }

        if(bmonth==1){
            year_diff = 
        }



        if byear
        if (byear == curryear){
            if (currmonth == bmonth){
            elapsed = currdate - bdate;
            System.out.println("Days elapsed since: " + (elapsed));
            }
            else if(currmonth == lockmonth+1){
                elapsed += 9;
                elapsed += currdate;
                System.out.println("Days elapsed since: " + (elapsed));
            }
            else{
                for (i=bmonth+1;i<currmonth;i++){
                    if (i==1||i==3||i==5||i==7||i==8||i==10||i==12){
                        elapsed+=31;
                    }
                    else if(i == 2){
                        if(curryear%4==0){
                        elapsed += 29;
                        }
                        else{
                        elapsed += 28;
                        }
                    }
                    else{
                        elapsed += 30;
                    }
                }
                elapsed += currdate;
                elapsed += 9;
                System.out.println("Days elapsed since: " + (elapsed));
            }
        }
        else if{

        }
    }
]