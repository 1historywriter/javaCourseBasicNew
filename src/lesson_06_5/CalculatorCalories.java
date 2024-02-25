package lesson_06_5;

import org.w3c.dom.ls.LSOutput;

public class CalculatorCalories {
    public static void main(String[] args) {


    int diameterPizza1 = 24;
    int diameterPizza2 = 28;
    int caloriesInOneCM = 40;

    // summe der Kalorien in Pizza 1
    // summe der Kalorien in Pizza 2


    double caloriesPizza1 = caloriesInOneCM * Math.PI * (diameterPizza1 * diameterPizza1) / 4;

    double caloriesPizza2 = caloriesInOneCM * Math.PI * (diameterPizza2 * diameterPizza2) / 4;

    double extraCalories = caloriesPizza2 - caloriesPizza1;

    System.out.println("Summe der Überkalorien: " + extraCalories);

}
}
