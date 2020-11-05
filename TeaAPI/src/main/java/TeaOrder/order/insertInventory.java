package TeaOrder.order;

import TeaOrder.pojos.Inventory;

public interface insertInventory {
	
	public Inventory updateItem(String productId, int quantity, String type);

	public Inventory updateItem();
}
