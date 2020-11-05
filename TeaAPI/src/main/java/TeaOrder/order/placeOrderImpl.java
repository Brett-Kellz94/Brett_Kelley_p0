package TeaOrder.order;

import TeaOrder.pojos.Customer;
import TeaOrder.pojos.Orders;

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
	
	
	public placeOrderImpl() {}
	

public Orders placeOrder() {
		
		
		System.out.println("Please choose Tea Type (Green Tea or Black Tea)");
		String type = scan.nextLine();
		System.out.println("Please choose packaging (Bags or Loose)");
		String packaging = scan.nextLine();
		System.out.println("Please enter quantity");
		int quantity = scan.nextInt();
		
		//calculate price of the tea options
	    int cost = 0;
		if (type == "Green") {
			cost = 4;
		}
		else {
			cost = 5;
		}
		
		cost = 0;
		if (packaging == "Bags" ) {
			cost = 2;
		}
		else {
			cost = 3;
		}
		
		double productCost = cost + cost;
		
		// calculate total cost of the order
		
		double orderCost = productCost * quantity;
		
		System.out.println ("your total cost for this order will be: " + orderCost);
		
		
		//now generate order number
		
		double orderNumber = 100001;
		
		//increment order # for next order
		orderNumber++;
		
		int customerId = 10001;
		
		customerId++;
		
		Orders order = new Orders(type, packaging, quantity, cost, orderNumber, customerId);
		
		//add order to order list
		orders.add(order); 
		placedOrderCache.addToCache(order);
		
		
		
		return order;
		
	}

public Orders placeOrder(String type, String packaging, int quantity, double cost, double orderNum, int customerId) {

	Orders order = new Orders(type, packaging, quantity, cost, orderNum, customerId);
	
	//add order to order list
	orders.add(order); 
	placedOrderCache.addToCache(order);
			
	return order;

}


}
