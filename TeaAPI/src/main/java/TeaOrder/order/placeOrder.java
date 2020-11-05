package TeaOrder.order;

import TeaOrder.pojos.Customer;
import TeaOrder.pojos.Orders;

public interface placeOrder {

	public Orders placeOrder(String type, String packaging, int quantity, double cost, double orderNum, int cust);
	
	public Orders placeOrder();
	
}
