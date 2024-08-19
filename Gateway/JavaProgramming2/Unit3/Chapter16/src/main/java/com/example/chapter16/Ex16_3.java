package com.example.chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Ex16_3 extends Application {

    @Override // Override the start method in the Application class
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Rectangle rect = new Rectangle(130, 20, 40, 120);
        rect.setFill(Color.WHITE);
        rect.setStroke(Color.BLACK);
        Circle cRed = new Circle(150, 40, 15, Color.WHITE);
        Circle cYellow = new Circle(150, 80, 15, Color.WHITE);
        Circle cGreen = new Circle(150, 120, 15, Color.WHITE);
        cRed.setStroke(Color.BLACK);
        cYellow.setStroke(Color.BLACK);
        cGreen.setStroke(Color.BLACK);
        pane.getChildren().addAll(rect, cRed, cYellow, cGreen);

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbGreen = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        HBox rbhbox = new HBox(5);
        rbhbox.getChildren().addAll(rbRed, rbYellow, rbGreen);
        rbhbox.setAlignment(Pos.CENTER);

        BorderPane bpane = new BorderPane();
        bpane.setCenter(pane);
        bpane.setBottom(rbhbox);

        rbRed.setOnAction( e-> {
            cRed.setFill(Color.RED);
            cYellow.setFill(Color.WHITE);
            cGreen.setFill(Color.WHITE);
        });

        rbYellow.setOnAction( e-> {
            cRed.setFill(Color.WHITE);
            cYellow.setFill(Color.YELLOW);
            cGreen.setFill(Color.WHITE);
        });

        rbGreen.setOnAction( e-> {
            cRed.setFill(Color.WHITE);
            cYellow.setFill(Color.WHITE);
            cGreen.setFill(Color.GREEN);
        });

        Scene scene = new Scene(bpane, 300, 300);
        primaryStage.setTitle("Exercise16_3");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}