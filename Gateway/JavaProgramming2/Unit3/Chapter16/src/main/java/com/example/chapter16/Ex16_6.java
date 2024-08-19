package com.example.chapter16;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Ex16_6 extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        TextField tfTextField = new TextField();
        TextField tfColSize = new TextField();
        tfTextField.setAlignment(Pos.BOTTOM_RIGHT);
        tfColSize.setAlignment(Pos.BOTTOM_RIGHT);
        tfColSize.setAlignment(Pos.BOTTOM_RIGHT);
        tfTextField.setPrefColumnCount(13);
        tfColSize.setPrefColumnCount(3);

        HBox hBox1 = new HBox(5);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(new Label("Text Field"), tfTextField);

        HBox hBox2 = new HBox(5);
        hBox2.setAlignment(Pos.CENTER);
        RadioButton rbLeft = new RadioButton(("Left"));
        RadioButton rbCenter = new RadioButton(("Center"));
        RadioButton rbRight= new RadioButton(("Right"));
        hBox2.getChildren().addAll(rbLeft, rbCenter, rbRight);

        ToggleGroup group = new ToggleGroup();
        rbLeft.setToggleGroup(group);
        rbCenter.setToggleGroup(group);
        rbRight.setToggleGroup(group);

        HBox hBox3 = new HBox(5);
        hBox3.getChildren().addAll(new Label("Column Size"), tfColSize);

        HBox hBox4 = new HBox(15);
        hBox4.setAlignment(Pos.CENTER);
        hBox4.getChildren().addAll(hBox2, hBox3);

        VBox vbx = new VBox(10);
        vbx.getChildren().addAll(hBox1, hBox4);

        Scene scene = new Scene(vbx, 400, 80);
        stage.setTitle("Ex 16_6");
        stage.setScene(scene);
        stage.show();

        rbLeft.setOnAction(e -> tfTextField.setAlignment(Pos.BASELINE_LEFT));
        rbCenter.setOnAction(e -> tfTextField.setAlignment(Pos.BASELINE_CENTER));
        rbRight.setOnAction(e -> tfTextField.setAlignment(Pos.BASELINE_RIGHT));

        tfColSize.setOnAction(e -> {
            tfTextField.setPrefColumnCount(Integer.parseInt(tfColSize.getText()));
        });
    }

    public static void main(String[] args) {
        launch();
    }
}