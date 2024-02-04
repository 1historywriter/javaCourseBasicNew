package lesson_14.lesson_14_03;

import java.util.Random;
public class MassiveNumbers {
    public static void main(String[] args) {
        int b=0;
        int[] Mas = new int[15];
        for(int i=0;i< Mas.length;i++){
            Random random=new Random();
            Mas[i]=random.nextInt(10);
            System.out.println(Mas[i] + "");
            if(Mas[i]>0&Mas[i]%2==0)b++;
        }
        System.out.println("");
        System.out.println("Всего в массиве "+b+" четных");
    }
}
