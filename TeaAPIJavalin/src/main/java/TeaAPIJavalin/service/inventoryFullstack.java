package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.dao.inventoryDao;
import TeaAPIJavalin.pojos.Inventory;
import TeaAPIJavalin.dao.inventoryDaoPostgres;


public class inventoryFullstack implements insertInventory {

	inventoryDao inDao = new inventoryDaoPostgres();

	@Override
	public Inventory addItem(Inventory inventory) {
		inDao.addItem(inventory);
		return inventory;
	}

	@Override
	public List<Inventory> getAllItems() {
		return null;
	}

	@Override
	public Inventory updateItem(Inventory inventory) {
		inDao.updateItem(inventory);
		return null;
	}

	@Override
	public Inventory deleteItem(Inventory inventory) {
		inDao.deleteItem(inventory);
		return null;
	}

}
