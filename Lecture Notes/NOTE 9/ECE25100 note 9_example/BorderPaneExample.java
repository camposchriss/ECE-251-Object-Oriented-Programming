import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BorderPaneExample extends Application  {
    public void start(Stage primaryStage) {
        BorderPane  aPane = new BorderPane();
        aPane.setPadding(new Insets(10));

        FlowPane buttonPane = new FlowPane();
        buttonPane.setPadding(new Insets(10, 0, 0, 0));
        buttonPane.setHgap(10);
        buttonPane.getChildren().add(new Button("Add"));
        buttonPane.getChildren().add(new Button("Remove"));
        buttonPane.getChildren().add(new Button("Insert"));
        buttonPane.getChildren().add(new Button("Edit"));
        buttonPane.getChildren().add(new Button("Details"));
        aPane.setBottom(buttonPane);

        aPane.setCenter(new TextArea());

        primaryStage.setTitle("BorderPane Example");
        primaryStage.setScene(new Scene(aPane, 500,250));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
