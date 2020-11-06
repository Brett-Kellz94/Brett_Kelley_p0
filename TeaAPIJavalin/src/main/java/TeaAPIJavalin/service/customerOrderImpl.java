package TeaAPIJavalin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TeaAPIJavalin.pojos.Customer;
import TeaAPIJavalin.pojos.Inventory;
import TeaAPIJavalin.pojos.Orders;

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

	@Override
	public Customer createCustomer(Customer customer) {
		
		System.out.println("Creating " + customer + " object");
		//customers.add(customer);
		customerCache.addToCache(customer);
		
		return customer;
	}


	@Override
	public List<Customer> getAllCustomers() {

		return customerCache.retrieveAllItems();
	}

	
	}

