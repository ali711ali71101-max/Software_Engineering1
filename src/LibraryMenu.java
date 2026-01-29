package LibraryLinkedList;
import java.util.Scanner;

public class LibraryMenu {

    private LibraryList library;
    private Scanner input;

    public LibraryMenu() {
        library = new LibraryList();
        input = new Scanner(System.in);
    }

    public void start() {
        int choice;

        do {
            System.out.println("\n===== Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Delete Book");
            System.out.println("3. Search Book");
            System.out.println("4. Sort Books");
            System.out.println("5. Borrow Book");
            System.out.println("6. Return Book");
            System.out.println("7. Show All Books");
            System.out.println("8. Show Operation Log");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = input.nextInt();

            switch (choice) {

                case 1:
                    addBook();
                    break;

                case 2:
                    System.out.print("Enter Book ID: ");
                    library.deleteBook(input.nextInt());
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    Book b = library.searchBook(input.nextInt());
                    if (b != null)
                        System.out.println(b);
                    else
                        System.out.println("Book not found");
                    break;

                case 4:
                    library.sortBooks();
                    System.out.println("Books sorted");
                    break;

                case 5:
                    System.out.print("Enter Book ID: ");
                    library.borrowBook(input.nextInt());
                    break;

                case 6:
                    System.out.print("Enter Book ID: ");
                    library.returnBook(input.nextInt());
                    break;

                case 7:
                    library.displayBooks();
                    break;

                case 8:
                    library.showOperations();
                    break;

                case 0:
                    System.out.println("Goodbye 👋");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 0);
    }

    private void addBook() {
        System.out.print("Enter Book ID: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Enter Title: ");
        String title = input.nextLine();

        System.out.print("Enter Author: ");
        String author = input.nextLine();

        library.addBook(new Book(id, title, author));
        System.out.println("Book added successfully");
    }
}
