package com.OPD.controller;

import com.OPD.view.FxmlView;
import com.OPD.view.StageManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class DashboardController implements FxmlController{
    @FXML
    private Button btnGo;

    private final StageManager stagemanager;
    @Autowired @Lazy
    public DashboardController(StageManager stageManager)
    {
        this.stagemanager = stageManager;
    }
    @Override
    public void initialize() {
    btnGo.setOnAction(e->{
        stagemanager.switchScene(FxmlView.LOGIN);
    });
    }
}
