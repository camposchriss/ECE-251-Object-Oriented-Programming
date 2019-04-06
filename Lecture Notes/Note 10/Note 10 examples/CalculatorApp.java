import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class CalculatorApp extends Application  {
    // Text fields to hold the user data and the computed data
    TextField valueField, squareField, rootField;

    public void start(Stage primaryStage) {
        Pane  aPane = new Pane();

        // Add the value label and text field
        Label label = new Label("Value:");
        label.relocate(10,10);
        label.setPrefSize(100, 30);
        aPane.getChildren().add(label);

        valueField = new TextField();
        valueField.relocate(100,10);
        valueField.setPrefSize(150, 30);
        aPane.getChildren().add(valueField);

        // Add the compute button
        Button computeButton = new Button("Compute");
        computeButton.relocate(10,50);
        computeButton.setPrefSize(240, 30);
        aPane.getChildren().add(computeButton);

        // Add the square label and text field
        label = new Label("Square:");
        label.relocate(10,100);
        label.setPrefSize(100, 30);
        aPane.getChildren().add(label);

        squareField = new TextField();
        squareField.relocate(100,100);
        squareField.setPrefSize(150, 30);
        squareField.setEditable(false);
        aPane.getChildren().add(squareField);

        // Add the square root label and text field
        label = new Label("Square Root:");
        label.relocate(10,150);
        label.setPrefSize(100, 30);
        aPane.getChildren().add(label);

        rootField = new TextField();
        rootField.relocate(100,150);
        rootField.setPrefSize(150, 30);
        rootField.setEditable(false);
        aPane.getChildren().add(rootField);

        // Connect the event handlers to the buttons
        computeButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                if (valueField.getText().length() > 0) {
                    float value = Float.parseFloat(valueField.getText());
                    squareField.setText("" + value * value);
                    rootField.setText("" + Math.sqrt(value));
                }
            }
        });

        primaryStage.setTitle("Calculator");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(aPane, 248,178));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

