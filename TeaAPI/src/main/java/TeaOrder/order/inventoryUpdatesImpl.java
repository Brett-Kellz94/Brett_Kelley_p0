package TeaOrder.order;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TeaOrder.pojos.Inventory;

public class inventoryUpdatesImpl implements inventoryUpdates{
private static Scanner scan = new Scanner(System.in);
List<Inventory> inventory = new ArrayList<Inventory>();
public static Inventory myInventory = new Inventory(null, null, null);

	@Override
	public Inventory checkInventory() {
		// TODO Auto-generated method stub
		// get?
		return inventory;
		
	}

	@Override
	public Inventory addProduct() {
		// prompt for product information
		System.out.println("Please insert product ID:");
		String productId = scan.nextLine();
		System.out.println("Please enter quantity:");
		String quantity = scan.nextLine();
		System.out.print("Please enter product type:");
		String productType = scan.nextLine();
		
		
		Inventory item = new Inventory(productId, quantity, productType);

		inventory.add(item);
		
		return item;
	}

	@Override
	public void deleteProduct() {
		// will continue to build functionality this method with SQL commands.
		System.out.println("you have deleted this item(s)");
		
	}

}
