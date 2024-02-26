package consultation_11;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private int readerId;
    private String name;
    private List<Book> booksByReader;

    public Reader(int readerId, String name) {
        this.readerId = readerId;
        this.name = name;
        this.booksByReader = new ArrayList<>();
    }

    public int getReaderId() {
        return readerId;
    }

    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }
}
