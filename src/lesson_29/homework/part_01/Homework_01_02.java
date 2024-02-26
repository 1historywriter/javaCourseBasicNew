package lesson_29.homework.part_01;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
public class Homework_01_02 {
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        int countInt=10;
        for(int i=0;i<countInt;i++){
            int rand=(int)(1+(100-1+1)*Math.random());
            integers.add(rand) ;
        }

        System.out.println(integers );
        System.out.println("Minimum: " + Collections.min(integers));
        System.out.println("Maximum: " + Collections.max(integers));

        integers.sort(Comparator.naturalOrder());
        for(Integer num:integers ){
            System.out.println(num );
        }
    }

}
