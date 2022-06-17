package com.java.main.factory;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class UIFactory {

  public static HBox buildHBox(Node... nodes) {
    HBox hBox = new HBox();
    hBox.setAlignment(Pos.CENTER_LEFT);
    hBox.setSpacing(12);
    hBox.getChildren().addAll(nodes);

    return hBox;
  }

  public static Label buildLabel(String text, String styleClass) {
    Label label = new Label(text);
    label.getStyleClass().add(styleClass);
    label.setWrapText(true);

    return label;
  }

  public static TextField buildTextField(String styleClass) {
    TextField textField = new TextField();
    textField.setPromptText("Type Something...");
    textField.getStyleClass().add(styleClass);

    return textField;
  }

  public static Button buildButton(String styleClass, EventHandler eventHandler) {
    Button button = new Button("Click me");
    button.getStyleClass().add(styleClass);
    button.setOnAction(eventHandler);

    return button;
  }
}
