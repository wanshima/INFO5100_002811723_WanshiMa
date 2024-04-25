/**
 * Observer implementation for the Sports department.
 */
public class SportsDepartment implements Observer {
    // Updates with sports-related news
    @Override
    public void update(String news) {
        if (news.contains("Sports")) {
            System.out.println("Sports Department: " + news);
        }
    }
}