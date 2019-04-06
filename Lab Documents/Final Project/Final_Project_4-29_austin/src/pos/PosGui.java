/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.ArrayList;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author Dustin K
 */
public class PosGui extends Application {
    private MainMenu v1;
    private ManagerMenu viewManager;
    private Scene s1,s2;// main scene and other scene
    private Order currentOrder;
    private ArrayList<Order> allOrders;
    private Alert alert,invalidCash; 

    @Override
    public void start(Stage primaryStage) {
       //Instantiate main menu
       v1 = new MainMenu();
       s1 = new Scene(v1,800,600);
       //Instantiate manager's menu
       viewManager = new ManagerMenu();
       s2 = new Scene(viewManager, 1000,600);
       currentOrder = new Order();
       allOrders = new ArrayList<>();
       alert = new Alert(AlertType.ERROR);
       invalidCash = new Alert(AlertType.WARNING);
      

       primaryStage.setScene(s1);
       primaryStage.setTitle("Burgers are Us");
       primaryStage.show();


       //Event Handlers
       v1.checkout.setOnAction(new EventHandler<ActionEvent>(){
           @Override
           public void handle(ActionEvent actionEvent){
               checkOutPress();
           }
       }   
       );
       v1.sideBtn[0].setOnAction(new EventHandler<ActionEvent>(){
       @Override
       public void handle(ActionEvent actionEvent){
           smallFryPress();
       }
       
       });
       v1.sideBtn[1].setOnAction(e -> mediumFryPress());
       v1.sideBtn[2].setOnAction(e -> largeFryPress());
       v1.sideBtn[3].setOnAction(e -> fruitPress());
       v1.sideBtn[4].setOnAction(e-> chipPress() );
       v1.sideBtn[5].setOnAction(e-> smallHashbrownPress() );
       v1.sideBtn[6].setOnAction(e-> mediumHashbrownPress() );
       v1.sideBtn[7].setOnAction(e-> largeHashbrownPress());
       v1.removeItem.setOnAction(e-> removePress());
       v1.entBtn[0].setOnAction(e->burgerPress());
       v1.entBtn[1].setOnAction(e->sandwichPress());
       v1.entBtn[2].setOnAction(e->saladPress());
       v1.entBtn[3].setOnAction(e->wrapPress());
       v1.drinkBtn[0].setOnAction(e-> smallDrinkPress()); //These 4 buttons all had an array address of 0, so only one button worked.
       v1.drinkBtn[1].setOnAction(e-> mediumDrinkPress()); //Austin entered the right array addresses on 4/26/18.
       v1.drinkBtn[2].setOnAction(e-> largeDrinkPress());
       v1.drinkBtn[3].setOnAction(e-> xLargeDrinkPress());
       v1.extraSauce.setOnAction(e-> extraSaucePress());
       v1.manager.setOnAction(e-> managerPress(primaryStage));
       viewManager.cashierBtn.setOnAction(e-> cashierPress(primaryStage));
       viewManager.rmvBtn.setOnAction(e -> voidOrder());
       //viewManager.rmvBtn.setOnAction(e -> viewManager.ordersList.);
    }
    //Handling Methods
    //Check Out Button
	public void checkOutPress(){ //Austin changed this method on 4/26/18.
        //fOut.writeObject(currentOrder);
        float cashTendered = -0.01f;
        boolean caught = false;
        try{
        cashTendered = Float.parseFloat(v1.enterCash.getText());
        }
        catch(NumberFormatException e){
            invalidCash.setTitle("Please Enter Valid Data Type");
            invalidCash.setHeaderText("");
            invalidCash.setContentText("Enter a number in bank format with no special characters.");
            invalidCash.showAndWait();
            v1.enterCash.setText("0.00");
            caught = true;
            
        }
        if(cashTendered>=currentOrder.getTotal()&&(currentOrder.getInvoiceItems()).size()>0){
        Receipt finalReciept = new Receipt(currentOrder);
        finalReciept.printReciept();
        v1.changeText.setText(String.format("$  %-5.2f",cashTendered - currentOrder.getTotal() ));
        allOrders.add(currentOrder);
        viewManager.update(allOrders);
        //Order.orders++;
        currentOrder = new Order();
        v1.update(currentOrder);
        
        }
        else if(currentOrder.getInvoiceItems().size()<=0)
        {
            //Do Nothing
        }
        else{
            if(caught){ 
            } 
            else {
                alert.setTitle("Error Dialog");
                alert.setHeaderText("Cash Tendered");
                alert.setContentText("Cannot ring out order for less than order total");
                alert.showAndWait();
            }
        }
        
        
    }
    //Sides
    
