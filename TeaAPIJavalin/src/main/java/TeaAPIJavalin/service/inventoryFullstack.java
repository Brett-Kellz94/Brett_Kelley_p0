package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.dao.inventoryDao;
import TeaAPIJavalin.pojos.Inventory;
import TeaAPIJavalin.dao.inventoryDaoPostgres;


public class inventoryFullstack implements insertInventory {

	inventoryDao inDao = new inventoryDaoPostgres();

	@Override
	public Inventory addItem(Inventory inventory) {
		inventoryDao.addItem(inventory);
		return null;
	}

	@Override
	public Inventory deleteItem(Inventory inventory) {
		inventoryDao.deleteItem(inventory);
		return null;
	}

	@Override
	public List<Inventory> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
