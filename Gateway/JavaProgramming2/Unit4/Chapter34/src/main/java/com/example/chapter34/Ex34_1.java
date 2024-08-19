package com.example.chapter34;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.sql.*;

public class Ex34_1 extends Application {
    private Label lblStatus = new Label();
    private Button btnView = new Button("View");
    private Button btnInsert = new Button("Insert");
    private Button btnUpdate = new Button("Update");
    private Button btnClear = new Button("Clear");
    private Label lblID = new Label("ID");
    private TextField txtID = new TextField();
    private Label lblLastName = new Label("Last Name");
    private TextField txtLastName = new TextField();
    private Label lblFirstName = new Label("First Name");
    private TextField txtFirstName = new TextField();
    private Label lblMiddle = new Label("MI");
    private TextField txtMiddle = new TextField();
    private Label lblAddress = new Label("Address");
    private TextField txtAddress = new TextField();
    private Label lblCity = new Label("City");
    private TextField txtCity = new TextField();
    private Label lblState = new Label("State");
    private TextField txtState = new TextField();
    private Label lblPhone = new Label("Telephone");
    private TextField txtPhone = new TextField();
    private Label lblEmail = new Label("Email");
    private TextField txtEmail = new TextField();
    private Statement stmt;


    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox hbox1 = new HBox(5);
        hbox1.getChildren().addAll(lblID, txtID);
        HBox hbox2 = new HBox(5);
        hbox2.getChildren().addAll(lblLastName, txtLastName, lblFirstName, txtFirstName,
                lblMiddle, txtMiddle);
        HBox hbox3 = new HBox(5);
        hbox3.getChildren().addAll(lblAddress, txtAddress);
        HBox hbox4 = new HBox(5);
        hbox4.getChildren().addAll(lblCity, txtCity, lblState, txtState);
        HBox hbox5 = new HBox(5);
        hbox5.getChildren().addAll(lblPhone, txtPhone, lblEmail, txtEmail);

        VBox vbox = new VBox(10);
        vbox.getChildren().addAll(hbox1, hbox2, hbox3, hbox4, hbox5);

        HBox btnBox = new HBox(10);
        btnBox.getChildren().addAll(btnView, btnInsert, btnUpdate, btnClear);
        btnBox.setAlignment(Pos.CENTER);

        BorderPane pane = new BorderPane();
        pane.setTop(lblStatus);
        pane.setCenter(vbox);
        pane.setBottom(btnBox);

        Scene scene = new Scene(pane, 600, 200);
        primaryStage.setTitle("Staff Database");
        primaryStage.setScene(scene);
        primaryStage.show();

        initializeDB();

        btnView.setOnAction(e -> view());
        btnInsert.setOnAction(e -> insert());
        btnClear.setOnAction(e -> clear());
        btnUpdate.setOnAction(e -> update());

    }

    private void update() {
        String updateQuery =
                "UPDATE Staff SET " +
                        " lastName = '" + txtLastName.getText().trim() +
                        "' , firstName = '" + txtFirstName.getText().trim() +
                        "' , mi = '" + txtMiddle.getText().trim() +
                        "' , address = '" + txtAddress.getText().trim() +
                        "' , city = '" + txtCity.getText().trim() +
                        "' , state = '" + txtState.getText().trim() +
                        "' , telephone = '" + txtPhone.getText().trim() +
                        "' , email = '" + txtEmail.getText().trim() +
                        "' WHERE id = '" + txtID.getText().trim() +	"';";
        try{
            stmt.executeUpdate(updateQuery);
            lblStatus.setText("Record Updated");
        }
        catch(SQLException ex) {
            lblStatus.setText("Update Failed: " + ex);
            System.out.println("Update Failed: " + ex);
        }

    }


    private void insert() {
        // create a query to allow the insert of a new record
        String insertQuery =
                "INSERT INTO Staff (id, lastName, firstName, mi, address," +
                        "city, state, telephone, email) VALUES ('" + txtID.getText().trim() +
                        "' , '" + txtLastName.getText().trim() +
                        "' , '" + txtFirstName.getText().trim() +
                        "' , '" + txtMiddle.getText().trim() +
                        "' , '" + txtAddress.getText().trim() +
                        "' , '" + txtCity.getText().trim() +
                        "' , '" + txtState.getText().trim() +
                        "' , '" + txtPhone.getText().trim() +
                        "' , '" + txtEmail.getText().trim() + "');";
        try {
            stmt.executeUpdate(insertQuery);
            lblStatus.setText("Inserted Record Successfully.");
            System.out.println("Insert succeeded");
        }
        catch(SQLException ex){
            lblStatus.setText("Insert Failed: " + ex);
            System.out.println("Insert Failed: " + ex);
        }
    }

    private void clear() {
        txtID.setText("");
        txtLastName.setText("");
        txtFirstName.setText("");
        txtMiddle.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        lblStatus.setText("Form Cleared");
    }

    private void view() {
        String query = "SELECT * FROM Staff WHERE id = '" + txtID.getText().trim() +"'";
        try{
            ResultSet rs = stmt.executeQuery(query);
            loadFields(rs);
        }
        catch (SQLException Ex){
            lblStatus.setText("Query Failed - please try again");
            System.out.println("Captain, there is a problem with the query" + Ex);
        }
    }

    private void loadFields(ResultSet rs) throws SQLException {
        if(rs.next()){
            txtLastName.setText(rs.getString(2));
            txtFirstName.setText(rs.getString(3));
            txtMiddle.setText(rs.getString(4));
            txtAddress.setText(rs.getString(5));
            txtCity.setText(rs.getString(6));
            txtState.setText(rs.getString(7));
            txtPhone.setText(rs.getString(8));
            txtEmail.setText(rs.getString(9));
            lblStatus.setText("Record Found");
        }
        else {
            txtLastName.setText("");
            txtFirstName.setText("");
            txtMiddle.setText("");
            txtAddress.setText("");
            txtCity.setText("");
            txtState.setText("");
            txtPhone.setText("");
            txtEmail.setText("");
            lblStatus.setText("Record NOT Found");
        }

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

    public static void main(String[] args) {
       launch(args);
    }


}