    public void smallFryPress(){
        currentOrder.addItem(new Side(Item.Size.SMALL,Item.SideOption.FRY));
        v1.update(currentOrder);
    }
    
    public void mediumFryPress(){
        currentOrder.addItem(new Side(Item.Size.MEDIUM,Item.SideOption.FRY));
        v1.update(currentOrder);
    }
    
    public void largeFryPress(){
        currentOrder.addItem(new Side(Item.Size.LARGE,Item.SideOption.FRY));
                v1.update(currentOrder);
    }
    public void fruitPress(){
        currentOrder.addItem(new Side(Item.Size.DEFAULT,Item.SideOption.FRUIT));
        v1.update(currentOrder);
    }
    public void chipPress(){
        currentOrder.addItem(new Side(Item.Size.DEFAULT,Item.SideOption.BAGCHIPS));
        v1.update(currentOrder);
    }
    
    public void smallHashbrownPress(){
        currentOrder.addItem(new Side(Item.Size.SMALL,Item.SideOption.HASHBROWNS));
        v1.update(currentOrder);
    }
    
    public void mediumHashbrownPress(){
        currentOrder.addItem(new Side(Item.Size.MEDIUM,Item.SideOption.HASHBROWNS));
        v1.update(currentOrder);
        
    }
    public void largeHashbrownPress(){
        currentOrder.addItem(new Side(Item.Size.LARGE,Item.SideOption.HASHBROWNS));
        v1.update(currentOrder);
    }
    
