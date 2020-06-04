package com.gongml.jfx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @program: HelloGui
 * @description:
 **/
public class WelcomeMain {

    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../../../../resources/sample.fxml"));
        primaryStage.setTitle("点餐系统");
        primaryStage.setScene(new Scene(root, 900, 600));
        primaryStage.show();
    }

}
