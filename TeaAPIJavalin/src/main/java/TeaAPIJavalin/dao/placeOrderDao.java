package TeaAPIJavalin.dao;

import TeaAPIJavalin.pojos.Orders;

public interface placeOrderDao {
	
	public void placeOrder(Orders order);
	
    public Orders updateOrder(Orders order);
	
	public void deleteOrder(Orders order);
}



