package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.pojos.Inventory;

public interface insertInventory {
	
	public Inventory addItem(Inventory inventory);
	public Inventory deleteItem(Inventory inventory);
	
	
	public List<Inventory> getAllItems();

}
