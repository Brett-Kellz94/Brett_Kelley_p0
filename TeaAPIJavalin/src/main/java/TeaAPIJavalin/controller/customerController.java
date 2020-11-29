package TeaAPIJavalin.controller;

import TeaAPIJavalin.pojos.Customer;
import TeaAPIJavalin.service.customerOrder;
import TeaAPIJavalin.service.customerOrderFullstack;
import io.javalin.http.Context;


public class customerController {

	//customerOrderFullStack
	customerOrder customer = new customerOrderFullstack();
	//build ctx
	public void createCustomer(Context ctx) {
		String name = ctx.formParam("name");
		
		String phoneNumber = ctx.formParam("phoneNumber");
		
		String emailAddress = ctx.formParam("emailAddress");
		
		Customer newCustomer = new Customer(name, phoneNumber, emailAddress);
		
		customer.createCustomer(newCustomer);
		
	}
	
	
	public void updateCustomer(Context ctx) {
		
	    String name = ctx.formParam("name");
		
		String phoneNumber = ctx.formParam("phoneNumber");
		
		String emailAddress = ctx.formParam("emailAddress");
		
		Customer newCustomer = new Customer(name, phoneNumber, emailAddress);
		
		customer.updateCustomer(newCustomer);
		
	}
	
	public void deleteCustomer(Context ctx) {
		
	    String name = ctx.formParam("name");
		
		String phoneNumber = ctx.formParam("phoneNumber");
		
		String emailAddress = ctx.formParam("emailAddress");
		
		Customer newCustomer = new Customer(name, phoneNumber, emailAddress);
		
		customer.deleteCustomer(newCustomer);
		
	}
	
}
