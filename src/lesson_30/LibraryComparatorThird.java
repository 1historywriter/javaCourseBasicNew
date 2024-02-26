package lesson_30;

import java.util.Comparator;

public class LibraryComparatorThird implements Comparator<Library> {
    @Override
    public int compare(Library name1, Library name2) {

        return name1.getName().compareTo(name2.getName());
    }
}
