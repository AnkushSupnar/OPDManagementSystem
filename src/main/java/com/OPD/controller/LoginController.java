package com.OPD.controller;

import com.OPD.view.FxmlView;
import com.OPD.view.StageManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class LoginController implements FxmlController {
    @FXML private Button btnGo;
    private static final Logger LOG = LoggerFactory.getLogger(LoginController.class);
    private final StageManager stageManager;

    @Autowired @Lazy
    public LoginController(StageManager stageManager)
    {
        this.stageManager = stageManager;
        System.out.println("Login Constructor Called");

    }
    @Override
    public void initialize() {
        System.out.println("Login Initialize Called");
        btnGo.setOnAction(e->{
            stageManager.switchScene(FxmlView.MAIN);
        });
    }
}
