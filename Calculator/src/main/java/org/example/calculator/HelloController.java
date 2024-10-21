package org.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField txt_result;

    private calculator calculator = new calculator();

    @FXML
    void Number(ActionEvent event) {
        Button button = (Button) event.getSource();
        String number = button.getText();
        String oldText = txt_result.getText();
        String newText = oldText+ number;
        txt_result.setText(newText);
    }

    @FXML
    void Operation(ActionEvent event) {
        Button button = (Button) event.getSource();
        String operation = button.getText();
    }

    @FXML
    void equals(ActionEvent event) {
        Button button = (Button) event.getSource();
        String oldText = txt_result.getText();
        String newText = oldText + button.getText();
        txt_result.setText(newText);
    }
    @FXML
    void point(ActionEvent event) {
        Button button = (Button) event.getSource();
        String point = button.getText();
        String oldText = txt_result.getText();
        if (!oldText.contains(".")) { // Проверяем если точка уже или нет, если есть то не добавляем
            String newText = oldText + point;//если нет, то добавляем
            txt_result.setText(newText);
            }
    }
}


