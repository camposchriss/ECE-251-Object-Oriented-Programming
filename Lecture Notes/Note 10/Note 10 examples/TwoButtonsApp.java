import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TwoButtonsApp extends Application  {
    public void start(Stage primaryStage) {
        Pane  aPane = new Pane();

        Button button1 = new Button("Press Me");
        button1.relocate(10, 10);
        button1.setPrefSize(100, 30);
        aPane.getChildren().add(button1);

        Button button2 = new Button("Don't Press Me");
        button2.relocate(120, 10);
        button2.setPrefSize(190, 30);
        aPane.getChildren().add(button2);

        // Connect the event handlers to the buttons
        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                System.out.println("You pressed the button!");
            }
        });
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) {
                System.out.println("Ouch! Stop that!");
            }
        });

        primaryStage.setTitle("Making 2 Handlers");       // Set title of window
        primaryStage.setScene(new Scene(aPane, 320,50));  // Set size of window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

