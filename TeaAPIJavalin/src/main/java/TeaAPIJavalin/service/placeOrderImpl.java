package TeaAPIJavalin.service;


import TeaAPIJavalin.pojos.Orders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class placeOrderImpl implements placeOrder{
	private static Scanner scan = new Scanner(System.in);
	
	
	
	private orderCache<Orders> placedOrderCache = new orderCacheImpl<Orders>();
	List<Orders> orders = new ArrayList<Orders>();
	
	
	
	public void setOrderCache(orderCache<Orders> placedOrderCache) {
		this.placedOrderCache = placedOrderCache;
	}
	
	
	
	public placeOrderImpl(orderCache<Orders> placedOrderCache) {
		this.placedOrderCache = placedOrderCache; }
	
	

public placeOrderImpl() {
		// TODO Auto-generated constructor stub
	}



public Orders placeNewOrder(Orders order) {

	    System.out.println("Creating " + order + " object");
		//add order to order list
		orders.add(order); 
		placedOrderCache.addToCache(order);
		
		
		
		return order;
		
	}

@Override
public List<Orders> getAllOrders() {

	return placedOrderCache.retrieveAllItems();
}



@Override
public Orders updateOrder(Orders order) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public Orders deleteOrder(Orders order) {
	// TODO Auto-generated method stub
	return null;
}


}



