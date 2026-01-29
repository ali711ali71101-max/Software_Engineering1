package LibraryLinkedList;
public class LibraryList {

    BookNode head;
    OperationNode opHead;

    private void log(String text) {
        OperationNode newNode = new OperationNode(text);
        if (opHead == null) {
            opHead = newNode;
        } else {
            OperationNode temp = opHead;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
    }

    public void addBook(Book book) {
        BookNode newNode = new BookNode(book);
        if (head == null) {
            head = newNode;
        } else {
            BookNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = newNode;
        }
        log("Added book: " + book.title);
    }

    public void deleteBook(int id) {
        if (head == null) return;

        if (head.data.id == id) {
            log("Deleted book: " + head.data.title);
            head = head.next;
            return;
        }

        BookNode temp = head;
        while (temp.next != null && temp.next.data.id != id)
            temp = temp.next;

        if (temp.next != null) {
            log("Deleted book: " + temp.next.data.title);
            temp.next = temp.next.next;
        }
    }

    public Book searchBook(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.data.id == id)
                return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public void sortBooks() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            BookNode temp = head;
            while (temp.next != null) {
                if (temp.data.id > temp.next.data.id) {
                    Book t = temp.data;
                    temp.data = temp.next.data;
                    temp.next.data = t;
                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);

        log("Sorted books by ID");
    }

    public void borrowBook(int id) {
        Book book = searchBook(id);
        if (book != null && !book.isBorrowed) {
            book.isBorrowed = true;
            log("Borrowed book: " + book.title);
        }
    }

    public void returnBook(int id) {
        Book book = searchBook(id);
        if (book != null && book.isBorrowed) {
            book.isBorrowed = false;
            log("Returned book: " + book.title);
        }
    }

    public void displayBooks() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void showOperations() {
        System.out.println("Operation Log:");
        OperationNode temp = opHead;
        while (temp != null) {
            System.out.println("- " + temp.operation);
            temp = temp.next;
        }
    }
}
