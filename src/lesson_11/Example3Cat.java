package lesson_11;

import scanner.UserInput;

public class Example3Cat {
    public static <Cat> void main(String[] args) {
        UserInput userInput = new UserInput();
        boolean condition = true;

        while (condition) {
            String catName = userInput.inputText("Please enter cat name: ");
            String catBreed = userInput.inputText("Please enter cat breed: ");

            if (catName.isEmpty() || catBreed.equals("")) {
                condition = false;

            } else {
                Cat cat = new Cat(catName,catBreed);
                System.out.println(cat);
            }
        }

        System.out.println("Cycle of entering about cat´s is done!");
    }
}
