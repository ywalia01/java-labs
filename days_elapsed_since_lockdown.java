import java.util.Scanner;

public class days_elapsed_since_lockdown{
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        int lockdate = 23, lockmonth = 3, lockyear=2020, i=1, elapsed=0;
        
        System.out.println("Enter the year: ");
        int curryear = input.nextInt();
        System.out.println("Enter the month(number): ");
        int currmonth = input.nextInt();
        System.out.println("Enter the date: ");
        int currdate = input.nextInt();
        
        
        if (curryear == lockyear){
            if (currmonth == lockmonth){
            elapsed = currdate - lockdate;
            System.out.println("Days elapsed since: " + (elapsed));
            }
            else if(currmonth == lockmonth+1){
                elapsed += 9;
                elapsed += currdate;
                System.out.println("Days elapsed since: " + (elapsed));
            }
            else{
                for (i=lockmonth+1;i<currmonth;i++){
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

        
        else if(curryear == lockyear+1){
            elapsed += 284;
            if (currmonth == 1){
                elapsed += currdate;
                System.out.println("Days elapsed since: " + (elapsed));
            }
            else{
                for (i=1;i<currmonth;i++){
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
                System.out.println("Days elapsed since: " + (elapsed));
            }
        }

        else{
            elapsed += 284;
            for (i=lockyear+1;i<curryear;i++){
                if (i%4 == 0){
                    elapsed += 366;
                }
                else{
                    elapsed += 365;
                }
            }

            if (currmonth == 1){
                elapsed += currdate;
                System.out.println("Days elapsed since: " + (elapsed));
            }
            else{
                for (i=1;i<currmonth;i++){
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
            }
            elapsed += currdate;
            System.out.println("Days elapsed since: " + (elapsed));
        }
        input.close();
    }
}