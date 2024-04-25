import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Represents a library system that manages books and user accounts.
 */
public class Library {
    private List<Book> books;
    private Map<String, String> userCredentials;

    /**
     * Constructor for Library that initializes book list and user credentials.
     */
    public Library() {
        this.books = new ArrayList<>();
        this.userCredentials = new HashMap<>();
    }

    /**
     * Adds a book to the library unless the ISBN already exists.
     * @param book The book to be added.
     */
    public void addBook(Book book) {
        for (Book b : books) {
            if (b.getIsbn().equals(book.getIsbn())) {
                return;
            }
        }
        books.add(book);
    }

    /**
     * Removes a book from the library by its ISBN.
     * @param isbn The ISBN of the book to be removed.
     */
    public void removeBook(String isbn) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getIsbn().equals(isbn)) {
                books.remove(i);
                break;
            }
        }
    }

    /**
     * Searches for books by title.
     * @param title The title to search for.
     * @return A list of books with matching titles.
     */
    public List<Book> searchByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    /**
     * Searches for books by author.
     * @param author The author to search for.
     * @return A list of books with matching authors.
     */
    public List<Book> searchByAuthor(String author) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    /**
     * Searches for books by genre.
     * @param genre The genre to search for.
     * @return A list of books with matching genres.
     */
    public List<Book> searchByGenre(String genre) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    /**
     * Displays all available books in the library.
     */
    public void displayAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
            }
        }
    }

    /**
     * Attempts to check out a book by ISBN.
     * @param isbn The ISBN of the book to check out.
     * @return true if the book was available and checked out successfully, false otherwise.
     */
    public boolean checkoutBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isAvailable()) {
                book.setAvailable(false);
                book.addTimesOfBorrow();
                return true;
            }
        }
        return false;
    }

    /**
     * Returns a book to the library by ISBN.
     * @param isbn The ISBN of the book to return.
     * @return true if the book was successfully returned, false if the book was not found.
     */
    public boolean returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isAvailable()) {
                book.setAvailable(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Saves the current library state to a file.
     * @param filename The file to save the library data.
     */
    public void saveLibraryToFile(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(books);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads the library state from a file.
     * @param filename The file from which to load the library data.
     */
    public void loadLibraryFromFile(String filename) {
        File file = new File(filename);
        if (!file.exists()) {
            books = new ArrayList<>();
            return;
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            List<Book> loadedBooks = (List<Book>) in.readObject();
            for (Book loadedBook : loadedBooks) {
                boolean exists = false;
                for (Book b : books) {
                    if (b.getIsbn().equals(loadedBook.getIsbn())) {
                        return;
                    }
                }
                books.add(loadedBook);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    /**
     * Sorts books in the library by their titles.
     */
    public void sortBooksByTitle() {
        books.sort(Comparator.comparing(Book::getTitle));
    }

    /**
     * Adds a user to the library system.
     * @param username The username for the new user.
     * @param password The password for the new user.
     * @return true if the user was added successfully, false if the user already exists.
     */
    public boolean addUser(String username, String password) {
        if (userCredentials.containsKey(username)) {
            System.out.println("User already exists.");
            return false;
        }
        userCredentials.put(username, password);
        return true;
    }

    /**
     * Authenticates a user against stored credentials.
     * @param username The username to authenticate.
     * @param password The password to authenticate against.
     * @return true if authentication is successful, false otherwise.
     */
    public boolean authenticateUser(String username, String password) {
        String storedPassword = userCredentials.get(username);
        if (storedPassword != null && storedPassword.equals(password)) {
            System.out.println("User authenticated successfully.");
            return true;
        }
        System.out.println("Authentication failed.");
        return false;
    }
}
