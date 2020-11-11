package TeaAPIJavalin;

import TeaAPIJavalin.controller.customerController;
import TeaAPIJavalin.controller.inventoryController;
import TeaAPIJavalin.controller.orderController;
import io.javalin.Javalin;


public class ServerDriver {

	
	private static customerController customerController = new customerController();
	private static orderController orderController = new orderController();
	private static inventoryController inventoryController = new inventoryController();
	
	public static void main(String[] args) {
		Javalin app = Javalin.create().start(9090); //sets up and starts our server
		app.post("/customer", ctx -> customerController.createCustomer(ctx));
		app.put("/updatecustomer", ctx -> customerController.updateCustomer(ctx));
		app.put("/deletecustomer", ctx -> customerController.deleteCustomer(ctx));
		
		app.post("/order", ctx -> orderController.placeNewOrder(ctx));
		app.put("/updateorder", ctx -> orderController.updateOrder(ctx));
		app.put("/deleteorder", ctx -> orderController.deleteOrder(ctx));
		
		app.post("/inventory", ctx -> inventoryController.addItem(ctx));
		app.put("/updateitem", ctx -> inventoryController.updateItem(ctx));
		app.put("/deleteitem", ctx -> inventoryController.deleteItem(ctx));
		
	}

}
