import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MultipleButtonsApp extends Application {
    Button[][]  buttons;    // This will store all the Buttons

    public void start(Stage primaryStage) {
        Pane  aPane = new Pane();

        buttons = new Button[4][3];
        String[] buttonLabels = {"1","2","3","4","5","6","7","8","9","*","0","#"};
        for(int row=0; row<4; row++) {
            for (int col=0; col<3; col++) {
                buttons[row][col] = new Button(buttonLabels[row*3+col]);
                buttons[row][col].relocate(10+col*70, 10+row*70);
                buttons[row][col].setPrefSize(65,65);
                buttons[row][col].setOnAction(new EventHandler<ActionEvent>() {
                    // This is the single event handler for all of the buttons
                    public void handle(ActionEvent actionEvent) {
                        System.out.println("Button " + ((Button)actionEvent.getSource()).getText() + " was pressed." );
                    }
                });

                aPane.getChildren().add(buttons[row][col]);
            }
        }

        primaryStage.setTitle("Keypad");       // Set title of window
        primaryStage.setScene(new Scene(aPane, 225, 295));  // Set size of window
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

