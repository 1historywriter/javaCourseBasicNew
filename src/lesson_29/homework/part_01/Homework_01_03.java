package lesson_29.homework.part_01;

import java.util.HashMap;
import java.util.Map;

public class Homework_01_03 {
    public static void main(String[] args) {
        HashMap<String, String> dictions = new HashMap<String, String>();
        dictions.put("Boat", "Лодка");
        dictions.put("Child", "Ребенок");
        dictions.put("Friend", "Друг");
        dictions.put("Car", "Автомобиль");
        dictions.put("Bike", "Велосипед");
        System.out.println(dictions);

        UserInput userInput = new UserInput();
        String inputText = userInput.inputText("Введите слово для перевода  : ");
        String found = SearchWord(dictions, inputText);
        if(found!=null){
            System.out.println("Перевод слова: " +found);
        }else {
            System.out.println("Такого слова нет в словаре!");
        }
    }

    public static String SearchWord( Map<String ,String>dict,String seach){
    seach=seach.toUpperCase();
    String word=dict.get(seach);


    return word;
}

}