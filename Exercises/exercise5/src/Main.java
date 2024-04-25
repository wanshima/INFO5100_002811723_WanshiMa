/**
 * Main class to demonstrate the design patterns implemented.
 */
public class Main {
    public static void main(String[] args) {
        NewsDepartment newsDepartment = new NewsDepartment();
        newsDepartment.registerObserver(new SportsDepartment());
        newsDepartment.registerObserver(new EconomyDepartment());

        NewsArticle article = ArticleFactory.createArticle("sports");
        article.publish();

        NewsDataManager dataManager = NewsDataManager.getInstance();
        dataManager.addNewsItem("Sports: Local team wins!");
    }
}
