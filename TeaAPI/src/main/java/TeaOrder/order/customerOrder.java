package TeaOrder.order;

import TeaOrder.pojos.Customer;

public interface customerOrder {
	
	public Customer createCustomer(String name, int phoneNumber, int payment);
    
	public void placeOrder();
	

	
	
	
}
