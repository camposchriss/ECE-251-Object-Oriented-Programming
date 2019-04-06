import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;


//-------------------------- Version 1------------------------------//
public class GridPaneExample3 extends Application {
 	public void start(Stage primaryStage) {
 		GridPane aPane = new GridPane();
 		// Put a 10-pixel margin all around the outside of the pane
		aPane.setPadding(new Insets(10, 10, 10, 10));
 		// Add the labels at the top of the pane
 		Label aLabel = new Label("Items");
 		aPane.add(aLabel,0,0);

 		aLabel = new Label("Price");
 		aPane.add(aLabel,1,0);

 		aLabel = new Label("Shopping Cart");
 		aPane.add(aLabel,2,0,2,1); // spans 2 columns, 1 row

 		// Add the Price textfield and the Purchase button
 		TextField priceField = new TextField("$2.99");
 		aPane.add(priceField,1,1);

 		Button purchaseButton = new Button("Purchase");
		aPane.add(purchaseButton,1,2);

 		// Add the Total and Due labels and text fields
 		aLabel = new Label("Total");
 		aPane.add(aLabel,2,3);

 		aLabel = new Label("Due");
 		aPane.add(aLabel,2,4);

 		TextField totalField = new TextField("$4.48");
 		aPane.add(totalField,3,3);

 		TextField dueField = new TextField("$8.45");
 		aPane.add(dueField,3,4);

 		// Add the Items List and Shopping Cart List
		ListView<String> itemsList = new ListView<String>();
 		String[] fruits = {"Dozen Apples", "Basket O' Plums", "Large Eggs","2L Milk", "Cheese Curds", "24 pack Coke","12 pack Sprite", "Canned Olives"};
 		itemsList.setItems(FXCollections.observableArrayList(fruits));
 		aPane.add(itemsList,0,1,1,4); // spans 1 column, 4 rows

 		ListView cartList = new ListView();
 		String[] fruits2 = {"Dozen Apples", "Basket O' Plums"};
 		cartList.setItems(FXCollections.observableArrayList(fruits2));
 		aPane.add(cartList,2,1,2,2); // spans 2 columns, 2 rows

 		primaryStage.setTitle("Shopping Application");
		primaryStage.setScene(new Scene(aPane, 660,480));
 		primaryStage.show();
 	}
 public static void main(String[] args) { launch(args); }
}

/*
//-------------------------- Version 2------------------------------//
public class GridPaneExample3 extends Application {
 	public void start(Stage primaryStage) {
	GridPane aPane = new GridPane();
 		// Put a 10-pixel margin all around the outside of the pane
		aPane.setPadding(new Insets(10, 10, 10, 10));
 		// Add the labels at the top of the pane
 		Label aLabel = new Label("Items");
 		aPane.add(aLabel,0,0);

 		aLabel = new Label("Price");
 		aPane.add(aLabel,1,0);

 		aLabel = new Label("Shopping Cart");
 		aPane.add(aLabel,2,0,2,1); // spans 2 columns, 1 row

 		// Add the Price textfield and the Purchase button
 		TextField priceField = new TextField("$2.99");
 		priceField.setMinHeight(25);
		priceField.setMinWidth(80);
 		aPane.add(priceField,1,1);

 		Button purchaseButton = new Button("Purchase");
		aPane.setValignment(purchaseButton, VPos.TOP);
		purchaseButton.setMinHeight(25);
		purchaseButton.setMinWidth(80);
		aPane.add(purchaseButton,1,2);

 		// Add the Total and Due labels and text fields
 		aLabel = new Label("Total");
 		aPane.add(aLabel,2,3);

 		aLabel = new Label("Due");
 		aPane.add(aLabel,2,4);

 		TextField totalField = new TextField("$4.48");
 		totalField.setMinHeight(25);
		totalField.setMinWidth(80);
 		aPane.add(totalField,3,3);

 		TextField dueField = new TextField("$8.45");
 		dueField.setMinHeight(25);
		dueField.setMinWidth(80);
 		aPane.add(dueField,3,4);

 		// Add the Items List and Shopping Cart List
		ListView<String> itemsList = new ListView<String>();
 		String[] fruits = {"Dozen Apples", "Basket O' Plums", "Large Eggs","2L Milk", "Cheese Curds", "24 pack Coke","12 pack Sprite", "Canned Olives"};
 		itemsList.setItems(FXCollections.observableArrayList(fruits));
 		aPane.add(itemsList,0,1,1,4); // spans 1 column, 4 rows

 		ListView cartList = new ListView();
 		String[] fruits2 = {"Dozen Apples", "Basket O' Plums"};
 		cartList.setItems(FXCollections.observableArrayList(fruits2));
 		aPane.add(cartList,2,1,2,2); // spans 2 columns, 2 rows

 		primaryStage.setTitle("Shopping Application");
		primaryStage.setScene(new Scene(aPane, 660,480));
 		primaryStage.show();
 	}
 public static void main(String[] args) { launch(args); }
}
*/

