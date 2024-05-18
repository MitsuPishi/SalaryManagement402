package org.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;

public class HelloController {
    public Button LoginBtn;
    public Label loginLabel;

    public void LoginClicked(MouseEvent mouseEvent) {
        loginLabel.setVisible(true);
        loginLabel.setText("Sign in button pressed");
    }
}