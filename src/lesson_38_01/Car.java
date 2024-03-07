package lesson_38_01;

public class Car {
    private String model;
    private int length;
    private int height;

    private Door door;

    public String Car(String model, int length, int height, Door door) {
        this.model = model;
        this.length = length;
        this.height = height;
        this.door = door;
        return model;
    }

        public void start(){System.out.println("Let's go!");
    }
        public String getModel() {return model;}
    public int getLength(){return length;}
    public int getHeight(){return height;}

    public Door getDoor(){return door;}


    }