/*
   //-------------------------- Version 3------------------------------//
public class GridPaneExample3 extends Application  {
    public void start(Stage primaryStage) {

        GridPane  aPane = new GridPane();
        // Put a 10-pixel margin all around the outside of the pane
        aPane.setPadding(new Insets(10, 10, 10, 10));

        // Add the labels at the top of the pane
        Label aLabel = new Label("Items");
        aPane.setMargin(aLabel, new Insets(0, 0, 10, 0));
        aPane.add(aLabel,0,0);
        aLabel = new Label("Price");
        aPane.setMargin(aLabel, new Insets(0, 0, 10, 10));
        aPane.add(aLabel,1,0);
        aLabel = new Label("Shopping Cart");
        aPane.setMargin(aLabel, new Insets(0, 0, 10, 0));
        aPane.add(aLabel,2,0,2,1);   // spans 2 columns, 1 row

        // Add the Price textfield and the Purchase button
        TextField priceField = new TextField("$2.99");
        priceField.setAlignment(Pos.CENTER_RIGHT);
        priceField.setMinHeight(25);
        priceField.setMinWidth(80);
        aPane.setMargin(priceField, new Insets(0, 10, 10, 10));
        aPane.add(priceField,1,1);

        Button purchaseButton = new Button("Purchase");
        purchaseButton.setMinHeight(25);
        purchaseButton.setPrefWidth(80);
        aPane.setValignment(purchaseButton, VPos.TOP);
        aPane.setMargin(purchaseButton, new Insets(0, 10, 10, 10));
        aPane.add(purchaseButton,1,2);

        // Add the Total and Due labels and text fields
        aLabel = new Label("Total");
        aPane.setHalignment(aLabel, HPos.RIGHT);
        aPane.setMargin(aLabel, new Insets(0, 10, 0, 0));
        aPane.add(aLabel,2,3);

        aLabel = new Label("Due");
        aPane.setHalignment(aLabel, HPos.RIGHT);
        aPane.setMargin(aLabel, new Insets(0, 10, 0, 0));
        aPane.add(aLabel,2,4);

        TextField totalField = new TextField("$4.48");
        totalField.setAlignment(Pos.CENTER_RIGHT);
        totalField.setMinHeight(25);
        totalField.setMinWidth(80);
        aPane.setMargin(totalField, new Insets(10, 0, 0, 0));
        aPane.add(totalField,3,3);

        TextField dueField = new TextField("$8.45");
        dueField.setAlignment(Pos.CENTER_RIGHT);
        dueField.setMinHeight(25);
        dueField.setMinWidth(80);
        aPane.setMargin(dueField, new Insets(10, 0, 0, 0));
        aPane.add(dueField,3,4);

        // Add the Items List and Shopping Cart List
        ListView<String> itemsList = new ListView<String>();
        String[] fruits = {"Dozen Apples", "Basket O' Plums", "Large Eggs",
                "2L Milk", "Cheese Curds", "24 pack Coke",
                "12 pack Sprite", "Canned Olives"};
        itemsList.setItems(FXCollections.observableArrayList(fruits));
        aPane.add(itemsList,0,1,1,4);  // spans 1 column, 3 rows

        ListView cartList = new ListView();
        String[] fruits2 = {"Dozen Apples", "Basket O' Plums"};
        cartList.setItems(FXCollections.observableArrayList(fruits2));
        aPane.add(cartList,2,1,2,2);  // spans 2 columns, 2 rows

        // Specify the size and growth for each column and row
        ColumnConstraints column0 = new ColumnConstraints(50, 300, Integer.MAX_VALUE);
        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(50, 300, Integer.MAX_VALUE);
        ColumnConstraints column3 = new ColumnConstraints(100);
        column0.setHgrow(Priority.ALWAYS);
        column2.setHgrow(Priority.ALWAYS);
        aPane.getColumnConstraints().addAll(column0, column1, column2, column3);
        RowConstraints row0 = new RowConstraints(25);
        RowConstraints row1 = new RowConstraints(35);
        RowConstraints row2 = new RowConstraints(50, 300, Integer.MAX_VALUE);
        RowConstraints row3 = new RowConstraints(40);
        RowConstraints row4 = new RowConstraints(35);
        row2.setVgrow(Priority.ALWAYS);
        aPane.getRowConstraints().addAll(row0, row1, row2, row3, row4);

        primaryStage.setTitle("Shopping Application");
        primaryStage.setScene(new Scene(aPane, 660,480));
        primaryStage.show();

    }

    public static void main(String[] args) { launch(args); }
}
*/