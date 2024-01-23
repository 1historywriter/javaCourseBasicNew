package lesson_06_4;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        // Тема: Создание переменной типа String
        String myName = "André";
        System.out.println("Значение переменной myName: " + myName);

        // Тема: Конкатенация строк
        String greeting = "Hi " + myName;
        System.out.println(greeting);

        // Тема: Считывание строк с консоли
        Scanner scanner = new Scanner(System.in);

        // Спросим у пользователя его имя
        System.out.print("Как вас зовут? ");
        String userName = scanner.nextLine();

        // Выведем приветствие
        String welcomeMessage = "Hello " + userName + "!";
        System.out.println(welcomeMessage);

        // Закрываем Scanner после использования
        scanner.close();
    }
}
