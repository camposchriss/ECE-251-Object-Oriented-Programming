import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class AddressPane extends Pane {
    public AddressPane(String title) {
        Pane innerPane  = new Pane();
        innerPane.setStyle("-fx-background-color: white;\n" +"  -fx-border-color: gray;  -fx-padding: 4 4;");

        // Create the labels and textfields
        Label label1 = new Label("Name:");
        label1.relocate(10, 20);
        label1.setPrefSize(80, 30);

        Label label2 = new Label("Street:");
        label2.relocate(10, 55);
        label2.setPrefSize(80, 30);

        Label label3 = new Label("City:");
        label3.relocate(10, 90);
        label3.setPrefSize(80, 30);

        Label label4 = new Label("State:");
        label4.relocate(10, 125);
        label4.setPrefSize(80, 30);

        Label label5 = new Label("Postal Code:");
        label5.relocate(10, 160);
        label5.setPrefSize(80, 30);

        TextField nameField = new TextField();
        nameField.relocate(100, 20);
        nameField.setPrefSize(300, 30);

        TextField streetField = new TextField();
        streetField.relocate(100, 55);
        streetField.setPrefSize(300, 30);

        TextField cityField = new TextField();
        cityField.relocate(100, 90);
        cityField.setPrefSize(300, 30);

        TextField stateField = new TextField();
        stateField.relocate(100, 125);
        stateField.setPrefSize(300, 30);

        TextField postalField = new TextField();
        postalField.relocate(100, 160);
        postalField.setPrefSize(300, 30);

        // Add all labels and textfields to the pane
        innerPane.getChildren().addAll(label1, label2, label3, label4, label5, nameField,
                                       streetField, cityField, stateField, postalField);

        // Make a title for border and add it as well as inner pane to main pane
        Label titleLabel = new Label();     // This is the title to be placed onto the border
        titleLabel.setText(title);          // Incoming constructor parameter
        titleLabel.setStyle("-fx-background-color: white; -fx-translate-y: -8; -fx-translate-x: 10;");
        getChildren().addAll(innerPane, titleLabel);
    }
}
