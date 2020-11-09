package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.pojos.Orders;


public interface placeOrder {

	public Orders placeOrder(Orders order);
	
	public List<Orders> getAllOrders();
	
}
