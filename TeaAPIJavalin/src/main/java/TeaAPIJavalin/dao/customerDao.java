package TeaAPIJavalin.dao;

import TeaAPIJavalin.pojos.Customer;

public interface customerDao {

	public static void createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}
 	
    public Customer updateCustomer(int customertId, Customer customer);
	
	public void deleteCustomer(Customer customer);
}
