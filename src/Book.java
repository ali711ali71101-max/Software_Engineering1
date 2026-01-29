package LibraryLinkedList;
public class Book {
    int id;
    String title;
    String author;
    boolean isBorrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + author +
                (isBorrowed ? " (Borrowed)" : " (Available)");
    }
}
