package TeaAPIJavalin.service;

import java.util.List;

import TeaAPIJavalin.dao.placeOrderDao;
import TeaAPIJavalin.pojos.Orders;

public class placeOrderFullstack implements placeOrder {

	public placeOrderFullstack() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Orders placeOrder(Orders order) {
		placeOrderDao.placeOrder(order);
		return order;
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return null;
	}

}
