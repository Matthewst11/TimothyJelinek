package com.example.chapter32;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class Exercise32_1 extends Application {
    private TextArea ta = new TextArea();

    @Override
    public void start(Stage stage) throws IOException {
        ta.setWrapText(true);

        // Runnable printA = new PrintChar('a', 22);
        // Runnable printB = new PrintChar('b', 22);
        // Runnable print100 = new PrintNum(22);

        // Thread thread1 = new Thread(printA);
        // Thread thread2 = new Thread(printB);
        // Thread thread3 = new Thread(print100);

        // thread1.start();
        // thread2.start();
        // thread3.start();

        Thread printA = new Thread(new PrintChar('a', 100));
        Thread printB = new Thread(new PrintChar('b', 100));
        Thread print100 = new Thread(new PrintNum(100));

        print100.start();
        printA.start();
        printB.start();

        Scene scene = new Scene(ta, 250, 150);
        stage.setTitle("Concurrent Output!");
        stage.setScene(scene);
        stage.show();

    }
    public static void main(String[] args) {
        launch();
    }

    class PrintChar implements Runnable {
        private char charToPrint;
        private int times;

        public PrintChar(char c, int t) {
            charToPrint = c;
            times = t;
        }

        public void run() {
            for (int i = 0; i < times; i++) {
                ta.appendText(charToPrint + "");
            }
        }
    }

    class PrintNum implements Runnable {
        private int lastNum;

        public PrintNum(int n) {
            lastNum = n;
        }

        public void run() {
            for (int i = 1; i <= lastNum; i++) {
                ta.appendText("" + i);
            }
        }
    }
}