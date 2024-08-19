package com.example.chapter33;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class Ex33_1Server extends Application {
    private TextArea ta = new TextArea();

    @Override
    public void start(Stage stage) throws IOException {

        Scene scene = new Scene(new ScrollPane(ta), 450, 290);
        stage.setTitle("Exercise 33.1 Server");
        stage.setScene(scene);
        stage.show();

        new Thread(() -> connectToClient()).start();
    }

    private void connectToClient() {
        try{
            ServerSocket serverSocket = new ServerSocket(8000);
            Platform.runLater(() -> {ta.appendText("Server process started at " +
                    new Date() +"\n" );});
            Socket connectToClient = serverSocket.accept();
            Platform.runLater(() -> {ta.appendText("Connected to Client at " +
                    new Date() +"\n\n" );});

            DataInputStream isFromClient = new DataInputStream(connectToClient.getInputStream());
            DataOutputStream osToClient = new DataOutputStream(connectToClient.getOutputStream());

            while(true){
                // get info from client
                double annualInterestRate = isFromClient.readDouble();
                int numOfYears = isFromClient.readInt();
                double loanAmount = isFromClient.readDouble();
                // calculate using an external class  *********8 LOAN>JAVA
                Loan mortgage = new Loan(annualInterestRate, numOfYears, loanAmount);
                double monthlyPayment = mortgage.getMonthlyPayment();
                double totalPayment = mortgage.getTotalPayment();
                //Send the info back to client
                osToClient.writeDouble(monthlyPayment);
                osToClient.writeDouble(totalPayment);

                Platform.runLater( () -> {
                    ta.appendText("Annual Interest Rate: " + annualInterestRate +
                            "\nNumber of Years: " + numOfYears + "\nLoan Amount: " +
                            loanAmount + "\n");
                    ta.appendText("Monthly Payment: " + monthlyPayment + " " +
                            "\nTotal Payment: " + totalPayment + "\n\n");
                });
            }
        }
        catch(IOException ex){
            System.err.println(ex);
            ta.appendText("There is a problem.... " + ex);
        }
    }



    public static void main(String[] args) {
        launch();
    }

}

