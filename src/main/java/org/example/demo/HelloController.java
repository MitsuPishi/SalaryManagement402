package org.example.demo;

import javafx.animation.*;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class HelloController {
    public HelloApplication dd;
    public Button LoginBtn;
    public Label loginLabel;
    public TextField userInput;
    public PasswordField passInput;
    public BorderPane mainBorderPane;
    public void LoginClicked(MouseEvent mouseEvent) throws IOException {
        if(userInput.getText().equals("") && passInput.getText().equals("")) {
            loginLabel.setVisible(true);
            Stage window = (Stage) (mainBorderPane.getScene().getWindow());
            window.setScene(Dashboard.getScene());
        }
    }
    public void initialize() {

        // Get the current text value of the node.
        String text = LoginBtn.getText();

        // Then update the text into whatever case you like.
        LoginBtn.setText(text.toUpperCase());

        FadeTransition fadeIn = new FadeTransition(Duration.millis(300) , LoginBtn);
        fadeIn.setToValue(0.7);
        FadeTransition fadeOut = new FadeTransition(Duration.millis(300) , LoginBtn);
        fadeOut.setToValue(1);

        LoginBtn.setOnMouseEntered(e->{
            fadeIn.play();
        });
        LoginBtn.setOnMouseExited(e->{
            fadeOut.play();
            LoginBtn.setStyle("-fx-background-color: #57b846;");
        });
    }
}