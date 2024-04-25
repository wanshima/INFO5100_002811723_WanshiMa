package com.example.finalproject;

/**
 * Represents an observer in the observer pattern.
 */
public interface Observer {

    /**
     * Called by the subject that this observer is registered with whenever the subject's state changes.
     * This method is where the observer handles the update.
     */
    void update();
}
