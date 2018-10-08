package mich282q.Thread;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;
import java.lang.management.PlatformLoggingMXBean;

public class FlashText extends Application {
    private String text = "";

    @Override //override the start method in the aplication class
    public void start(Stage primaryStage) throws InterruptedException {
        StackPane pane = new StackPane();
        Label lblText = new Label("Programming is fun");
        pane.getChildren().add(lblText);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while(true) {
                if (lblText.getText().trim().length() == 0)
                    text = "welcome";
                else
                    text = "";

                Platform.runLater(new Runnable() { //run from JavaFx GUI
                    @Override
                    public void run() {
                        lblText.setText(text);
                    }
                });
                Thread.sleep(200);

            }
        }
        catch (InterruptedException ex){

        }}
}).start();

            //Create a scene and place it in the stage
            Scene scene = new Scene(pane,200,50);
            primaryStage.setTitle("FlashText"); //set the stage title
            primaryStage.setScene(scene); //place the scene in the stage
            primaryStage.show(); //Display the stage
        }

}
