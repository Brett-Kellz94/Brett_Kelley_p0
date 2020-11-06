package TeaAPIJavalin;

import TeaAPIJavalin.controller.customerController;
import io.javalin.Javalin;


public class ServerDriver {

	
	private static customerController customerController = new customerController();
	
	public static void main(String[] args) {
		Javalin app = Javalin.create().start(9090); //sets up and starts our server
		app.get("/hello", ctx -> ctx.html("Hello World"));
		app.post("/createCustomer", ctx -> customerController.createGuest(ctx));
	}

}
