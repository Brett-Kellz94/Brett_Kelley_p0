package TeaOrder.main;
import java.util.Scanner;

import TeaOrder.order.customerOrder;
import TeaOrder.order.customerOrderImpl;
import TeaOrder.order.insertInventory;
import TeaOrder.order.insertInventoryImpl;

public class teaOrderDriver {
	
	private static Scanner scan = new Scanner(System.in)



		do {
			System.out.println("Please choose one of the following:");
			System.out.println("1. Place Order");
			System.out.println("2. Check Inventory");
			System.out.println("3. Update Inventory");
			System.out.println("0. Exit");
			
			String input = scan.nextLine();
			
			int i =3;
			float f = i;
			System.out.println(i- (int)f);
			
			switch (input) {
			
			case "1":
			    // run place order methods
				customerOrder newOrder = new customerOrderImpl();
				
				newOrder.createCustomer();
				
				newOrder.placeOrder();
				
				break;
				
			case "2":
				//run check inventory
				
				break;
			case "3":
				//run update inventory
				insertInventory addItem = new insertInventoryImpl();
				
				addItem.createItem();
				
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
