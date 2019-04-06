/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;
import javafx.geometry.*;

import java.util.ArrayList;

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
public class ManagerMenu extends GridPane{
    Button rmvBtn,cashierBtn;
    ListView<Integer> orderNumbersList;
    public ArrayList<Integer> listOfOrderNums;
    
    public ManagerMenu(){
        this.setPadding(new Insets(16, 16, 16, 16));
        this.setVgap(4);
        orderNumbersList = new ListView<>();
        rmvBtn = new Button("Void Order");
        cashierBtn = new Button("Cashier Menu");
        super.add(orderNumbersList,1,1);
        super.add(rmvBtn,1,2);
        super.add(cashierBtn,1,3);
       
    }
    public void update(ArrayList<Order> allOrders) {
    		listOfOrderNums = new ArrayList<Integer>(16);
            for (Order g : allOrders){
            		listOfOrderNums.add(g.getOrderNumber());
            }
         orderNumbersList.setItems(FXCollections.observableArrayList(listOfOrderNums));
         
         
    }
}
