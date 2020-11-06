package TeaOrder.main;
import java.util.Scanner;
import java.util.logging.Logger;
import TeaOrder.order.customerOrder;
import TeaOrder.order.customerOrderImpl;
import TeaOrder.order.insertInventory;
import TeaOrder.order.insertInventoryImpl;
import TeaOrder.order.placeOrder;
import TeaOrder.order.placeOrderImpl;



public class teaOrderDriver {
	
	private static Logger log = Logger.getAnonymousLogger();

	
	public static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args) {
	
	log.info("Program has started");
	
      System.out.print("Please enter username:");
      String userName = scan.nextLine();
      
      //create a list of users and check if the username is in the cache
      //usercache.contains(username, password)
      
      if(userName != null) {
      
      System.out.print("Please enter password:");
      String passWord = scan.nextLine();
      }
      
      log.info("New system login");
      
      String input = "";

		do {
			System.out.println("Please choose one of the following:");
			System.out.println("1. Place Order");
			System.out.println("2. Check Inventory (to do)");
			System.out.println("3. Update Inventory");
			System.out.println("0. Exit");
			
			input = scan.nextLine();
		
			
			switch (input) {
			
			case "1":
				
			    // run place order methods
				
				
			   customerOrder newCustomer = new customerOrderImpl();
				
			   newCustomer.createCustomer();
				
			   log.info("New customer Created");
			   
				//now run place order method with our customer
			    placeOrder newOrder = new placeOrderImpl();
				newOrder.placeOrder();
				
				System.out.println("Customer order has been placed!");
				System.out.print("");
				break;
				
			case "2":
				//run check inventory
				
				break;
			case "3":
				//run update inventory
				insertInventory newItem = new insertInventoryImpl();
				
				// add new item into inventory object
				newItem.updateItem();
			
				log.info("Item added to inventory!");
				break;
				
			case "0":
				break;
				
				default:
				System.out.println("Please enter a valid choice (1, 2, or 3");
				break;
			
			}
			
		} while (input != null);
			
		}
}



