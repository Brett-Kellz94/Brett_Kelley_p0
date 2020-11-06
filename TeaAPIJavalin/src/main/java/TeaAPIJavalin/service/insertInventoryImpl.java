package TeaAPIJavalin.service;

import TeaAPIJavalin.pojos.Inventory;

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
	
	
public Inventory addItem(Inventory item) {
	

	inventoryCache.addToCache(item);
	
	System.out.println("Item added to inventory");
	
	return item;
	
		
	}


@Override
public Inventory deleteItem(Inventory inventory) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public List<Inventory> getAllItems() {

	return inventoryCache.retrieveAllItems();
}

}
