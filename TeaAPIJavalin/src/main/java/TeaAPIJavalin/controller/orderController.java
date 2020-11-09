package TeaAPIJavalin.controller;

import TeaAPIJavalin.pojos.Customer;
import TeaAPIJavalin.pojos.Orders;
import TeaAPIJavalin.service.placeOrder;
import TeaAPIJavalin.service.placeOrderImpl;
import io.javalin.http.Context;

public class orderController {

	placeOrder newOrder = new placeOrderImpl();

	public void placeOrder(Context ctx) {
		
		String teaType = ctx.formParam("teaType");
		
		String packaging = ctx.formParam("packaging");
		
		int quantity = ctx.formParam("quantity");
		
		double cost = ctx.formParam("cost");
		
		int customerId = ctx.formParam("customerId");
		
		Orders placedOrder = new Orders(teaType, packaging, quantity, cost, customerId);
		
		newOrder.placeOrder(placedOrder);
		
		
	}
	
public void getAllOrders() {
		
	}
}
