package lesson_06_5;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        InputReader inputReader = new InputReader();


        double num1 = inputReader.readNumber("Введите первое число: ");
        double num2 = inputReader.readNumber("Введите второе число: ");


        double sumResult = add(num1, num2);
        double subtractResult = subtract(num1, num2);
        double multiplyResult = multiply(num1, num2);
        double divideResult = divide(num1, num2);

        System.out.println("Результат сложения: " + sumResult);
        System.out.println("Результат вычитания: " + subtractResult);
        System.out.println("Результат умножения: " + multiplyResult);
        System.out.println("Результат деления: " + divideResult);
    }


    private static double add(double a, double b) {
        return a + b;
    }


    private static double subtract(double a, double b) {
        return a - b;
    }


    private static double multiply(double a, double b) {
        return a * b;
    }


    private static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ошибка: деление на ноль.");
            return Double.NaN;
        }
    }
}

class InputReader {

    public double readNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка: введите корректное число.");
            System.out.print(prompt);
            scanner.next();
        }
        double number = scanner.nextDouble();
        return number;
    }
}
