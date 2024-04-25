package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Main application class that loads the FXML and sets up the primary stage.
 */
public class Main extends Application {

    /**
     * Starts the application by loading the FXML layout, setting the scene, and displaying the primary stage.
     * @param primaryStage The primary window of the application.
     * @throws Exception if there is an issue loading the FXML.
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/calculator/sample.fxml"));
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the application is initialized.
     * @param args the command line arguments passed to the application.
     */
    public static void main(String[] args) {
        launch(args);
    }
}