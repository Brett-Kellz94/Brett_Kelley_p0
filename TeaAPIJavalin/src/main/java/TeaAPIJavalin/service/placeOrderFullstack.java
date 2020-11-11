package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.dao.placeOrderDao;
import TeaAPIJavalin.dao.placeOrderDaoPostgres;
import TeaAPIJavalin.pojos.Orders;

public class placeOrderFullstack implements placeOrder {

	placeOrderDao orderDao = new placeOrderDaoPostgres();

	@Override
	public Orders placeNewOrder(Orders order) {
		orderDao.placeOrder(order);
		return order;
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders updateOrder(Orders order) {
		orderDao.updateOrder(order);
		return null;
	}

	@Override
	public Orders deleteOrder(Orders order) {
		orderDao.deleteOrder(order);
		return null;
	}
	
	

}
