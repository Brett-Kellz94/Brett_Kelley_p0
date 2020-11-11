package TeaAPIJavalin.dao;

import TeaAPIJavalin.pojos.Inventory;

public interface inventoryDao {

	public void addItem(Inventory inventory);
	
	public Inventory updateItem(Inventory inventory);
	
	public void deleteItem(Inventory inventory);
	
	
}
