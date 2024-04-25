package com.example.finalproject;

/**
 * Defines the interface for GUI components in the application.
 * This interface ensures that all GUI components adhere to a standard for initialization and event handling.
 */
public interface GUIComponent {

    /**
     * Initializes all GUI components.
     * This method should set up the layout and visual elements of the GUI component.
     */
    void initializeComponents();

    /**
     * Sets up event handlers for GUI components.
     * This method should attach necessary event listeners to the components for handling user interaction.
     */
    void setupEventHandlers();
}
