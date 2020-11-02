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
	
	
	public Customer createCustomer(String name, String phoneNumber, String email ) {
		// prompt for customer information
		System.out.println("Please insert customer information");
		System.out.println("Customer Name:");
		String customerName = scan.nextLine();
		System.out.println("Phone number:");
		String phone = scan.nextLine();
		System.out.print("Email Address:");
		String emailAddress = scan.nextLine();
		
		
		Customer customer = new Customer(customerName, phone, emailAddress);

		customers.add(customer);
		
		return customer;
		
	}
	
	public Orders placeOrder(String teaType, String packaging, int quantity, double orderNumber, double orderCost) {
		
		
		
		System.out.println("Please choose Tea Type (Green Tea or Black Tea)");
		String type = scan.nextLine();
		System.out.println("Please choose packaging (Bags or Loose");
		String packaging1 = scan.nextLine();
		System.out.println("Please enter quantity");
		int quantity1 = scan.nextInt();
		
		
		//calculate price of the tea options
		double tcost = 0;
		if (teaType == "Green") {
			tcost = 4.00;
		}
		else {
			tcost = 5.00;
		}
		
		double pcost = 0;
		if (packaging1 == "Bags" ) {
			pcost = 2.00;
		}
		else {
			pcost = 3.00;
		}
		
		double productCost = tcost + pcost;
		
		// calculate total cost of the order
		
		double orderCost1 = productCost * quantity1;
		
		System.out.println ("your total cost for this order will be: " + orderCost1);
		
		
		//now generate order number
		
		double orderNumber1 = Math.random();
		
		//now add oder details into Order object
		
		Orders order = new Orders(teaType, packaging1, quantity1, orderNumber1, orderCost1);
		
		//add order to order list
		orders.add(order);
		
		System.out.println("Thank you for placing an order!");
		System.out.println(order);
		
		return order;
		
	}


	
	}

