package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.pojos.Customer;

public interface customerOrder {
	


	public Customer createCustomer(Customer customer);
	
	public List<Customer> getAllCustomers();
	
	public Customer deleteCustomer(Customer customer);
	
	public Customer updateCustomer(Customer customer);

}


