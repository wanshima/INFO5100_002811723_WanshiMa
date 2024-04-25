/**
 * Factory for creating news articles based on the type.
 */
public class ArticleFactory {
    // Creates and returns an article based on the type specified
    public static NewsArticle createArticle(String type) {
        if (type.equalsIgnoreCase("sports")) {
            return new SportsArticle();
        } else if (type.equalsIgnoreCase("economy")) {
            return new EconomyArticle();
        } else {
            return null;
        }
    }
}
