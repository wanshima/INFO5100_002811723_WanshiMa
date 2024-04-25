/**
 * Concrete news article type for sports.
 */
public class SportsArticle extends NewsArticle {
    // Publishes a sports article
    @Override
    public void publish() {
        System.out.println("Publishing a sports article.");
    }
}