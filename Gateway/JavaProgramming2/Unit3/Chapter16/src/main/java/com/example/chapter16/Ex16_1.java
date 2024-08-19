package com.example.chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Ex16_1 extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbYellow = new RadioButton("Yellow");
        RadioButton rbBlack = new RadioButton("Black");
        RadioButton rbOrange = new RadioButton("Orange");
        RadioButton rbGreen = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbYellow.setToggleGroup(group);
        rbBlack.setToggleGroup(group);
        rbOrange.setToggleGroup(group);
        rbGreen.setToggleGroup(group);

        HBox rbhbox = new HBox(8);
        rbhbox.getChildren().addAll(rbRed, rbYellow, rbBlack, rbOrange, rbGreen);
        rbhbox.setAlignment(Pos.CENTER);

        Pane textpane = new Pane();
        Text text = new Text(110, 50, "Programming is Fun!");
        text.setFont(new Font("Arial", 20));
        textpane.getChildren().add(text);
        textpane.setStyle("-fx-border-color: blue");

        HBox btnhbox = new HBox(8);
        Button btnLeft = new Button("  <=  ");
        Button btnRight = new Button("  =>  ");
        btnhbox.getChildren().addAll(btnLeft, btnRight);
        btnhbox.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setTop(rbhbox);
        pane.setCenter(textpane);
        pane.setBottom(btnhbox);

        Scene scene = new Scene(pane, 400, 120);
        stage.setTitle("Ex 16_1");
        stage.setScene(scene);
        stage.show();

        btnLeft.setOnAction(e -> text.setX(text.getX() - 10));
        btnRight.setOnAction(e -> text.setX(text.getX() + 10));

        rbRed.setOnAction(e -> text.setFill(Color.RED));
        rbYellow.setOnAction(e -> text.setFill(Color.YELLOW));
        rbBlack.setOnAction(e -> text.setFill(Color.BLACK));
        rbOrange.setOnAction(e -> text.setFill(Color.ORANGE));
        rbGreen.setOnAction(e -> text.setFill(Color.GREEN));
    }

    public static void main(String[] args) {
        launch();
    }
}