/**
 * Concrete news article type for economy.
 */
public class EconomyArticle extends NewsArticle {
    // Publishes an economy article
    @Override
    public void publish() {
        System.out.println("Publishing an economy article.");
    }
}