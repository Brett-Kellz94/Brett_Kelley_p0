package TeaOrder.order;

import TeaOrder.pojos.Customer;
import TeaOrder.pojos.Orders;

public interface customerOrder {
	
    
	public Orders placeOrder(String type, String packaging, int quantity, double cost, double orderNum, Customer cust);

	public Customer createCustomer(String string, String string2, String string3);
	
    
	
	
	
}
