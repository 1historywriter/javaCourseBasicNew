package consultation_11;

import java.util.List;

public class Library {
    private List <Book> books;
    private List <Reader> readers;

    public List<Book> getBooks() {
        return books;
    }

    public Library(List<Book> books) {
        this.books = books;
    }
}

public void addBook (Book book) {
    books.add(book);
}
public void addReader (Reader reader){
    readers.add(reader);
}
public void addBookToReader(int readerId, int bookId){
    /*
    1.) find the Book, who has the Id cons to the BookId
    2.) find the Reader, who has the Id cons to the ReaderId
    3.) List <Book> booksByReader put a new book, Id cons the bookId
     */