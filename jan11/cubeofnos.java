import java.util.Scanner;
class test
{
    Scanner get = new Scanner(System.in);
    int n;
    
    void get_value(){
            System.out.println("\nInput number of terms: "); 
            n = get.nextInt();
            System.out.println(" ");
        }

    void cube(){
        for(int i = 1; i <= n; i++){
            System.out.print("Number: " + i);
            System.out.println("\nCube: " + i*i*i);
        }
    }
}

public class cubeofnos{
        public static void main(String[] args) {
            test t = new test();
            t.get_value();
            t.cube();
            System.out.println(" ");
        }
}