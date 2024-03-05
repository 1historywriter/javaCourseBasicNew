package lesson_36.practice.Task2;

public class FigureDemo {
    public static void main(String[] args) {
        Circle<Double> circle = new Circle<> (10.5);
        System.out.println("Circle area:" + circle.area());

        Rectangle<Integer> rectangle = new Rectangle<>(0,0,4,3);
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
