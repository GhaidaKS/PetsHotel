/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshotel.RegistrationPages;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author huawei
 */
public class RegistrationJavaFX extends Application {
    
    
    final static javafx.scene.image.Image h1 = new javafx.scene.image.Image(RegistrationJavaFX.class.getResource("/img/bird1.jpg").toString());
    final static javafx.scene.image.Image h2 = new javafx.scene.image.Image(RegistrationJavaFX.class.getResource("/img/bird2.jpg").toString());
    
    
     private Group Bird;
     
    @Override
    public void start(Stage primaryStage) {
        final ImageView Bird1=new ImageView(h1);
        final ImageView Bird2=new ImageView(h2);
        
        
        Button b = new Button();
        b.setText("SIGN IN");
        b.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
        b.setStyle("-fx-background-color: #0000CD; -fx-text-fill: #FFFFFF; -fx-pref-height: 28px; -fx-pref-width: 200px;");
        b.setTranslateX(100);
        b.setTranslateY(530);
        Button b2 = new Button();
        b2.setText("SIGN UP");
        b2.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
        b2.setStyle("-fx-background-color: #0000CD; -fx-text-fill: #FFFFFF; -fx-pref-height: 28px; -fx-pref-width: 200px;");
        b2.setTranslateX(100);
        b2.setTranslateY(480);
        Label l = new Label("Welcome to the Pets Hotel!");
        l.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.REGULAR, 20));
        l.setStyle("-fx-text-fill: #0000CD;");
        l.setTranslateX(70);
        l.setTranslateY(330);
        
        
        StackPane r = new StackPane();  // create a stack pane
        r.getChildren().add(b);        // add button
        r.getChildren().add(b2);
        r.getChildren().add(l);
        
           b2.setOnAction(actionEvent ->  {
         
           new petshotel.Sign_up().setVisible(true);
             
      });
        
        Bird=new Group(Bird1);
        Bird.setTranslateX(80);
        Bird.setTranslateY(90);
        Timeline t=new Timeline();
        t.setCycleCount(Timeline.INDEFINITE);
                t.getKeyFrames().add(new KeyFrame(
                Duration.millis(100),
                (ActionEvent event) -> {
                 Bird.getChildren().setAll(Bird1);
                }
        ));
        t.getKeyFrames().add(new KeyFrame(
                Duration.millis(200),
                (ActionEvent event) -> {
                 Bird.getChildren().setAll(Bird2);
                }
        ));
        t.play();
        
        
        
        Group root= new Group(Bird,b,b2,l); 
        
        Scene scene=new Scene(root,375,780);
        primaryStage.setScene(scene);
        scene.setFill(Color.WHITE);
        primaryStage.setResizable(false);
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
