package com.example.finalproject;

/**
 * Represents the "Subject" part of the Observer pattern.
 * This interface is responsible for managing observers and notifying them of any changes.
 */
public interface Subject {

    /**
     * Registers an observer to receive updates.
     * This method adds an observer to the subject's internal list.
     *
     * @param o The observer that wants to subscribe to notifications.
     */
    void registerObserver(Observer o);

    /**
     * Removes an observer from the subject's notification list.
     * This method ensures the observer will no longer receive updates.
     *
     * @param o The observer to be removed.
     */
    void removeObserver(Observer o);

    /**
     * Notifies all registered observers of a change.
     * This method calls the update method on all observers in the list.
     */
    void notifyObservers();
}
