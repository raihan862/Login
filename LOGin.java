package Homework;

import com.company.Alter;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class LOGin extends Application {
    Stage windo;
    TextField t1, t2;
    PasswordField p;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        String user_name="raihan";
        String Pass="1233";
        windo = primaryStage;
        windo.setTitle("Login");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 10, 20, 10));
        grid.setVgap(8);
        grid.setHgap(10);
        Scene sc = new Scene(grid,300,400);
        Label l = new Label("User name");
        GridPane.setConstraints(l, 0, 0);

        t1 = new TextField( );
        t1.setPromptText("name");
        GridPane.setConstraints(t1, 1, 0);

        Label l2 = new Label("Password");
        GridPane.setConstraints(l2, 0, 1);
        p = new PasswordField();
        p.setPromptText("password");
        GridPane.setConstraints(p, 1, 1);

        Button b1=new Button("Log in");
        GridPane.setConstraints(b1,0,2);
        b1.setOnAction(e->{
            if(t1.getText()!=null &&p.getText()!=null){

            if(t1.getText().equals(user_name) && p.getText().equals(Pass)){
                Massage.massage(true);
               // windo.close();

            }
            else{
                Massage.massage(false);
                //windo.close();
            }}


        });
        Button b2=new Button("Clear");
        GridPane.setConstraints(b2,1,2);
        b2.setOnAction(e->{
            t1.setText(null);
            p.setText(null);
        });
        grid.getChildren().addAll(l, l2,t1, p,b1,b2);
        windo.setScene(sc);
        windo.show();
    }
}
