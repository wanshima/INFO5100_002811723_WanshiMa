package com.example.finalproject;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Main application class that starts the JavaFX application.
 */
public class Main extends Application {

    private GUIController guiController;  // Handles the user interface of the application.

    /**
     * Starts the application by setting up the main window.
     * @param primaryStage The primary window of the application.
     */
    @Override
    public void start(Stage primaryStage) {
        // Create the GUI controller, which manages what the user sees.
        guiController = new GUIController(new ImageProcessorSubject(), new ImageProcessorImpl());

        // Set the title of the window.
        primaryStage.setTitle("Image Processing App");

        // Load and display the user interface from GUIController.
        primaryStage.setScene(guiController.buildScene());

        // Make the window visible.
        primaryStage.show();
    }

    /**
     * The main method that launches the application.
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Start the JavaFX application.
        launch(args);
    }
}
