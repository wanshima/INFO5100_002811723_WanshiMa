import java.nio.file.*;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Demonstrates reading, parsing, and manipulating JSON data using the org.json library.
 */
public class JSONParser {
    public static void main(String[] args) throws Exception {
        // Read JSON file content into a string
        String content = new String(Files.readAllBytes(Paths.get("src/books.json")));
        // Parse the content string into a JSONObject
        JSONObject obj = new JSONObject(content);

        System.out.println("BookShelf:");
        JSONArray books = obj.getJSONObject("BookShelf").getJSONArray("Book");
        printBookDetails(books);

        JSONObject newBook = new JSONObject();
        newBook.put("title", "The Hunter: A Novel");
        newBook.put("publishedYear", "2024");
        newBook.put("numberOfPages", 474);
        newBook.put("author", "Tana French");

        books.put(newBook);
        printBookDetails(books);
    }

    /**
     * Prints detailed information about each book in a JSON array.
     * @param books The JSONArray containing JSONObjects each representing a book.
     */
    private static void printBookDetails(JSONArray books) {
        for (int i = 0; i < books.length(); i++) {
            JSONObject book = books.getJSONObject(i);
            System.out.println("\nTitle: " + book.getString("title"));
            System.out.println("Published Year: " + book.getString("publishedYear"));
            System.out.println("Number of Pages: " + book.getInt("numberOfPages"));
            System.out.println("Author: " + book.getString("author"));
        }
    }
}
