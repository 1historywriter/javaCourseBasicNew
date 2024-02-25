package lesson_14.lesson_14_05;

public class Pen {
    private String color;
    private String type;

    public Pen(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Pen{" +
      //          "color=" + color + '\‘‘ +
                "type=" + type +
                '}';
    }
}
