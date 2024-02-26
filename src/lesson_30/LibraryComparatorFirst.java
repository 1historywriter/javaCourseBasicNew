package lesson_30;

import java.util.Comparator;

public class LibraryComparatorFirst implements Comparator<Library> {
    @Override
    public int compare(Library name1, Library name2) {
        int compareResult = name1.getId() - name2.getId();
        if (compareResult == 0) {
            compareResult = name1.getName().compareTo(name2.getName());
        }
        return compareResult;
    }

}
