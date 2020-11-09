package TeaAPIJavalin.controller;

import TeaAPIJavalin.pojos.Customer;
import TeaAPIJavalin.service.customerOrder;
import TeaAPIJavalin.service.customerOrderImpl;
import io.javalin.http.Context;


public class customerController {

	//customerOrderFullStack
	customerOrder newCustomer = new customerOrderImpl();
	//build ctx
	public void createGuest(Context ctx) {
		
		String name = ctx.formParam("name");
		
		String phoneNumber = ctx.formParam("phoneNumber");
		
		String emailAddress = ctx.formParam("emailAddress");
		
		Customer customer = new Customer(name, phoneNumber, emailAddress);
		
		newCustomer.createCustomer(customer);
		
		//add customer id to customer and order pojo
		ctx.html(Integer.toString(customer.getCustomerId()));
	}
	
	//public void getCustomer(Context ctx) {
		
	//}
	
	public void getAllCustomers() {
		
	}
	
}
