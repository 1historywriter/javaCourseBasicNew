package lesson_29_01;

import java.util.Objects;
public class Student {
    private String name;

    private String note;
    public Student(String name, String note) {
        this.name = name;
        this.note = note;
    }

//    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
 //       if (obj == null) || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(name, student.name) && Objects.equals(note, student.note);
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, note);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}

