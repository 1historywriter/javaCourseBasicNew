package lesson_06_2;

import java.util.Scanner;

public class CombineWords {
        public static void main(String[] args) {
            // Создаем объект Scanner для ввода данных
            Scanner scanner = new Scanner(System.in);

            // Ввод первого слова
            System.out.print("Стол: ");
            String word1 = scanner.next();

            // Ввод второго слова
            System.out.print("Стул: ");
            String word2 = scanner.next();

            // Закрываем Scanner после использования
            scanner.close();

            // Получение слова из первой половины первого слова и второй половины второго слова
            String combinedWord = combineWords(word1, word2);

            // Распечатать результат
            System.out.println("Слово из комбинированных половин: " + combinedWord);
        }

        private static String combineWords(String word1, String word2) {
            int length1 = word1.length();
            int length2 = word2.length();

            // Получение половин слов
            String half1 = word1.substring(0, length1 / 2);
            String half2 = word2.substring(length2 / 2);

            // Склеивание половин слов
            return half1 + half2;
        }
    }

}
