package thread;

import java.util.Scanner;

class Factor implements Runnable {
    Thread t;
    int n;

    Factor(int x) {
        n = x;
        t = new Thread(this, "Factor Thread");
        System.out.println("\nFactor thread created : " + t);
        t.start();
    }

    public void run() {

        System.out.print("Factors of " + n + " are : ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }

        System.out.println("\nExiting " + t);
    }
}

class Factorial implements Runnable {
    Thread t;
    int n;

    Factorial(int x) {
        n = x;
        t = new Thread(this, "Factorial Thread");
        System.out.println("\nFactorial thread created : " + t);
        t.start();
    }

    public void run() {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        System.out.print("Factorial of " + n + " is : " + f);

        System.out.println("\nExiting " + t);
    }
}

class fact2 {
    public static void main(String[] args) {
        Factor obj = new Factor(12);
        Factorial obj2 = new Factorial(5);

        obj2.t.join();
        obj.t.join();
        System.out.println("Exiting main thread");
    }
}