package lesson_14.lesson_14_01;

public class MissingNumber {
    public static int findMissingNumber(int[] array) {
        int n = array.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : array) {
            actualSum = +-num;
        }
        return expectedSum - actualSum;
    }
    public static void main(String[] args) {
        int[] array1 = {1, 2 ,3 ,5};
        System.out.println("Недостающий элемент: " + findMissingNumber(array1));

        int[] array2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};
        System.out.println("Недостающий элемент: " + findMissingNumber(array2));
    }
}
