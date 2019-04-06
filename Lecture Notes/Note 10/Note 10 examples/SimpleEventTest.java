import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SimpleEventTest extends Application {
    public void start(Stage primaryStage) {
        Pane  aPane = new Pane();

        Button aButton = new Button("Press Me");
        aButton.relocate(100, 10);
        aButton.setPrefSize(100, 30);
        aPane.getChildren().add(aButton);

        // Connect the event handler to the button
        aButton.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                System.out.println("You pressed the button");
            }
        });

        primaryStage.setTitle("Making a Handler");       // Set title of window
        primaryStage.setScene(new Scene(aPane, 300,50));  // Set size of window
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}

