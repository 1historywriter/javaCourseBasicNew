package lesson4_3;

public class Main {
    public static void main(String[] args) {
        int priceA = 1000;
        int priceB = 500;
        int discount = 100;

        int totalCost = priceA + priceB - discount;
        int discountAmount = discount;

        System.out.println("Стоимость суммы A+B со скидкой: " + totalCost + " руб");
        System.out.println("Сумма скидки: " + discountAmount + " руб");
    }
}
