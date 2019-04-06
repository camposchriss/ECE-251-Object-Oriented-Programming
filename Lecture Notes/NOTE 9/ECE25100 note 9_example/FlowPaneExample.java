import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.scene.image.*;

public class FlowPaneExample extends Application  {
    public void start(Stage primaryStage) {
        FlowPane  aPane = new FlowPane();
        aPane.getChildren().add(new Button("one"));
        aPane.getChildren().add(new Button("two"));
        aPane.getChildren().add(new Button("three"));
        aPane.getChildren().add(new Button("Play", new ImageView(new Image(getClass().getResourceAsStream("GreenButton.jpg")))));
        aPane.getChildren().add(new Button("Stop", new ImageView(new Image(getClass().getResourceAsStream("RedButton.jpg")))));
        Button b = new Button();
        b.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("Progress.gif"))));
        aPane.getChildren().add(b);
        primaryStage.setTitle("Flow Pane Example");
        primaryStage.setScene(new Scene(aPane, 500,100));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
