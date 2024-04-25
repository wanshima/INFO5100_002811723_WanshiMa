package com.example.finalproject;

import javafx.scene.image.WritableImage;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.PixelFormat;
import java.awt.image.BufferedImage;

/**
 * Implementation of the ImageProcessor interface to convert BufferedImage objects to WritableImage objects.
 */
public class ImageProcessorImpl implements ImageProcessor {

    /**
     * Converts a BufferedImage to a WritableImage.
     * This method is useful for integrating AWT-based BufferedImage with JavaFX-based WritableImage.
     * @param bufferedImage The BufferedImage to convert.
     * @return A WritableImage that can be displayed in JavaFX applications.
     */
    @Override
    public WritableImage convertToFxImage(BufferedImage bufferedImage) {
        int width = bufferedImage.getWidth();  // Get the width of the source image.
        int height = bufferedImage.getHeight();  // Get the height of the source image.
        WritableImage writableImage = new WritableImage(width, height);  // Create a new writable image of the same size.
        PixelWriter pixelWriter = writableImage.getPixelWriter();  // Get the PixelWriter to modify pixels of the writable image.

        int[] buffer = new int[width * height];  // Create a buffer to hold ARGB pixels.
        bufferedImage.getRGB(0, 0, width, height, buffer, 0, width);  // Extract pixels into the buffer.

        // Write pixels from the buffer into the WritableImage using PixelWriter.
        pixelWriter.setPixels(0, 0, width, height, PixelFormat.getIntArgbPreInstance(), buffer, 0, width);

        return writableImage;  // Return the newly created writable image.
    }
}
