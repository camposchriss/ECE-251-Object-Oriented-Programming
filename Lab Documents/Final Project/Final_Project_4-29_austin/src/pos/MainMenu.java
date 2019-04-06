/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;
import javafx.geometry.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;



/**
 *
 * @author Dustin K
 */
public class MainMenu extends GridPane{
	protected Label labelAboveOrder, sides, entrees, drinks, fry,fruit, chips, hb, extras, subtotal ,tax, total, price, item,cashTendered,changeDue;
	protected Button[] entBtn,sideBtn,drinkBtn;
	protected Button extraMeat,extraSauce,removeItem,checkout,manager;
	protected TextField subtotalText,taxText,totalText, enterCash,changeText;
	protected ListView<String> currentOrder;
	private ColumnConstraints col0,col1;
	private ColumnConstraints[] col27;// columns 2-7
        
	
	
	public MainMenu(){
	setHgap(10);
	setVgap(10);
	setPadding(new Insets(20,20,20,20));
	//Current Order 
	currentOrder = new ListView<>();
	//Labels for Entire Gui
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
        cashTendered = new Label("Cash Tendered");
        changeDue = new Label("Change Due: ");
		
		//Add labels to their respective positions
	super.add(subtotal, 0, 11);
        super.add(tax, 0, 12);
        super.add(total,0,13);
        

		//Buttons for Sides			
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
		//Extra Buttons and Manager Mode Button
	extraSauce = new Button("Extra Sauce");
        extraMeat = new Button("Extra Meat");
        extraSauce.setPadding(new Insets(10,10,10,10));
        extraSauce.setTextAlignment(TextAlignment.CENTER);
        extraSauce.setMinSize(40, 20);
        extraSauce.setPrefSize(80, 40);
        extraMeat.setPadding(new Insets(10,10,10,10));
        extraMeat.setTextAlignment(TextAlignment.CENTER);
        extraMeat.setMinSize(40, 20);
        extraMeat.setPrefSize(80, 40);
        removeItem = new Button("Remove");
        removeItem.setPadding(new Insets(10,10,10,10));
        removeItem.setTextAlignment(TextAlignment.CENTER);
        removeItem.setMinSize(40, 20);
        removeItem.setPrefSize(80, 40);
        checkout = new Button("Checkout");
        checkout.setPadding(new Insets(10,10,10,10));
        checkout.setTextAlignment(TextAlignment.CENTER);
        checkout.setMinSize(40, 20);
        checkout.setPrefSize(80, 40);
        manager = new Button("Manager Mode");
        manager.setPadding(new Insets(10,10,10,10));
        manager.setTextAlignment(TextAlignment.CENTER);
        manager.setMinSize(40, 20);
        manager.setPrefSize(80, 40);
		
        subtotalText = new TextField("$0.00");
        subtotalText.setEditable(false);
        subtotalText.setMaxWidth(150);
        subtotalText.setAlignment(Pos.BASELINE_CENTER);
        taxText = new TextField("$0.00");
        taxText.setMaxWidth(150);
        taxText.setEditable(false);
        taxText.setAlignment(Pos.BASELINE_CENTER);
        totalText = new TextField("$0.00");
        totalText.setMaxWidth(150);
        totalText.setEditable(false);
        totalText.setAlignment(Pos.BASELINE_CENTER);
        enterCash = new TextField("0.00");
        enterCash.setMaxWidth(150);
        enterCash.setAlignment(Pos.BOTTOM_CENTER);
        changeText = new TextField("$0.00");
        changeText.setEditable(false);
        changeText.setMaxWidth(150);
        changeText.setAlignment(Pos.BASELINE_CENTER);
        
        super.add(subtotalText, 1, 11);
        super.add(taxText, 1, 12);
        super.add(totalText, 1, 13);
       
        super.add(labelAboveOrder, 0,0);
        super.add(sides, 2, 0,2,1);
        super.add(entrees,6,0);
        //List View
        super.add(currentOrder, 0, 2,2,9);
        currentOrder.setMinWidth(80);
        GridPane.setMargin(currentOrder, new Insets(0,10,10,10));
        //Add node to their respesctive grid boxes
        super.add(item,0,1);
        super.add(price,1,1);
        super.add(fry,2,1);
        super.add(fruit,3,1);
        super.add(chips,4,1);
        super.add(hb,5,1);
        super.addRow(2, sideBtn[0],sideBtn[3],sideBtn[4],sideBtn[5]);// Appends buttons to row 2 
        super.add(drinks,2,6,2,1);
        super.addRow(7, drinkBtn[0],drinkBtn[1],drinkBtn[2],drinkBtn[3]);
        super.add(extras, 2,8,2,1);
        super.add(extraSauce , 2, 9, 2,1);
        super.add(extraMeat , 4, 9,2,1);
        super.add(sideBtn[1],2,3);
        super.add(sideBtn[6],5,3);
        super.add(sideBtn[2],2,4,1,2);
        super.add(sideBtn[7],5,4,1,2);
        super.add(removeItem,2,10,2,1);
        super.add(checkout,4,10,2,1);
        super.add(cashTendered,4,11,2,1);
        super.add(enterCash,4,12,2,1);
        super.add(changeDue,6,11,2,1);
        super.add(changeText,6,12,2,1);
        super.add(manager,2,12,2,2);
        super.add(entBtn[0],6,2,1,1);
        super.add(entBtn[1],7,2,1,1);
        super.add(entBtn[2],6,4,1,2);
        super.add(entBtn[3], 7, 4,1,2);
		
		//Column and Row Constraints
        col0 = new ColumnConstraints(100,150,Integer.MAX_VALUE);
        col1 = new ColumnConstraints(100,150,Integer.MAX_VALUE);
        col1.setHgrow(Priority.SOMETIMES);
        col0.setHgrow(Priority.SOMETIMES);
        col27 = new ColumnConstraints[6];
        for(int i = 0;i<6;i++){
            col27[i] = new ColumnConstraints(50,100,Integer.MAX_VALUE);
            
        }
        getColumnConstraints().addAll(col0,col1,col27[0],col27[1],col27[2],col27[3],col27[4],col27[5]);
		
	}
    
        public void update(Order O){
        String[]  exactList = new String[O.getInvoiceItems().size()];
        int index=0;
        for (Item i: O.getInvoiceItems()){
            exactList[index] =String.format("%-18s%20.2f\n",i.getItemName(),i.getPrice());
            index++;
        }
            
        int selectedIndex = currentOrder.getSelectionModel().getSelectedIndex();
        currentOrder.setItems(FXCollections.observableArrayList(exactList));
        currentOrder.getSelectionModel().select(selectedIndex);
        subtotalText.setText(String.format("$%.2f",Math.abs(O.getTotal())));
        totalText.setText(String.format("$%.2f",Math.abs(1.07*O.getTotal())));
        taxText.setText(String.format("$%.2f",Math.abs(0.07f*O.getTotal())));
        

        
        }
        
        }
    

