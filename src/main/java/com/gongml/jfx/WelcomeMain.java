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
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        Scene scene = new Scene(root, 900, 600);
        scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");
        primaryStage.setTitle("点餐系统");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
