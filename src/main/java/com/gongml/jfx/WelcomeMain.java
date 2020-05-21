package com.gongml.jfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.scene.layout.Panel;

/**
 * @program: HelloGui
 * @description:
 **/
public class WelcomeMain extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
//        Panel panel = new Panel("This is the title");
//        panel.getStyleClass().add("panel-primary");                            //(2)
//        BorderPane content = new BorderPane();
//        content.setPadding(new Insets(120));
//
//        Button button = new Button("Hello BootstrapFX");
//        button.getStyleClass().setAll("btn","btn-danger");//(2)
//
//        content.setCenter(button);
//        panel.setBody(content);
//
//        Scene scene = new Scene(panel);
//        scene.getStylesheets().add("org/kordamp/bootstrapfx/bootstrapfx.css");

        Parent root = FXMLLoader.load(getClass().getResource("../../../../resources/sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

}
