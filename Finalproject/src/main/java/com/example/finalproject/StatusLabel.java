package com.example.finalproject;

import javafx.scene.control.Label;

/**
 * A specialized label that acts as an observer, updating its text based on image processing events.
 */
public class StatusLabel extends Label implements Observer {
    private ImageProcessorSubject subject; // The subject that this label observes

    /**
     * Constructs a StatusLabel with a reference to an ImageProcessorSubject.
     * It registers itself as an observer to the subject to get updates about image processing events.
     *
     * @param subject The ImageProcessorSubject to observe.
     */
    public StatusLabel(ImageProcessorSubject subject) {
        this.subject = subject;
        this.subject.registerObserver(this); // Register this label as an observer
        setText("Ready to process images."); // Initial text to display
    }

    /**
     * Updates the text of the label when notified by the subject.
     * This method is called when the subject's state changes, indicating an image has been processed.
     */
    @Override
    public void update() {
        setText("Image has been processed."); // Update text to reflect the new state
    }
}
