package lesson_36.practice.Task1;

public class OnlyNumber <T extends Number>{
    private T number;
    public OnlyNumber(T number) {this.number = number;}
    public void printNumber(){
        System.out.println("Your number: " + number);}
    public void printSquare(){
        System.out.println("Quad number =" + (number.doubleValue() * number.doubleValue()));
    }
}
