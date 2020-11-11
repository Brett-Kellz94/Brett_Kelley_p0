package TeaAPIJavalin.controller;

import TeaAPIJavalin.pojos.Inventory;
import TeaAPIJavalin.service.insertInventory;
import TeaAPIJavalin.service.insertInventoryImpl;
import TeaAPIJavalin.service.inventoryFullstack;
import io.javalin.http.Context;

public class inventoryController {

	insertInventory inventory = new inventoryFullstack();
	
	
	public void addItem(Context ctx) {
		
		
		//will need to to to string like in customer controller bc it doesn't like int
        int productID = Integer.parseInt(ctx.formParam("productID"));
		
		int quantity = Integer.parseInt(ctx.formParam("quantity"));
		
		String productType = ctx.formParam("productType");
		
		Inventory newItem = new Inventory(productID, quantity, productType);
		
		inventory.addItem(newItem);
	}

	
	public void getAllItems() {
	}
		
	public void updateItem(Context ctx) {
		
	       int productID = Integer.parseInt(ctx.formParam("productID"));
			
			int quantity = Integer.parseInt(ctx.formParam("quantity"));
			
			String productType = ctx.formParam("productType");
			
			Inventory updatedItem = new Inventory(productID, quantity, productType);
			
			inventory.updateItem(updatedItem);
		}
	
	public void deleteItem(Context ctx) {
		int productID = Integer.parseInt(ctx.formParam("productID"));
		
		//int quantity = Integer.parseInt(ctx.formParam("quantity"));
		
		//String productType = ctx.formParam("productType");
		
		Inventory updatedItem = new Inventory(productID);
		
		inventory.deleteItem(updatedItem);
	}
		
		
	}

