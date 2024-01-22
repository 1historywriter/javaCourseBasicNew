package lesson4_4;

public class TemperatureAverage {
    public static void main(String[] args) {
        // Значения на реальные температурные данные за каждый день недели
        int[] temperatures = {1, 2, 9, 0, 1, 0, 2};

        // Сумма температур
        int sum = 0;
        for (int temperature : temperatures) {
            sum += temperature;
        }

        // Средная температура
        double average = (double) sum / temperatures.length;

        // Вывод результата на экран
        System.out.println("Средняя температура за неделю: " + average + " градусов Цельсия");
    }
}
