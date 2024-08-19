package com.example.chapter33;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Ch33_1Client extends Application {
    private TextArea ta = new TextArea();
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private Button btSubmit = new Button("Submit");

    DataOutputStream osToServer;
    DataInputStream isFromServer;


    @Override
    public void start(Stage stage) throws IOException {
        GridPane gp = new GridPane();
        gp.add(new Label("Annual Interest Rate: "), 0, 0);
        gp.add(new Label("Number of Years: "), 0, 1);
        gp.add(new Label("Loan Amount: "), 0, 2);
        gp.add(tfAnnualInterestRate, 1, 0);
        gp.add(tfNumOfYears, 1, 1);
        gp.add(tfLoanAmount, 1, 2);
        gp.add(btSubmit, 2, 1);


        BorderPane pane = new BorderPane();
        pane.setTop(gp);
        pane.setCenter(new ScrollPane(ta));


        Scene scene = new Scene(pane, 450, 290);
        stage.setTitle("Exercise 33.1");
        stage.setScene(scene);
        stage.show();

        btSubmit.setOnAction(e -> calculateOnServer());

        try {
            Socket connectToServer = new Socket("localhost", 8000);
            isFromServer = new DataInputStream(connectToServer.getInputStream());
            osToServer = new DataOutputStream(connectToServer.getOutputStream());
        }
        catch(IOException ex){
            ta.appendText("There is a problem..... " + ex.toString() + '\n');
        }


    }

    private void calculateOnServer() {
        try {
            // Get the annual interest rate from the text field
            double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText().trim());
            // Get the number of years from the text field
            int numOfYears = Integer.parseInt(tfNumOfYears.getText());
            // Get the loan amount from the text field
            double loanAmount = Double.parseDouble(tfLoanAmount.getText().trim());
            // Send the annual interest rate to the server
            osToServer.writeDouble(annualInterestRate);
            // Send the number of years to the server
            osToServer.writeInt(numOfYears);
            // Send the loan amount to the server
            osToServer.writeDouble(loanAmount);
            osToServer.flush();
            // Get monthly payment from the server
            double monthlyPayment = isFromServer.readDouble();
            // Get total payment from the server
            double totalPayment = isFromServer.readDouble();

            ta.appendText("Annual Interest Rate: " + annualInterestRate +
                    "\nNumber of Years: " + numOfYears + "\nLoan Amount: " +
                    loanAmount + "\n");
            ta.appendText("Monthly Payment: " + monthlyPayment +
                    "\nTotal Payment: " + totalPayment +"\n\n");
        }
        catch(IOException ex) {
            ta.appendText("Captain, there is a problem . . . " + ex);
        }

    }


            public static void main(String[] args) {
        launch();
    }

}



