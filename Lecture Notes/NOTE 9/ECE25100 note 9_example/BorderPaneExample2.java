import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BorderPaneExample2 extends Application  {
    public void start(Stage primaryStage) {
        Button[]      buttons;
        String[]      names = {"New", "Open", "Save", "Compile", "Run", "Quit"};

        BorderPane  aPane = new BorderPane();
        aPane.setPadding(new Insets(10));

        VBox buttonPane = new VBox();
        buttonPane.setPadding(new Insets(0, 0, 0, 10));
        buttonPane.setSpacing(10);
        buttons = new Button[names.length];
        for (int i=0; i<names.length; i++) {
            buttons[i] = new Button(names[i]);
            buttons[i].setPrefWidth(100);
            buttons[i].setPrefHeight(30);
            buttonPane.getChildren().add(buttons[i]);
        }
        aPane.setRight(buttonPane);

        aPane.setCenter(new TextArea());

        TextField statusField = new TextField("This is like a status pane");
        statusField.setStyle("-fx-background-color: GRAY; -fx-text-fill: WHITE;");
        aPane.setBottom(statusField);
        aPane.setMargin(statusField, new Insets(10,0,0,0)); // allows spacing at top

        primaryStage.setTitle("BorderPane Example 2");
        primaryStage.setScene(new Scene(aPane, 500,500));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
