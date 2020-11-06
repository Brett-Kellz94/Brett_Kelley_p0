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
	
	

public Orders placeOrder(Orders order) {

	    System.out.println("Creating " + order + " object");
		//add order to order list
		orders.add(order); 
		placedOrderCache.addToCache(order);
		
		
		
		return order;
		
	}

@Override
public List<Orders> getAllOrder() {

	return placedOrderCache.retrieveAllItems();
}


}



