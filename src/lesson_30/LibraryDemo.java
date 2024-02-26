package lesson_30;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class LibraryDemo {
    public static void main(String[] args) {
        Comparator<Library> libraryComparator = new LibraryComparatorThird().thenComparing(new LibraryComparatorSecond());

        Set<Library> librarySet = new TreeSet<>(libraryComparator);

        librarySet.add(new Library("Black Swan", 101));
        librarySet.add(new Library("Mr. X", 808));
        librarySet.add(new Library("Mr. Y", 404));
        librarySet.add(new Library("Mr. T", 303));

        System.out.println(librarySet);
    }
}
