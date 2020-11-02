package TeaOrder.order;

import TeaOrder.pojos.Customer;
import TeaOrder.pojos.Inventory;
import TeaOrder.pojos.Orders;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class insertInventoryImpl {

	
	private static Scanner scan = new Scanner(System.in);
	
	private orderCache<Inventory> customerCache = new orderCacheImpl<Inventory>();
	List<Inventory> inventory= new ArrayList<Inventory>();
	
	
	public void setCustomerCache(orderCache<Inventory> customerCache) {
		this.customerCache = customerCache;
	}

	public void customerOrderImpl(orderCache<Inventory> customerCache) {
		this.customerCache = customerCache;
	}
	
	
public Inventory createItem(String productID, int productQuantity, String productType) {
	
	System.out.println("Please insert prodcut Id:");
	String productId = scan.nextLine();
	System.out.println("Quantity:");
	int quantity = scan.nextInt();
	System.out.println("Please enter product type:");
	String type = scan.nextLine();
	
	
	Inventory item = new Inventory(productId, quantity, type);

	inventory.add(item);
	
	return item;
	
		
	}
}
