package lesson_12.StudyWork;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        System.out.println("В видите общее количество этажей");
        int totalFloors = scanner.nextInt();
        scanner.close();


    }

    public int calculateIterations(int buildingHeight) {
        return buildingHeight;
    }
}
