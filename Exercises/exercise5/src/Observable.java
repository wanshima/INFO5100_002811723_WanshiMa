/**
 * Observable interface defining methods for registering, removing, and notifying observers.
 */
public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String news);
}

