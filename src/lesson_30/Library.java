package lesson_30;

import java.util.Objects;

public class Library {
    private String name;
    private int id;

    public Library(String name, int id){
        this.name = name;
        this.id = id;

    }
    public String getName(){ return name;}
    public int getId(){ return id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return id == library.id && Objects.equals(name, library.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}


