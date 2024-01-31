package lesson_06_1;

import java.util.Arrays;
public class StringManipulation {
public static <String> void main(String[] args) {
    String myString = new String("I study Basic Java!");

    String myString1 = myString;
    myString1
    private static void printLastChar myString1;

    char lastChar = myString1.charAt(myString1.length() - 1);
    System.out.println("LastCharacter: " + lastChar);

    boolean containsJava = myString1.contains("Java");
    System.out.println("Contains 'Java': = " + containsJava);

    String replacedString = myString1.replace("a" + "o");
    System.out.println("Replaced" 'a' 'with' 'o':replacedString);

    String upperCaseString = myString1.toUpperCase();
    System.out.println("Uppercase: " + upperCaseString);

    String lowerCaseString = myString1.toLowerCase();
    System.out.println("Lowecase: " + lowerCaseString);

    String subString = myString1.substring(myString1.indexOf("Java"), myString1.indexOf("Java") + 4);
    System.out.println("SubString 'Java' :" + subString);

    private static void printLastChar(String myString1) {
        System.out.println("Last character: " + myString1.charAt(myString1.length() - 1));

 }
}