    //Entrees
    public void burgerPress(){
        currentOrder.addItem(new MainDish(Item.Dish.BURGER));
        v1.update(currentOrder);
    }
    public void sandwichPress(){
        currentOrder.addItem(new MainDish(Item.Dish.OTHERSANDWICH));
        v1.update(currentOrder);
    }
    public void wrapPress(){
        currentOrder.addItem(new MainDish(Item.Dish.WRAP));
        v1.update(currentOrder);
    }
    public void saladPress(){
        currentOrder.addItem(new MainDish(Item.Dish.SALAD));
        v1.update(currentOrder);
    }
    public void smallDrinkPress(){
        currentOrder.addItem(new Drink(Item.Size.SMALL));
        v1.update(currentOrder);
    }
    public void mediumDrinkPress(){
        currentOrder.addItem(new Drink(Item.Size.MEDIUM));
        v1.update(currentOrder);
    }
    public void largeDrinkPress(){
        currentOrder.addItem(new Drink(Item.Size.LARGE));
        v1.update(currentOrder);
    }
    public void xLargeDrinkPress(){
        currentOrder.addItem(new Drink(Item.Size.XLARGE));
        v1.update(currentOrder);
    }
    public void cashierPress(Stage primaryStage){
       primaryStage.setScene(s1);
       primaryStage.setTitle("Burgers Are Us");
    }
    public void managerPress(Stage primaryStage){
       primaryStage.setScene(s2);
       primaryStage.setTitle("Manager Mode");
        
    }
    public void extraSaucePress(){
        int index = v1.currentOrder.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            Item selectedItem = currentOrder.getInvoiceItems().get(index);//Actual Order 
            if(selectedItem instanceof MainDish)
            {
                ((MainDish) selectedItem).addExtraSauce();
            }
            currentOrder.updateTotal();
            v1.update(currentOrder);
            }
    }
    
    public void removePress(){
        int index = v1.currentOrder.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            currentOrder.removeItem(index);//Actual Order 
            v1.update(currentOrder);
        }
    }
    
    //Not sure what this is for @Austin
  /*  public void managerRemoveOrderPress() {
    		allOrders.add(currentOrder);
    		
    		viewManager.update(allOrders);
    }*/
    
    public void voidOrder(){
            int index = viewManager.orderNumbersList.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            allOrders.remove(index);//Actual Order 
            viewManager.update(allOrders);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
   
    
}
        //Version Before Controller
        /*
       //Default Gui Built
        Button btn = new Button();
        btn.setPadding(new Insets(20,20,20,20));
        btn.setText("Cashier Attendent");
       // btn.setOnAction(e -> primaryStage.setScene(new Scene(cashierMenu,800,600)));
        //Brings employee to menu in which he can take a customer's order
        // and cash their order out. Changes Scene of Primary Stage
        Button manBtn = new Button();
        manBtn.setPadding(new Insets(20,20,20,20));
        manBtn.setText("Manager's Menu");// Button that refers to manager's menu in which
        //manager can modify and void orders. 
        
        
        HBox root = new HBox();
        root.getChildren().add(btn);//--why do I use getChildren() method for HBox but not GridPane
        root.getChildren().add(manBtn);
        root.setPadding(new Insets(20,20,20,20));
        root.setSpacing(4);
        
        
        
        
        Scene scene = new Scene(root, 500, 300);
        

        //This scene will be defined to let the user select from customer and manager mode 
        //at the start of the application. i.e. Default window.
        GridPane cashierMenu = new GridPane();
        cashierMenu.setHgap(10);//sets Horizontal Gap between components
        cashierMenu.setVgap(10);//vertical gap components
        cashierMenu.setPadding(new Insets(20,20,20,20));
        //Components Buttons, List Views, Labels, Text Field for entire cashier menu.
        ListView<String> currentOrder = new ListView<>();
        Label labelAboveOrder, sides, entrees, drinks, fry, fruit, chips, hb,item,price, extras,subtotal,tax,total;
        labelAboveOrder = new Label("Current Order Items");
        sides = new Label("Sides");
        entrees = new Label("Entrees");
        drinks = new Label("Drinks");
        fry = new Label("Fry");
        fruit = new Label("Fruit");
        chips = new Label("Chips");
        hb = new Label("HashBrowns");
        extras = new Label("Extras");
        subtotal = new Label("Subtotal"); 
        tax = new Label("Tax");
        total = new Label("Total");
        price = new Label("Price");
        item = new Label("Item");
        //Add all labels to appropriate gridpane section
        cashierMenu.add(subtotal, 0, 11);
        cashierMenu.add(tax, 0, 12);
        cashierMenu.add(total,0,13);
        
        //Buttons for Side menu
        Button[] sideBtn;
        sideBtn = new Button[8];
        sideBtn[0] = new Button("SM");//SmallFry
        sideBtn[1] = new Button("MD");//fry
        sideBtn[2] = new Button("LG");//fry
        sideBtn[3] = new Button("Fruit");
        sideBtn[4] = new Button("Chips");
        sideBtn[5] = new Button("SM");//Hashbrown
        sideBtn[6] = new Button("MD");//Hashbrown
        sideBtn[7] = new Button("LG");//Hash Brown
        for(Button bt : sideBtn){
            bt.setPadding(new Insets(10,10,10,10));
            bt.setMinSize(40, 20);
            bt.setPrefSize(80, 40);
            bt.setTextAlignment(TextAlignment.CENTER);
        }
        
        
        //Entree Buttons
        Button[] entBtn;
        entBtn = new Button[4];
        entBtn[0] = new Button("  Burger ");
        entBtn[1] = new Button(" Sandwich ");
        entBtn[2] = new Button("   Salad  ");
        entBtn[3] = new Button("    Wrap  ");
         for(Button bt : entBtn){
            bt.setPadding(new Insets(10,10,10,10));
            bt.setMinSize(40, 20);
            bt.setPrefSize(80, 40);
            bt.setTextAlignment(TextAlignment.CENTER);
        }
        
        //Drink Buttons
        Button[] drinkBtn;
        drinkBtn = new Button[4];
        drinkBtn[0] = new Button("SM");
        drinkBtn[1] = new Button("MD");
        drinkBtn[2] = new Button("LG");
        drinkBtn[3] = new Button("XL");
        //Set Drink Button Attributes
         for(Button bt : drinkBtn){
            bt.setPadding(new Insets(10,10,10,10));
            bt.setMinSize(40, 20);
            bt.setPrefSize(80, 40);
            bt.setTextAlignment(TextAlignment.CENTER);
        }
        
        //Extras Buttons size and padding settings
        Button extraSauce = new Button("Extra Sauce");
        Button extraMeat = new Button("Extra Meat");
        extraSauce.setPadding(new Insets(10,10,10,10));
        extraSauce.setTextAlignment(TextAlignment.CENTER);
        extraSauce.setMinSize(40, 20);
        extraSauce.setPrefSize(80, 40);
        extraMeat.setPadding(new Insets(10,10,10,10));
        extraMeat.setTextAlignment(TextAlignment.CENTER);
        extraMeat.setMinSize(40, 20);
        extraMeat.setPrefSize(80, 40);
        Button removeItem = new Button("Remove Item");
        removeItem.setPadding(new Insets(10,10,10,10));
        removeItem.setTextAlignment(TextAlignment.CENTER);
        removeItem.setMinSize(40, 20);
        removeItem.setPrefSize(80, 40);
        Button checkout = new Button("Checkout");
        checkout.setPadding(new Insets(10,10,10,10));
        checkout.setTextAlignment(TextAlignment.CENTER);
        checkout.setMinSize(40, 20);
        checkout.setPrefSize(80, 40);
        Button manager = new Button("Manager Mode");
        manager.setPadding(new Insets(10,10,10,10));
        manager.setTextAlignment(TextAlignment.CENTER);
        manager.setMinSize(40, 20);
        manager.setPrefSize(80, 40);
        
        
        //Text Field for Total boxes. They are not editable and will be generated by the Model.
        TextField subtotalText = new TextField("0.00");
        subtotalText.setEditable(false);
        TextField taxText = new TextField("0.00");
        taxText.setEditable(false);
        TextField totalText = new TextField("0.00");
        totalText.setEditable(false);
        
        cashierMenu.add(subtotalText, 1, 11);
        cashierMenu.add(taxText, 1, 12);
        cashierMenu.add(totalText, 1, 13);
       
        cashierMenu.add(labelAboveOrder, 0,0);
        cashierMenu.add(sides, 2, 0,2,1);
        cashierMenu.add(entrees,6,0);
        //List View
        cashierMenu.add(currentOrder, 0, 2,2,9);
        currentOrder.setMinWidth(80);
        GridPane.setMargin(currentOrder, new Insets(0,10,10,10));
        //Add node to their respesctive grid boxes
        cashierMenu.add(item,0,1);
        cashierMenu.add(price,1,1);
        cashierMenu.add(fry,2,1);
        cashierMenu.add(fruit,3,1);
        cashierMenu.add(chips,4,1);
        cashierMenu.add(hb,5,1);
        cashierMenu.addRow(2, sideBtn[0],sideBtn[3],sideBtn[4],sideBtn[5]);// Appends buttons to row 2 
        cashierMenu.add(drinks,2,6,2,1);
        cashierMenu.addRow(7, drinkBtn[0],drinkBtn[1],drinkBtn[2],drinkBtn[3]);
        cashierMenu.add(extras, 2,8,2,1);
        cashierMenu.add(extraSauce , 2, 9, 2,1);
        cashierMenu.add(extraMeat , 4, 9,2,1);
        cashierMenu.add(sideBtn[1],2,3);
        cashierMenu.add(sideBtn[6],5,3);
        cashierMenu.add(sideBtn[2],2,4,1,2);
        cashierMenu.add(sideBtn[7],5,4,1,2);
        cashierMenu.add(removeItem,2,10,2,1);
        cashierMenu.add(checkout,4,10,2,1);
        cashierMenu.add(manager,2,12,2,2);
        cashierMenu.add(entBtn[0],6,2,1,1);
        cashierMenu.add(entBtn[1],7,2,1,1);
        cashierMenu.add(entBtn[2],6,4,1,2);
        cashierMenu.add(entBtn[3], 7, 4,1,2);
        
        //Column and Row Constraints
        ColumnConstraints col0 = new ColumnConstraints(100,150,Integer.MAX_VALUE);
        ColumnConstraints col1 = new ColumnConstraints(100,150,Integer.MAX_VALUE);
        col1.setHgrow(Priority.SOMETIMES);
        col0.setHgrow(Priority.SOMETIMES);
        ColumnConstraints[] col27 = new ColumnConstraints[6];
        for(int i = 0;i<6;i++){
            col27[i] = new ColumnConstraints(50,100,Integer.MAX_VALUE);
            
        }
        cashierMenu.getColumnConstraints().addAll(col0,col1,col27[0],col27[1],col27[2],col27[3],col27[4],col27[5]);
        
        
        
        /*will need to display current order items
        String[] names = {"Warm Spring", "Sunny Day", "Rainy Day", "Freezing Winter", "Hot Summer"};
        currentOrder.setItems(FXCollections.observableArrayList(names));
        */
        //btn.setOnAction(e -> primaryStage.setScene(new Scene(cashierMenu,800,600))); use later
        /*
        primaryStage.setTitle("Burgers Are Us");
        primaryStage.setScene(new Scene(cashierMenu,800,600));
        //primaryStage.setScene(scene);
        primaryStage.show();
        */
        