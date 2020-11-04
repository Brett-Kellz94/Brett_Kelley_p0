package TeaOrder.main;
import java.util.Scanner;

import TeaOrder.order.customerOrder;
import TeaOrder.order.customerOrderImpl;
import TeaOrder.order.insertInventory;
import TeaOrder.order.insertInventoryImpl;
import TeaOrder.pojos.Customer;



public class teaOrderDriver {
	
	public static Scanner scan = new Scanner(System.in);
	
public static void main(String[] args) {
	
      System.out.print("Please enter username:");

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
				
				 System.out.println("Please insert customer information");
					System.out.println("Customer Name:");
					String customerName = scan.nextLine();
					System.out.println("Phone number:");
					String phone = scan.nextLine();
					System.out.print("Email Address:");
					String emailAddress = scan.nextLine();
					
				
				Customer newCustomer = newOrder.createCustomer(customerName, phone, emailAddress);
				
				
				System.out.println("Please choose Tea Type (Green Tea or Black Tea)");
				String type = scan.nextLine();
				System.out.println("Please choose packaging (Bags or Loose");
				String packaging = scan.nextLine();
				System.out.println("Please enter quantity");
				int quantity = scan.nextInt();
				
				//calculate price of the tea options
			    int cost = 0;
				if (type == "Green") {
					cost = 4;
				}
				else {
					cost = 5;
				}
				
				cost = 0;
				if (packaging == "Bags" ) {
					cost = 2;
				}
				else {
					cost = 3;
				}
				
				double productCost = cost + cost;
				
				// calculate total cost of the order
				
				double orderCost = productCost * quantity;
				
				System.out.println ("your total cost for this order will be: " + orderCost);
				
				
				//now generate order number
				
				double orderNumber = 100001;
				
				newOrder.placeOrder(type, packaging, quantity, cost, orderNumber, newCustomer );
				
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



