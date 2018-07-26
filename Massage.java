package Homework;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;

public class Massage {
    public static void massage(boolean a){
        Stage windo=new Stage();
        windo.initModality(Modality.APPLICATION_MODAL);
        VBox layout=new VBox();
        Label l1=new Label("Log in Successfull");

        Label l2=new Label("Loig in failed");

        if(a==true){
            layout.getChildren().addAll(l1);
        }
        else {
            layout.getChildren().addAll(l2);
        }
        Scene sc=new Scene(layout,100,100);
        windo.setScene(sc);
        windo.show();


    }
}
