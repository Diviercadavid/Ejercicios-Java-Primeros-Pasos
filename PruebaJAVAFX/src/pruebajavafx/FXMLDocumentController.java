/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebajavafx;

import java.net.URL;
import java.sql.*;



import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author Dcadavid
 */
public class FXMLDocumentController implements Initializable {

    Connection conectar = null;
    
    
    @FXML
    private TextField txb_nombre;
    @FXML
    private TextField txb_apellido;
    @FXML
    private TextField txb_datos;

    @FXML // fx:id="btn_generar"
    private Button btn_generar; // Value injected by FXMLLoader

//    @FXML
//    private void accionMostrar(ActionEvent evento) {
//
//        txb_datos.setText("Holaa!!");
//        System.out.println("No sirve");
//    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        accionesBotones();
    }

    
    private void accionesBotones() {
        btn_generar.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent arg0) {
                txb_datos.setText("Holaa!!");
                System.out.println("No sirve");
            }
        });
    }

   

}
