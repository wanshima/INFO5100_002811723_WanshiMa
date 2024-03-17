package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField inputField;

    private double firstNumber = 0;
    private String operator = "";
    private boolean start = true;

    @FXML
    private void processNumber(ActionEvent event) {
        if (start) {
            inputField.setText("");
            start = false;
        }

        String value = ((Button)event.getSource()).getText();
        inputField.setText(inputField.getText() + value);
    }

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

    @FXML
    public void processClear(ActionEvent event) {
        inputField.setText("");
    }
}
