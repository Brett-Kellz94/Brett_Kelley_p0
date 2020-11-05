package TeaOrder.order;

import TeaOrder.pojos.Inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class insertInventoryImpl implements insertInventory {

	private static Scanner scan = new Scanner(System.in);
	
	
	
	private orderCache<Inventory> inventoryCache = new orderCacheImpl<Inventory>();
	List<Inventory> inventory= new ArrayList<Inventory>();
	
	
	
	public void setCustomerCache(orderCache<Inventory> inventoryCache) {
		this.inventoryCache = inventoryCache;
	}

	public void customerOrderImpl(orderCache<Inventory> inventoryCache) {
		this.inventoryCache = inventoryCache;
	}
	
	
public Inventory updateItem() {
	
	System.out.println("Please insert product Id:");
	String productId = scan.nextLine();
	System.out.println("Quantity:");
	int pQuantity = scan.nextInt();
	System.out.println("Please enter product type: ");
	String pType = scan.next();
	System.out.println(pType);

	Inventory item = new Inventory(productId, pQuantity, pType);

	inventory.add(item);
	inventoryCache.addToCache(item);
	
	System.out.println("Item added to inventory");
	
	return item;
	
		
	}

@Override
public Inventory updateItem(String productId, int quantity, String type) {
	
	Inventory item = new Inventory(productId, quantity, type);
	inventory.add(item);
	inventoryCache.addToCache(item);
	
	return item;
}


}
