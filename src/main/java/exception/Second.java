package exception;

public class Second {

    public static void main(String[] args) {
        try {
            divideByZero(5.0, 0.0);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }

        try {
            createPositiveNumber(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Число должно быть положительным!");
        }

        try {
            checkStringLength("Hello", 3);
        } catch (IllegalArgumentException e) {
            System.out.println("Длина строки меньше указанной!");
        }

        divideByZero(10.0, 5.0);
        createPositiveNumber(10);
        checkStringLength("Hello", 5);
    }

    public static void divideByZero(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль!");
        } else {
            double result = a / b;
            System.out.println("Результат деления: " + result);
        }
    }

    public static void createPositiveNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Число должно быть положительным!");
        } else {
            System.out.println("Число " + num + " является положительным");
        }
    }

    public static void checkStringLength(String str, int length) {
        if (str.length() < length) {
            throw new IllegalArgumentException("Длина строки меньше указанной!");
        } else {
            System.out.println("Длина строки " + str + " больше или равна " + length);
        }
    }
}

