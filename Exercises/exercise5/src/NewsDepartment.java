import java.util.ArrayList;
import java.util.List;


/**
 * Implementation of Observable that manages a list of observers and notifies them of news.
 */
public class NewsDepartment implements Observable {
    private static List<Observer> observers = new ArrayList<>();

    // Notifies all registered observers with the provided news
    public static void notifyAllDepartments(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    // Registers an observer
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Removes an observer
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifies all observers about the news
    @Override
    public void notifyObservers(String news) {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }
}