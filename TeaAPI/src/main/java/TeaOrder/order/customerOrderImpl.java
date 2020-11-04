package TeaOrder.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TeaOrder.pojos.Customer;
import TeaOrder.pojos.Inventory;
import TeaOrder.pojos.Orders;

public class customerOrderImpl implements customerOrder {
	private static Scanner scan = new Scanner(System.in);
	
	
	
	private orderCache<Customer> customerCache = new orderCacheImpl<Customer>();
	List<Customer> customers = new ArrayList<Customer>();
	List<Orders> orders = new ArrayList<Orders>();
	
	
	public void setCustomerCache(orderCache<Customer> customerCache) {
		this.customerCache = customerCache;
	}

	
	
	public customerOrderImpl(orderCache<Customer> customerCache) {
		super();
		this.customerCache = customerCache;
	}
	
	
	//create a customer object
	public  Customer createCustomer(String name, String phoneNumber, String email) {

		Customer customer = new Customer(name, phoneNumber, email);

		customers.add(customer);
		
		return customer;
		
	}
	
	
	// create an order object
	public Orders placeOrder(String type, String packaging, int quantity,  double cost, double orderNum, Customer cust) {
		
		Orders order = new Orders(type, packaging, quantity, cost, orderNum, null);
		
		//add order to order list
		orders.add(order); 
		
		System.out.println("Thank you for placing an order!");
		System.out.println(order);
		
		return order;
		
	}

	
	}

