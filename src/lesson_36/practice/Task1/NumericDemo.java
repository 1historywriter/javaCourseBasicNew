package lesson_36.practice.Task1;

public class NumericDemo {
    public static void main(String[] args) {
        DoubleData doubleData = new DoubleData();
        IntegerData integerData = new IntegerData();

        doubleData.number = 3.14;
        integerData.number = 24;

        OnlyNumber<Integer> integerOnlyNumber = new OnlyNumber<>(22);
        OnlyNumber<Double> doubleOnlyNumber = new OnlyNumber<>(22.4);

        integerOnlyNumber.printNumber();
        doubleOnlyNumber.printNumber();

        doubleOnlyNumber.printSquare();
        integerOnlyNumber.printSquare();

    }
}
