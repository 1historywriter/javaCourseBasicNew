import java.util.ArrayList;
import java.util.Comparator;

public class Homework_01_01 {

    public static void main(String[] args) {

        ArrayList<String> Names = new ArrayList<>();
        System.out.println(Names.size());

        Names.add("Peter");
        Names.add("Anna");
        Names.add("Marina");
        Names.add("Anton");
        Names.add("Henry");
        System.out.println(Names);

        for(int i=0;i<Names.size();i++){
            System.out.println(Names.get(i));
        }
        for (String name : Names) {
            System.out.println(name);
        }

        Names.sort(Comparator.reverseOrder());


        for (String name : Names) {
            System.out.println(name);
        }
        Names.remove(1);
        System.out.println(Names);


    }
}