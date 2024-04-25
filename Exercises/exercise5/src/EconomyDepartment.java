/**
 * Observer implementation for the Economy department.
 */
public class EconomyDepartment implements Observer {
    // Updates with economy-related news
    @Override
    public void update(String news) {
        if (news.contains("Economy")) {
            System.out.println("Economy Department: " + news);
        }
    }
}