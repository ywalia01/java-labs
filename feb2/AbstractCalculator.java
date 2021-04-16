@FunctionalInterface
interface Addition {
    void sum(int a, int b, int c);
}

abstract class Calculator {
    void add(int num, int num1) {
        System.out.printf("%d + %d = %d\n", num, num1, num + num1);
    }

    void subtract(int num, int num1) {
        System.out.printf("%d - %d = %d\n", num, num1, num - num1);
    }
}

class BasicCalculator extends Calculator {
    void multiply(int num, int num1) {
        System.out.printf("%d * %d = %d\n", num, num1, num * num1);
    }

    void divide(int num, int num1) {
        System.out.printf("%d / %d = %d\n", num, num1, num / num1);
    }
}

class AdvancedCalculator extends Calculator {
    void xor(int num, int num1) {
        System.out.printf("%d ^ %d = %d\n", num, num1, num ^ num1);
    }

    void and(int num, int num1) {
        System.out.printf("%d & %d = %d\n", num, num1, num & num1);
    }
}

public class AbstractCalculator {
    public static void main(String[] args) {
        Calculator calculator;
        calculator = new BasicCalculator();
        calculator.add(10, 5);
        calculator.subtract(10, 5);
        ((BasicCalculator) calculator).multiply(10, 5);
        ((BasicCalculator) calculator).divide(10, 5);
        calculator = new AdvancedCalculator();
        ((AdvancedCalculator) calculator).xor(10, 5);
        ((AdvancedCalculator) calculator).and(10, 5);
        Addition addition = (a, b, c) -> System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c);
        addition.sum(10, 5, 1);
        ;
    }
}
