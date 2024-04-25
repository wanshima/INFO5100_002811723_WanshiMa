package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * Controller for the Calculator, handling button presses and updating the display.
 */
public class Controller {

    @FXML
    private TextField inputField;

    private double firstNumber = 0;
    private String operator = "";
    private boolean start = true;

    /**
     * Processes number button presses to update the input field.
     * @param event The event triggered by button presses.
     */
    @FXML
    private void processNumber(ActionEvent event) {
        if (start) {
            inputField.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        inputField.setText(inputField.getText() + value);
    }

    /**
     * Processes operator button presses, performs calculations, or prepares for new calculations.
     * @param event The event triggered by button presses.
     */
    @FXML
    private void processOperator(ActionEvent event) {
        String value = ((Button)event.getSource()).getText();

        if (!"=".equals(value)) {
            if (!operator.isEmpty())
                return;

            operator = value;
            firstNumber = Double.parseDouble(inputField.getText());
            inputField.setText("");
        } else {
            if (operator.isEmpty())
                return;

            inputField.setText(String.valueOf(calculate(firstNumber, Double.parseDouble(inputField.getText()), operator)));
            operator = "";
            start = true;
        }
    }

    /**
     * Performs the calculation based on the operation type.
     * @param firstNumber The first number.
     * @param secondNumber The second number.
     * @param operator The mathematical operator.
     * @return The result of the operation.
     */
    private double calculate(double firstNumber, double secondNumber, String operator) {
        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if (secondNumber == 0) {
                    return 0;
                }
                return firstNumber / secondNumber;
        }

        return 0;
    }

    /**
     * Clears the input field when the clear button is pressed.
     * @param event The event triggered by button press.
     */
    @FXML
    public void processClear(ActionEvent event) {
        inputField.setText("");
    }
}
