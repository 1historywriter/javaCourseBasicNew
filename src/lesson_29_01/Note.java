package lesson_29_01;

import java.util.*;
public class Note {
    public static void main(String[] args) {
        Map<String, List<Student>> stringStudentMap = new HashMap<>();

        Student student1 = new Student("Peter", "15");
        Student student2 = new Student("Ivan", "12");

        List<Student> mathStudents = new ArrayList<>();
        mathStudents.add(student1);

        List<Student> englishStudents = new ArrayList<>();
        englishStudents.add(student2);

        stringStudentMap.put("math_students", mathStudents);
        stringStudentMap.put("english_students", englishStudents);

        for (String key : stringStudentMap.keySet()){
            List<Student> currentKeyStudents = stringStudentMap.get(key);

            System.out.println("Оценка студента : " + key);
            for (int i = 0; i < currentKeyStudents.size(); i++) {
                System.out.println("Student name: " + currentKeyStudents.get(i). getName());
            }
        }
    }

}
