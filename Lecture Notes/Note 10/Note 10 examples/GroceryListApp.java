import javafx.application.Application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.input.*;
import javafx.stage.Stage;

public class GroceryListApp extends Application {
    private ItemList		model;  // model to which this view is attached
    private GroceryListView	view;   // view that shows the state of the model

    public void start(Stage primaryStage) {
        // Create the model and view
        model = new ItemList();   // Start with an empty list
        model.add("Apples");
        model.add("Toilet Paper");
        model.add("Ketchup");
        view = new GroceryListView(model);

        // Plug in the event handlers
        view.getAddButton().setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) { handleAddButtonPress(); }
        });
        view.getRemoveButton().setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent actionEvent) { handleRemoveButtonPress(); }
        });
        view.getList().setOnMousePressed(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent mouseEvent) { handleListSelection(); }
        });
        view.getNewItemField().setOnKeyReleased(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent keyEvent) { handleTextEntry(); }
        });

        primaryStage.setTitle("My Grocery List");
        primaryStage.setResizable(true);
        primaryStage.setScene(new Scene(view, 285,205));
        primaryStage.show();
    }

    // The Add Button event handler
    private void handleAddButtonPress() {
        String text = view.getNewItemField().getText().trim();
        if (text.length() > 0) {
            view.getNewItemField().setText("");
            model.add(text);
            view.update();
        }
    }

    // The Remove Button event handler
    private void handleRemoveButtonPress() {
        int index = view.getList().getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            model.remove(index);
            view.update();
        }
    }

    // The ListView selection event handler
    private void handleListSelection() { view.update(); }

    // The TextField typing event handler
    private void handleTextEntry() { view.update(); }

    public static void main(String[] args) { launch(args); }
}

