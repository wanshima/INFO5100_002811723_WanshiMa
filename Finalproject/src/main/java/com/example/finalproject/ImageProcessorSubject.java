package com.example.finalproject;

import java.util.ArrayList;
import java.util.List;

/**
 * This class serves as the subject part of the Observer pattern,
 * managing notifications to observers when the image processing state changes.
 */
public class ImageProcessorSubject implements Subject {
    private List<Observer> observers;  // List to keep track of all the observers
    private boolean imageProcessed;    // Flag to track whether an image has been processed

    /**
     * Constructor to initialize the observer list.
     */
    public ImageProcessorSubject() {
        observers = new ArrayList<>();
    }

    /**
     * Registers an observer to be notified of changes.
     * @param o The observer to register.
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * Removes an observer from the notification list.
     * @param o The observer to be removed.
     */
    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);  // Remove the observer if it is found in the list
        }
    }

    /**
     * Notifies all registered observers of a change in the image processing state.
     */
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();  // Call update on each observer
        }
    }

    /**
     * Marks that an image has been processed and notifies all observers.
     */
    public void imageProcessed() {
        this.imageProcessed = true;  // Set the processed flag to true
        notifyObservers();           // Notify all observers of the change
    }

    /**
     * Checks if the image has been processed.
     * @return true if the image has been processed, false otherwise.
     */
    public boolean isImageProcessed() {
        return imageProcessed;
    }
}
