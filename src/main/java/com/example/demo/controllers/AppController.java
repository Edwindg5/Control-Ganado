package com.example.demo.controllers;

import com.example.demo.App;
import com.example.demo.models.Login;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AppController  {
    @FXML
    private ImageView FondoImage;
    @FXML
    private AnchorPane anchorPaneLogin;
    @FXML
    private Button buttonSalir;

    @FXML
    private Button buttonIngresar;

    @FXML
     private TextField textPaswword;

    @FXML
    private TextField textUsuario;
    Stage stage;

    @FXML
    void OnClickIngresar(MouseEvent event) {
        String user1;
        int paswword1;
        String user2;
        int paswword2;

        user1 ="l";
        paswword1 = 1;

        user2 = "diaz";
        paswword2 = 34;

        Login log = new Login(user1, paswword1, user2, paswword2);

        String user;
        int paswword;

        try {
        user = textUsuario.getText();
        paswword = Integer.parseInt(textPaswword.getText());

        if(user.equals(log.getUser()) && paswword == paswword1) {
                App.newStage("dueño-view","App Dueño-view");
            }else if (user.equals(log.getUser1()) && paswword == paswword2) {
                App.newStage("usurio-view", "App Usurio-view");
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Logeo");
                alert.setContentText("Usuario o contraseña incorrecta");
                alert.showAndWait();
            }
        }catch(Exception e) {
            Alert login = new Alert(Alert.AlertType.INFORMATION);
            login.setTitle("Login");
            login.setContentText("Error, ingrese numeros");
            login.showAndWait();
        }

    }
    @FXML
    void OnClcickSalir(MouseEvent event) {
       stage = (Stage)anchorPaneLogin.getScene().getWindow();
        Alert aler = new Alert(Alert.AlertType.INFORMATION);
        aler.setTitle("Salida");
        aler.setContentText("se salio del login");
        aler.showAndWait();
        stage.close();
    }


}
