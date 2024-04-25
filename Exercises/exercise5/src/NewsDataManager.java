import java.util.ArrayList;
import java.util.List;

/**
 * Singleton class to manage news data.
 * Ensures that only one instance of this class exists throughout the application.
 */
public class NewsDataManager {
    private static NewsDataManager instance; // Holds the singleton instance
    private List<String> newsItems; // List to store news items

    // Private constructor to prevent instantiation from outside the class
    private NewsDataManager() {
        newsItems = new ArrayList<>();
    }

    // Provides global access to the singleton instance
    public static synchronized NewsDataManager getInstance() {
        if (instance == null) {
            instance = new NewsDataManager();
        }
        return instance;
    }

    // Adds a news item to the list and notifies all departments
    public void addNewsItem(String news) {
        newsItems.add(news);
        NewsDepartment.notifyAllDepartments(news);
    }

    // Retrieves the list of all news items
    public List<String> getNewsItems() {
        return newsItems;
    }
}
