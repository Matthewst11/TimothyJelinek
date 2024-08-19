package com.example.chapter33;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ch33_9Server extends Application {
    private DataOutputStream toServer = null;
    private DataInputStream fromServer = null;
    private TextArea textarServer = new TextArea();
    private TextArea textarClient = new TextArea();

    @Override
    public void start(Stage stage) throws IOException {
        GridPane grid = new GridPane();
        textarServer.setEditable(false);

        grid.add(new Label("Server"), 0, 0);
        grid.add(new ScrollPane(textarServer), 0, 1);

        grid.add(new Label("Client"), 0, 2);
        grid.add(new ScrollPane(textarClient), 0, 3);

        Scene scene = new Scene(grid, 300, 400);
        stage.setTitle("Exercise33_9Server");
        stage.setScene(scene);
        stage.show();

        /*--------------------------------------Server Starts-----------------------------------*/
        new Thread(() -> {
            try{
                //Create a Server Socket
                ServerSocket serverSocket = new ServerSocket(8082);
                //Append connection status if successful
                Platform.runLater(() -> {
                    textarServer.appendText("Server Started At: " + new Date() + "\n");
                });
                //Opens connection for a request
                Socket socket = serverSocket.accept();

                //Creates data I/O streams
                DataInputStream inputFromServer = new DataInputStream(socket.getInputStream());
                DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());

                while (true){
                    //Receives Text from Server User
                    String Text = inputFromServer.readUTF();
                    outputToClient.writeUTF(Text);
                    Platform.runLater(() -> {
                        textarServer.appendText(Text + "\n");
                    });
                }
            }
            catch (Exception err){
                err.printStackTrace();
                System.out.println("ooops something bad happened");
            }
        }).start();
        /*--------------------------------------Client Sends-----------------------------------*/
        textarClient.setOnKeyPressed( e-> {
            if (e.getCode() == KeyCode.ENTER) {
                String Text = null;
                Text = textarClient.getText().trim();
                if (toServer == null) {
                    try {
                        //Create socket to connect to server on port 8001
                        Socket socket = new Socket("localhost", 8081);
                        fromServer = new DataInputStream(socket.getInputStream());
                        toServer = new DataOutputStream(socket.getOutputStream());
                        InetAddress inetAddress = socket.getInetAddress();
                    }
                    catch (Exception err){
                        err.printStackTrace();
                        System.out.println("ooops something bad happened");
                    }
                }
                try {
                    //Get radius from text field
                    toServer.writeUTF(Text);
                    toServer.flush();
                    //Get info from Server
                }
                catch (Exception err){
                    err.printStackTrace();
                }
                textarClient.clear();
            }
        });


    }
    public static void main(String[] args) {
        launch();
    }
}
