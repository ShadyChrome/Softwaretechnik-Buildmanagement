package com.java.main.vorher;

import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainVorher {

  //Methode zur Erstellung einer UI mit Bad Practices
  public static Node buildUiExample() {
    Label label1 = new Label("Test 1");
    label1.getStyleClass().add("test-label1");
    label1.setWrapText(true);

    TextField textField1 = new TextField();
    textField1.setPromptText("Type Something...");
    textField1.getStyleClass().add("test-textfield1");

    Button button1 = new Button("Click me!");
    button1.getStyleClass().add("test-button1");
    button1.setOnAction(event -> {
      System.out.println("Button 1 was clicked.");
    });

    HBox hBox1 = new HBox();
    hBox1.setAlignment(Pos.CENTER_LEFT);
    hBox1.setSpacing(12);
    hBox1.getChildren().addAll(label1, textField1, button1);

    Label label2 = new Label("Test 2");
    label2.getStyleClass().add("test-label2");
    label2.setWrapText(true);

    TextField textField2 = new TextField();
    textField2.setPromptText("Type Something...");
    textField2.getStyleClass().add("test-textfield2");

    Button button2 = new Button("Click me!");
    button2.getStyleClass().add("test-button2");
    button2.setOnAction(event -> {
      System.out.println("Button 2 was clicked.");
    });

    HBox hBox2 = new HBox();
    hBox2.setAlignment(Pos.CENTER_LEFT);
    hBox2.setSpacing(12);
    hBox2.getChildren().addAll(label2, textField2, button2);

    Label label3 = new Label("Test 3");
    label3.getStyleClass().add("test-label3");
    label3.setWrapText(true);

    TextField textField3 = new TextField();
    textField3.setPromptText("Type Something...");
    textField3.getStyleClass().add("test-textfield3");

    Button button3 = new Button("Click me!");
    button3.getStyleClass().add("test-button3");
    button3.setOnAction(event -> {
      System.out.println("Button 3 was clicked.");
    });

    HBox hBox3 = new HBox();
    hBox3.setAlignment(Pos.CENTER_LEFT);
    hBox3.setSpacing(12);
    hBox3.getChildren().addAll(label3, textField3, button3);

    VBox root = new VBox();
    root.setSpacing(12);
    root.getChildren().addAll(hBox1, hBox2, hBox3);
    return root;
  }
}
