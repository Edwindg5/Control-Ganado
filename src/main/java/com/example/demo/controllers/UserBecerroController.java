package com.example.demo.controllers;

import com.example.demo.App;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class UserBecerroController {
    public AnchorPane anchorPaneUserBecerros;


    public void onClickedBra(MouseEvent event) {
        App.newStage("infoBra-view","App InfoBra-view");
    }

    public void OnClickSalir(MouseEvent event) {
    }

    public void onClickedAngus(MouseEvent event) {App.newStage("infoAngus","App InfoAngus");
    }

    public void onClickedLim(MouseEvent event) {App.newStage("infoLim-view","App InfoLim-view");
    }

    public void onClickedHere(MouseEvent event) {App.newStage("infoHere-view","App InfoHere-view");
    }
}
