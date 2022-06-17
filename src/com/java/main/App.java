package com.java.main;

import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

import com.java.main.nachher.MainNachher;
import com.java.main.vorher.MainVorher;

public class App extends javafx.application.Application {

  //Main Class zum Starten des Programms
  @Override
  public void start(Stage primaryStage) throws Exception {
    //Jedes UI Example wird in einem Tab dargestellt
    TabPane tabPane = new TabPane();
    tabPane.getTabs().setAll(
        new Tab("Vorher", MainVorher.buildUiExample()),
        new Tab("Nachher 1", MainNachher.buildUiExampleAfterRefactoring1()),
        new Tab("Nachher 2", MainNachher.buildUiExampleAfterRefactoring2()));
    primaryStage.setScene(new Scene(tabPane));
    primaryStage.setTitle("Buildmanagement with ANT");
    primaryStage.setWidth(500);
    primaryStage.setHeight(400);
    primaryStage.show();
  }


}
