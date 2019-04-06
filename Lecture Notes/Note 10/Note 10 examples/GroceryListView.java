import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;

public class GroceryListView extends Pane {
    private ItemList	        model;	        // The model to which this view is attached

    // The user interface components needed by the controller
    private ListView<String>	groceryList;
    private Button		        addButton;
    private Button		        removeButton;
    private TextField	        newItemField;

    // public methods to allow access to window components
    public ListView<String> getList() { return groceryList; }
    public Button getAddButton() { return addButton; }
    public Button getRemoveButton() { return removeButton; }
    public TextField getNewItemField() { return newItemField; }

    public GroceryListView(ItemList m) {
        model = m;			// Store the model for access later

        // Create and position the "new item" TextField
        newItemField = new TextField();
        newItemField.relocate(10, 10);
        newItemField.setPrefSize(150, 25);

        // Create and position the "Add" Button
        addButton = new Button("Add");
        addButton.relocate(175, 10);
        addButton.setPrefSize(100, 25);

        // Create and position the "Remove" Button
        removeButton = new Button("Remove");
        removeButton.relocate(175, 45);
        removeButton.setPrefSize(100, 25);

        // Create and position the grocery ListView with some groceries in it
        groceryList = new ListView<String>();
        String[] groceries = {"Apples", "Oranges", "Bananas", "Toilet Paper", "Ketchup", "Cereal",
                "Milk", "Cookies", "Cheese", "Frozen Pizza"};
        groceryList.setItems(FXCollections.observableArrayList(groceries));
        groceryList.relocate(10, 45);
        groceryList.setPrefSize(150, 150);

        // Add all the components to the window
        getChildren().addAll(newItemField, addButton, removeButton, groceryList);

        // Call update() to make sure model contents are shown
        update();
    }

    // This method is called whenever the model changes, to make
    // sure that the view shows the model's current state
    public void update() {
        // Create and return a new array with the
        // exact size of the number of items in it
        String[]  exactList = new String[model.getSize()];
        for (int i=0; i<model.getSize(); i++)
            exactList[i] = model.getItems()[i];
        int selectedIndex = groceryList.getSelectionModel().getSelectedIndex();
        groceryList.setItems(FXCollections.observableArrayList(exactList));
        groceryList.getSelectionModel().select(selectedIndex);

        // enable/disable the Remove button accordingly
        removeButton.setDisable(groceryList.getSelectionModel().getSelectedIndex() < 0);

        // enable/disable the Add button accordingly
        addButton.setDisable(newItemField.getText().trim().length() == 0);
    }

}

