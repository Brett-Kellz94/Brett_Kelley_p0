package TeaAPIJavalin.dao;

import TeaAPIJavalin.pojos.Customer;

public interface customerDao {

	public void createCustomer(Customer customer);
 	
    public Customer updateCustomer( Customer customer);
	
	public void deleteCustomer(Customer customer);
}
