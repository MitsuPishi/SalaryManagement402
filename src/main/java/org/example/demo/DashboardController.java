package org.example.demo;

import javafx.animation.AnimationTimer;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DashboardController {
    public VBox dashboardMenu;
    public Pane DashboardTime;
    public Label timeLabel;
    public GridPane DashboardGrid;

    public void OnBurgerClicked(MouseEvent mouseEvent) {
        dashboardMenu.setDisable(!dashboardMenu.isDisable());
        dashboardMenu.setVisible(!dashboardMenu.isVisible());
        DashboardGrid.setPadding(new Insets(43 , 0, 0,0));
    }
    public void initialize() {
        timer.start();
    }
    AnimationTimer timer = new AnimationTimer() {
        @Override
        public void handle(long now) {
            timeLabel.setText(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }
    };
}
