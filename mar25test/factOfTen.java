class calcFactorial {

    synchronized public static int calcFact(int num) {

        if (num == 0)

            return 1;

        return num * calcFact(num - 1);

    }

}

class firstHalf extends Thread {

    int n;

    public void run() {

        for (n = 0; n <= 5; n++) {

            System.out.println(n + ": " + calcFactorial.calcFact(n));

        }

    }

}

class secHalf extends Thread {

    int n;

    public void run() {

        for (n = 6; n <= 10; n++) {

            System.out.println(n + ": " + calcFactorial.calcFact(n));

        }

    }

}

class factOfTen {

    public static void main(String[] args) {

        System.out.println("Factorial for 10 numbers: ");

        firstHalf obj1 = new firstHalf();

        secHalf obj2 = new secHalf();

        obj1.start();

        obj2.start();
    }

}