package com.davidgonzalez.system;

import javafx.application.Application;
import javafx.stage.Stage;
import com.davidgonzalez.system.utils.SceneManager;
import com.davidgonzalez.system.utils.ViewFactory;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stageRoot) {
        SceneManager.getInstanciaSceneManager().setStagePrincipal(stageRoot);
        ViewFactory viewFacto = new ViewFactory();
        viewFacto.viewLogin();
    }
}
