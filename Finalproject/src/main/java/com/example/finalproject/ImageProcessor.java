package com.example.finalproject;

import java.awt.image.BufferedImage;
import javafx.scene.image.Image;

/**
 * This interface provides a method for converting images from one format to another.
 */
public interface ImageProcessor {

    /**
     * Converts a BufferedImage from Java AWT into a JavaFX Image.
     *
     * @param image The BufferedImage to be converted.
     * @return A JavaFX Image object representing the same image data as the provided BufferedImage.
     */
    Image convertToFxImage(BufferedImage image);
}
