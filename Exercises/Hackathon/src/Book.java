import java.io.Serializable;

/**
 * Represents a book in a library.
 * Implements Serializable to allow book instances to be saved to a file.
 */
public class Book implements Serializable {
    private String title;
    private String author;
    private String genre;
    private String isbn;
    private boolean isAvailable;
    private int timesOfBorrow;

    /**
     * Constructor for creating a new book.
     * @param title The title of the book
     * @param author The author of the book
     * @param genre The genre of the book
     * @param isbn The ISBN of the book
     */
    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getTimesOfBorrow() {
        return timesOfBorrow;
    }

    public void addTimesOfBorrow() {
        this.timesOfBorrow++;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * Returns a string representation of the book with detailed info.
     * @return Detailed string about the book.
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Genre: " + genre + ", ISBN: " + isbn + ", Available: " + isAvailable + ", Number of times the book has been borrowed: " + timesOfBorrow;
    }
}
