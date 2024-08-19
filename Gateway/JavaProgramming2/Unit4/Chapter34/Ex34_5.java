package com.example.chapter34;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.sql.*;

public class Ex34_5 extends Application {

    private TextField tfTableName = new TextField();
    private Button btnShowContents = new Button("Show Contents");
    private Label lblStatus = new Label();
    private TextArea taResult = new TextArea();
    private Statement stmt;

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Table Name"), tfTableName, btnShowContents);
        hBox.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setTop(hBox);
        pane.setBottom(lblStatus);
        pane.setCenter(new ScrollPane(taResult));

        Scene scene = new Scene(pane, 600, 200);
        primaryStage.setTitle("Ex 34_5");
        primaryStage.setScene(scene);
        primaryStage.show();

        initializeDB();

        btnShowContents.setOnAction(e -> showContents());
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void initializeDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection connection = DriverManager.getConnection("jdbc:mysql://prometheus.gtc.edu/tjelinek_test?" +
                    "user=tjelinek&password=GTC$@mple22");
            System.out.println("Database Connected");
            stmt = connection.createStatement();
        }
        catch (Exception Ex) {
            System.out.println("Something is wrong with the Database. HELP!!!!!" +  Ex);
            lblStatus.setText("Database Connection Failed. Is your VPN active? Password correct?");

        }
    }

    private void showContents() {
        String tableName = tfTableName.getText();

        try {
            String queryString = "select * from " + tableName;
            ResultSet resultSet = stmt.executeQuery(queryString);
            ResultSetMetaData rsMetaData = resultSet.getMetaData();

            for (int i = 1; i <= rsMetaData.getColumnCount(); i++ ) {
                taResult.appendText(rsMetaData.getColumnName(i) + "      ");
            }
            taResult.appendText("\n");

            while (resultSet.next()) {
                for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                    taResult.appendText(resultSet.getObject(i) + "      ");
                }
                taResult.appendText("\n");
            }
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

