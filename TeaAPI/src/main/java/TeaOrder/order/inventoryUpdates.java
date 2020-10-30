package TeaOrder.order;

import TeaOrder.pojos.Inventory;

public interface inventoryUpdates {

	
	public Inventory checkInventory();
	
	public Inventory addProduct();
	
	public void deleteProduct();
}
