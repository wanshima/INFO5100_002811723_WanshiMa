public class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        library.loadLibraryFromFile("library.dat");

        library.addBook(new Book("Book1", "Author1", "Genre1", "ISBN1"));
        library.addBook(new Book("Book2", "Author2", "Genre2", "ISBN2"));

        System.out.println("Available books:");
        library.displayAvailableBooks();

        if (library.checkoutBook("ISBN1")) {
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book not found.");
        }

        if (library.checkoutBook("ISBN1")) {
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book not found.");
        }

        if (library.returnBook("ISBN1")) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book not found.");
        }

        library.saveLibraryToFile("library.dat");

        System.out.println("Search results for books by Author1:");
        library.searchByAuthor("Author1").forEach(System.out::println);

        library.sortBooksByTitle();
        System.out.println("Books sorted by title:");
        library.displayAvailableBooks();

        library.addUser("user1", "password123");

        if (library.authenticateUser("user1", "password123")) {
            System.out.println("Login successful, proceed with library operations.");
        } else {
            System.out.println("Login failed.");
        }
    }

    }
