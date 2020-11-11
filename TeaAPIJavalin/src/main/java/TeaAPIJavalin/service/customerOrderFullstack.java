package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.dao.customerDao;
import TeaAPIJavalin.pojos.Customer;
import TeaAPIJavalin.dao.customerDaoPostgres;


public class customerOrderFullstack implements customerOrder {

	customerDao custDao = new customerDaoPostgres();

	@Override
	public Customer createCustomer(Customer customer) {
		custDao.createCustomer(customer);
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(Customer customer) {
		custDao.deleteCustomer(customer);
		return null;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		custDao.updateCustomer(customer);
		return null;
	}

}
