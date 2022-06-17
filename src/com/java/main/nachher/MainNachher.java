package com.java.main.nachher;

import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import com.java.main.factory.UIFactory;

public class MainNachher {
  private static final int SPACING = 12;

  //  Methode zur Erstellung einer UI nach Refactoring Teil 1
  public static Node buildUiExampleAfterRefactoring1() {
    HBox topContainer = buildHBox(
        buildLabel("Label Top", "test-label-top"),
        buildTextField("test-textfield-top"),
        buildButton("test-button-top", event -> System.out.println("Top Button was clicked!"))
    );

    HBox midContainer = buildHBox(
        buildLabel("Label Mid", "test-label-mid"),
        buildTextField("test-textfield-mid"),
        buildButton("test-button-mid", event -> System.out.println("Mid Button was clicked!"))
    );

    HBox botContainer = buildHBox(
        buildLabel("Label Bot", "test-label-bot"),
        buildTextField("test-textfield-bot"),
        buildButton("test-button-bot", event -> System.out.println("Bot Button was clicked!"))
    );

    VBox root = new VBox();
    root.setSpacing(SPACING);
    root.getChildren().addAll(topContainer, midContainer, botContainer);
    return root;
  }

  //  Methode zur Erstellung einer UI nach Refactoring Teil 2
  public static Node buildUiExampleAfterRefactoring2() {
    HBox topContainer = UIFactory.buildHBox(
        UIFactory.buildLabel("Label Top", "test-label-top"),
        UIFactory.buildTextField("test-textfield-top"),
        UIFactory.buildButton("test-button-top", event -> System.out.println("Top Button was clicked!"))
    );

    HBox midContainer = UIFactory.buildHBox(
        UIFactory.buildLabel("Label Mid", "test-label-mid"),
        UIFactory.buildTextField("test-textfield-mid"),
        UIFactory.buildButton("test-button-mid", event -> System.out.println("Mid Button was clicked!"))
    );

    HBox botContainer = UIFactory.buildHBox(
        UIFactory.buildLabel("Label Bot", "test-label-bot"),
        UIFactory.buildTextField("test-textfield-bot"),
        UIFactory.buildButton("test-button-bot", event -> System.out.println("Bot Button was clicked!"))
    );

    VBox root = new VBox();
    root.setSpacing(SPACING);
    root.getChildren().addAll(topContainer, midContainer, botContainer);
    return root;
  }

  private static HBox buildHBox(Node... nodes) {
    HBox hBox = new HBox();
    hBox.setAlignment(Pos.CENTER_LEFT);
    hBox.setSpacing(SPACING);
    hBox.getChildren().addAll(nodes);

    return hBox;
  }

  private static Label buildLabel(String text, String styleClass) {
    Label label = new Label(text);
    label.getStyleClass().add(styleClass);
    label.setWrapText(true);

    return label;
  }

  private static TextField buildTextField(String styleClass) {
    TextField textField = new TextField();
    textField.setPromptText("Type Something...");
    textField.getStyleClass().add(styleClass);

    return textField;
  }

  private static Button buildButton(String styleClass, EventHandler eventHandler) {
    Button button = new Button("Click me");
    button.getStyleClass().add(styleClass);
    button.setOnAction(eventHandler);

    return button;
  }
}
