import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
//---------------version 1-----------------//

public class GridPaneExample2 extends Application  {
    public void start(Stage primaryStage) {

        GridPane  aPane = new GridPane();
        aPane.setPadding(new Insets(10, 10, 10, 10));

        TextField newItemField = new TextField();
        aPane.add(newItemField,0,0);

        Button addButton = new Button("Add");
        aPane.add(addButton,1,0);

        ListView<String> fruitList = new ListView<String>();
        String[] fruits = {"Apples", "Oranges", "Bananas", "Cherries", "Lemons", "Pears",
                "Strawberries", "Peaches", "Pomegranates", "Nectarines", "Apricots"};
        fruitList.setItems(FXCollections.observableArrayList(fruits));
        aPane.add(fruitList,0,1);

        Button removeButton = new Button("Remove");
        aPane.add(removeButton,1,1);

        primaryStage.setTitle("Fruit List");
        primaryStage.setScene(new Scene(aPane, 420,320));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
*/
/*
//---------------version 2-----------------//

public class GridPaneExample2 extends Application  {
    public void start(Stage primaryStage) {



        GridPane  aPane = new GridPane();
        aPane.setPadding(new Insets(10, 10, 10, 10));

        TextField newItemField = new TextField();
        newItemField.setMinHeight(30);
        aPane.add(newItemField,0,0);

        Button addButton = new Button("Add");
        aPane.add(addButton,1,0);

        ListView<String> fruitList = new ListView<String>();
        String[] fruits = {"Apples", "Oranges", "Bananas", "Cherries", "Lemons", "Pears",
                "Strawberries", "Peaches", "Pomegranates", "Nectarines", "Apricots"};
        fruitList.setItems(FXCollections.observableArrayList(fruits));
         aPane.add(fruitList,0,1);

        Button removeButton = new Button("Remove");
        aPane.add(removeButton,1,1);
        aPane.setValignment(removeButton, VPos.TOP);

        primaryStage.setTitle("Fruit List");
        primaryStage.setScene(new Scene(aPane, 420,320));
        primaryStage.show();
   }

    public static void main(String[] args) {
        launch(args);
    }
}

*/
//---------------version 3-----------------//

public class GridPaneExample2 extends Application  {
    public void start(Stage primaryStage) {


        GridPane  aPane = new GridPane();
        aPane.setPadding(new Insets(10, 10, 10, 10));

        TextField newItemField = new TextField();
        newItemField.setMinHeight(30);
        aPane.add(newItemField,0,0);
        aPane.setMargin(newItemField, new Insets(0, 0, 10, 0));

        Button addButton = new Button("Add");
        aPane.add(addButton,1,0);
        addButton.setMinHeight(30);
        addButton.setMinWidth(100);
        aPane.setMargin(addButton, new Insets(0, 0, 10, 10));

        ListView<String> fruitList = new ListView<String>();
        String[] fruits = {"Apples", "Oranges", "Bananas", "Cherries", "Lemons", "Pears",
                "Strawberries", "Peaches", "Pomegranates", "Nectarines", "Apricots"};
        fruitList.setItems(FXCollections.observableArrayList(fruits));
        fruitList.setPrefWidth(Integer.MAX_VALUE);
        fruitList.setPrefHeight(Integer.MAX_VALUE);
        aPane.add(fruitList,0,1);

        Button removeButton = new Button("Remove");
        aPane.add(removeButton,1,1);
        removeButton.setMinHeight(30);
        removeButton.setMinWidth(100);
        aPane.setMargin(removeButton, new Insets(0, 0, 0, 10));
        aPane.setValignment(removeButton, VPos.TOP);

        primaryStage.setTitle("Fruit List");
        primaryStage.setScene(new Scene(aPane, 420,320));
        primaryStage.show();

   }

    public static void main(String[] args) {
        launch(args);
    }
}
