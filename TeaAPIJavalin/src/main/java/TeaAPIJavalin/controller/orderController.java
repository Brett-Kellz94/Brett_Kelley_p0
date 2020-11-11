package TeaAPIJavalin.controller;

import TeaAPIJavalin.pojos.Orders;
import TeaAPIJavalin.service.placeOrder;
import TeaAPIJavalin.service.placeOrderFullstack;
import TeaAPIJavalin.service.placeOrderImpl;
import io.javalin.http.Context;

public class orderController {

	placeOrder newOrder = new placeOrderFullstack();

	public void placeNewOrder(Context ctx) {
		
		String teaType = ctx.formParam("teaType");
		
		String packaging = ctx.formParam("packaging");
		
		int quantity = Integer.parseInt(ctx.formParam("quantity"));
		
		double cost = Double.parseDouble(ctx.formParam("cost"));
		
		int customerId = Integer.parseInt(ctx.formParam("customerId"));
		
		Orders placedOrder = new Orders(teaType, packaging, quantity, cost, customerId);
		
		newOrder.placeNewOrder(placedOrder);
		
		
	}
	
public void getAllOrders() {
		
	}

public void updateOrder(Context ctx) {
	
	String teaType = ctx.formParam("teaType");
	
	String packaging = ctx.formParam("packaging");
	
	int quantity = Integer.parseInt(ctx.formParam("quantity"));
	
	double cost = Double.parseDouble(ctx.formParam("cost"));
	
	int customerId = Integer.parseInt(ctx.formParam("customerId"));
	
	int orderId = Integer.parseInt(ctx.formParam("orderId"));
	
	Orders placedOrder = new Orders(teaType, packaging, quantity, cost, customerId, orderId);
	
	newOrder.updateOrder(placedOrder);
	
}

public void deleteOrder(Context ctx) {
	
	//String teaType = ctx.formParam("teaType");
	
	//String packaging = ctx.formParam("packaging");
	
	//int quantity = Integer.parseInt(ctx.formParam("quantity"));
	
	//double cost = Double.parseDouble(ctx.formParam("cost"));
	
	int orderId = Integer.parseInt(ctx.formParam("orderId"));
	
	Orders placedOrder = new Orders(orderId);
	
	newOrder.deleteOrder(placedOrder);
	
}

}
