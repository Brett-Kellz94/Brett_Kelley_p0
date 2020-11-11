package TeaAPIJavalin.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;


import TeaAPIJavalin.pojos.Orders;
import TeaAPIJavalin.util.ConnectionUtil;

public class placeOrderDaoPostgres implements placeOrderDao{
	
private Statement statement;
	
	private ConnectionUtil connUtil = new ConnectionUtil();
	
	public void setConnUtil(ConnectionUtil connUtil) {
		this.connUtil = connUtil;
	}

	public void placeOrder(Orders order) {
		String sql = "insert into orders (tea_type, packaging, quantity, cost, customerid) "
				+ "values('"
				+ order.getTeaType()
				+ "', '"
				+ order.getPackaging()
				+ "', '"
				+ order.getQuantity()
				+ "', '"
				+ order.getOrderCost()
				+ "', '"
				//where we get cust id
				+ order.getCustomerId()
				+ "')";
		
		try (Connection conn = connUtil.createConnection()) {
			statement = conn.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	@Override
	public Orders updateOrder(Orders order) {
    String sql = "update orders set tea_type = ?, packaging = ?, quantity = ?, cost = ? where orderid = ?";
		
		try (Connection conn = connUtil.createConnection()) {
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, order.getTeaType());
			pstmt.setString(2, order.getPackaging());
			pstmt.setInt(3, order.getQuantity());
			pstmt.setDouble(4, order.getOrderCost());
			pstmt.setInt(5, order.getOrderId());
			
			pstmt.executeUpdate();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void deleteOrder(Orders order) {
		String sql = "delete from orders where orderid = ?";
		try (Connection conn = connUtil.createConnection()) {
				
	    PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, order.getOrderId());
		
		pstmt.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		
	}



}
