package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.pojos.Orders;


public interface placeOrder {

	public Orders placeNewOrder(Orders order);
	
	public List<Orders> getAllOrders();
	
	public Orders updateOrder(Orders order);
	
	public Orders deleteOrder(Orders order);
	
}
