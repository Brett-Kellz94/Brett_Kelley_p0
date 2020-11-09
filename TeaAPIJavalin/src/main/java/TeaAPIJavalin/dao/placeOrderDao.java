package TeaAPIJavalin.dao;

import TeaAPIJavalin.pojos.Orders;

public interface placeOrderDao {
	
	public static void placeOrder(Orders order) {
		
	}
	
    public Orders updateOrder(int customertId, Orders order);
	
	public void deleteOrder(Orders order);
}



