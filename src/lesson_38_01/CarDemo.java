package lesson_38_01;

public class CarDemo {
    public static void main(String[] args) {
        Door door = new Door();

        Car car = new Car();

        CarInnerClasses myCar = new CarInnerClasses("super", 4,2);
        CarInnerClasses.Door doorInner = myCar.new Door(true);

        doorInner.open();
        doorInner.close();


    }
}
