package TeaOrder.order;

import TeaOrder.pojos.Inventory;

public interface insertInventory {
	
	public Inventory createItem(String productID, int productQuantity, String productType);

}
