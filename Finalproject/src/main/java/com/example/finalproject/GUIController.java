package com.example.finalproject;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Controls the user interface for the application.
 */
public class GUIController implements GUIComponent {
    private VBox root; // The root container for all UI elements.
    private ImageProcessorSubject processorSubject; // The subject for observer pattern in image processing.
    private ImageProcessor imageProcessor; // Handles the conversion of images.

    /**
     * Constructs a GUI controller with necessary dependencies.
     * @param processorSubject The subject that observers can subscribe to.
     * @param imageProcessor The processor for handling image conversions.
     */
    public GUIController(ImageProcessorSubject processorSubject, ImageProcessor imageProcessor) {
        this.processorSubject = processorSubject;
        this.imageProcessor = imageProcessor;
        this.root = new VBox(10);
        initializeComponents();
        setupEventHandlers();
    }

    /**
     * Initializes all components in the GUI.
     */
    @Override
    public void initializeComponents() {
        Button uploadBtn = new Button("Upload Image"); // Button to upload images.
        StatusLabel statusLabel = new StatusLabel(processorSubject); // Label to display status.
        root.getChildren().addAll(uploadBtn, statusLabel); // Add components to the root.
    }

    /**
     * Sets up event handlers for the UI components.
     */
    @Override
    public void setupEventHandlers() {
        Button uploadBtn = (Button) root.getChildren().get(0); // Get the upload button.
        uploadBtn.setOnAction(e -> uploadImages((Stage) uploadBtn.getScene().getWindow())); // Set the action for the upload button.
    }

    /**
     * Opens a file chooser to upload images and displays them as thumbnails.
     * @param stage The stage from which the file chooser is shown.
     */
    private void uploadImages(Stage stage) {
        FileChooser fileChooser = new FileChooser(); // Creates a new file chooser.
        fileChooser.setTitle("Select Images"); // Title for the file chooser window.
        fileChooser.getExtensionFilters().addAll( // Filters to only show image files.
                new FileChooser.ExtensionFilter("All Images", "*.jpg", "*.jpeg", "*.png", "*.bmp", "*.gif"),
                new FileChooser.ExtensionFilter("JPG", "*.jpg"),
                new FileChooser.ExtensionFilter("JPEG", "*.jpeg"),
                new FileChooser.ExtensionFilter("PNG", "*.png"),
                new FileChooser.ExtensionFilter("BMP", "*.bmp"),
                new FileChooser.ExtensionFilter("GIF", "*.gif")
        );
        List<File> files = fileChooser.showOpenMultipleDialog(stage); // Show file chooser and get selected files.
        if (files != null) {
            files.forEach(file -> {
                try {
                    BufferedImage bufferedImage = ImageIO.read(file); // Read the image file.
                    Image image = imageProcessor.convertToFxImage(bufferedImage); // Convert to JavaFX image.
                    ImageView imageView = new ImageView(image); // Create an image view for the image.
                    imageView.setFitHeight(100); // Set the thumbnail height.
                    imageView.setFitWidth(100); // Set the thumbnail width.
                    root.getChildren().add(imageView); // Add the image view to the root container.
                    displayImageProperties(bufferedImage, file); // Display image properties.
                    addConversionAndDownloadOptions(bufferedImage, file.getName()); // Add options for conversion and download.
                    processorSubject.imageProcessed(); // Notify observers that image has been processed.
                } catch (IOException ex) {
                    ex.printStackTrace(); // Print stack trace if an exception occurs.
                }
            });
        }
    }

    /**
     * Displays properties of the uploaded image.
     * @param image The image whose properties are to be displayed.
     * @param file The file from which the image was loaded.
     */
    private void displayImageProperties(BufferedImage image, File file) {
        Label propertiesLabel = new Label("Image Properties: " +
                "\nWidth: " + image.getWidth() +
                "\nHeight: " + image.getHeight() +
                "\nFile: " + file.getName()); // Create a label with image properties.
        root.getChildren().add(propertiesLabel); // Add the properties label to the root.
    }

    /**
     * Adds options to convert and download the image in different formats.
     * @param image The image to be converted and downloaded.
     * @param fileName The name of the file to be saved.
     */
    private void addConversionAndDownloadOptions(BufferedImage image, String fileName) {
        ComboBox<String> formatBox = new ComboBox<>(); // Drop-down list for selecting image format.
        formatBox.getItems().addAll("PNG", "JPEG", "GIF", "BMP"); // Add image formats to the combo box.
        formatBox.setValue("PNG"); // Set the default format.

        Button convertBtn = new Button("Convert"); // Button to start conversion.
        convertBtn.setOnAction(e -> {
            try {
                convertImage(image, formatBox.getValue(), fileName); // Convert the image when button is clicked.
            } catch (IOException ex) {
                ex.printStackTrace(); // Print stack trace if an exception occurs.
            }
        });

        root.getChildren().add(new HBox(10, formatBox, convertBtn)); // Add the combo box and button to the root.
    }

    /**
     * Converts the image to the selected format and saves it.
     * @param image The image to be converted.
     * @param format The format to convert the image to.
     * @param fileName The name of the file to be saved.
     * @throws IOException If an error occurs during writing the file.
     */
    private void convertImage(BufferedImage image, String format, String fileName) throws IOException {
        if (!format.equals("PNG") && image.getType() != BufferedImage.TYPE_INT_RGB) {
            BufferedImage convertedImage = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_INT_RGB);
            convertedImage.getGraphics().drawImage(image, 0, 0, null);
            image = convertedImage;
        }

        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Image As");
        fileChooser.setInitialFileName(fileName + "_converted." + format.toLowerCase());
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(format + " files", "*." + format.toLowerCase()));
        File file = fileChooser.showSaveDialog(null);
        if (file != null) {
            ImageIO.write(image, format, file);
        }
    }

    /**
     * Builds the scene containing all UI components.
     * @return The scene to be displayed in the application.
     */
    public Scene buildScene() {
        return new Scene(root, 800, 600);
    }
}
