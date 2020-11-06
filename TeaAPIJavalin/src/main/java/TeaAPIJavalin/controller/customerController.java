package TeaAPIJavalin.controller;

import TeaAPIJavalin.pojos.Customer;
import TeaAPIJavalin.service.customerOrder;
import TeaAPIJavalin.service.customerOrderImpl;
import io.javalin.http.Context;


public class customerController {

	customerOrder customer = new customerOrderImpl();
	
	public void createGuest() {}
	
}
