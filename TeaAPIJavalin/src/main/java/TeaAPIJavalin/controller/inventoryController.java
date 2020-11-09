package TeaAPIJavalin.controller;

import TeaAPIJavalin.pojos.Inventory;
import TeaAPIJavalin.service.insertInventory;
import TeaAPIJavalin.service.insertInventoryImpl;
import io.javalin.http.Context;

public class inventoryController {

	insertInventory inventory = new insertInventoryImpl();
	
	
	public void addItem(Context ctx) {
		
		
		//will need to to to string like in customer controller bc it doesn't like int
		int productID = ctx.formParam("productID");
		
		int quantity = ctx.formParam("quntity");
		
		String productType = ctx.formParam("productType");
		
		Inventory newItem = new Inventory(productID, quantity, productType);
		
		inventory.addItem(newItem);
	}

	
	public void getAllItems() {
		
	}
}
