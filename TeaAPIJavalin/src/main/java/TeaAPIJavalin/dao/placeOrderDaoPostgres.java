package TeaAPIJavalin.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import TeaAPIJavalin.pojos.Orders;
import TeaAPIJavalin.util.ConnectionUtil;

public class placeOrderDaoPostgres implements placeOrderDao{
	
private Statement statement;
	
	private ConnectionUtil connUtil = new ConnectionUtil();
	
	public void setConnUtil(ConnectionUtil connUtil) {
		this.connUtil = connUtil;
	}

	public placeOrderDaoPostgres(Orders order) {
		String sql = "insert into orders (tea_type, packaging, quanitity, cost, customer_id) "
				+ "values('"
				+ order.getTeaType()
				+ "', '"
				+ order.getPackaging()
				+ "', '"
				+ order.getQuantity()
				+ "', "
				+ order.getOrderCost()
				+ "', "
				+ order.getCustomerId()
				+ ")";
		
		try (Connection conn = connUtil.createConnection()) {
			statement = conn.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public placeOrderDaoPostgres() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Orders updateOrder(int customertId, Orders order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteOrder(Orders order) {
		// TODO Auto-generated method stub
		
	}

}
