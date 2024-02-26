package lesson_30;

import java.util.Comparator;

public class LibraryComparatorSecond implements Comparator<Library> {
    @Override
    public int compare(Library name1, Library name2) { return name1.getId() - name2.getId(); }

}
