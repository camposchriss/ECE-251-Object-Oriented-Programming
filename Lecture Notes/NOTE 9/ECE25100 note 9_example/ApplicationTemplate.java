import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
public class ApplicationTemplate extends Application {
     public void start(Stage primaryStage) {
 	Scene scene = new Scene(new Pane(), 300, 100); // Set window size
	primaryStage.setTitle("My Window"); // Set window title
 	primaryStage.setScene(scene);
	primaryStage.show(); // Show window
    }
    public static void main(String[] args) {
    	launch(args); // Initialize/start
 } }
