package TeaOrder.order;

import TeaOrder.pojos.Customer;
import TeaOrder.pojos.Orders;

public interface customerOrder {
	
	public Customer createCustomer(String name, String phoneNumber, String email);
    
	public Orders placeOrder(String teaType, String packaging, int quantity, double orderNumber, double orderCost);
	
    
	
	
	
}
