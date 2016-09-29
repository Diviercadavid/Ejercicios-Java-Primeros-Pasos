/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxprueba;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Dcadavid
 */
public class JavaFXPrueba extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        primaryStage.setTitle("JAVA FX Prueba 1");
        
        StackPane root = new StackPane();
        Scene scene = new Scene(root,300, 250);
        Button btnTest = new Button();
        btnTest.setText("Hola Mundo");
        
        
        btnTest.setOnAction(new EventHandler<ActionEvent>() {
            

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hola Mundo");
            }
                        
        });
        root.getChildren().add(btnTest);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
