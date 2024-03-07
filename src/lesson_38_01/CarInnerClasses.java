package lesson_38_01;

public class CarInnerClasses {
    private String model;
    private int length;
    private int height;

    public CarInnerClasses(String model, int length, int height) {
        this.model = model;
        this.length = length;
        this.height = height;
    }

    public void start(){
        System.out.println("Let`s go"); }
    public String getModel(){return model;}
    public int getLength(){return length;}
    public int getHeight(){return height;}

    public class Door {
        private boolean isClean;

        public Door(boolean isClean){this.isClean = isClean;}
        public void open (){
            System.out.println("Open");}
        public void close (){
            System.out.println("Close");}
        }
    }
