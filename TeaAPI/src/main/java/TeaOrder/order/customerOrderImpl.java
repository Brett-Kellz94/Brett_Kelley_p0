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
	
	
	
	public void setCustomerCache(orderCache<Customer> customerCache) {
		this.customerCache = customerCache;
	}

	
	public customerOrderImpl(orderCache<Customer> customerCache) {
		super();
		this.customerCache = customerCache;
	}
	
	public customerOrderImpl() {
		// TODO Auto-generated constructor stub
	}

	//create a customer object
	public  Customer createCustomer() {

		
		 System.out.println("Please insert customer information");
			System.out.println("Customer Name:");
			String customerName = scan.nextLine();
			System.out.println("Phone number:");
			String phone = scan.nextLine();
			System.out.print("Email Address:");
			String emailAddress = scan.nextLine();
		
		
		
		Customer customer = new Customer(customerName, phone, emailAddress);
		
		customers.add(customer);
		
		customerCache.addToCache(customer);
		
		System.out.println("Added new customer");
		
		return customer;
		

		
	}
	


	@Override
	public Customer createCustomer(String name, String phoneNumber, String email) {
    
		Customer customer = new Customer(name, phoneNumber, email);
		
		//customers.add(customer);
		customerCache.addToCache(customer);
		
		return customer;
	}

	
	}

