package TeaAPIJavalin.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import TeaAPIJavalin.pojos.Inventory;
import TeaAPIJavalin.util.ConnectionUtil;

public class inventoryDaoPostgres implements inventoryDao{

    private Statement statement;
     
 	private ConnectionUtil connUtil = new ConnectionUtil();
	
 	public void setConnUtil(ConnectionUtil connUtil) {
 		this.connUtil = connUtil;
 	}

 	public void addItem(Inventory inventory) {
		String sql = "insert into inventory (quantity, product_type) "
				+ "values('"
				+ inventory.getQuantity()
				+ "', '"
				
				+ inventory.getProductType()
				+ ")";
		
		try (Connection conn = connUtil.createConnection()) {
			statement = conn.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

 		
 	}
//public static void deleteItem(Inventory inventory) {
//	String sql = "delete from inventory (quantity, product_type) "
//			+ "values('"
//			+ inventory.getQuantity()
//			+ "', '"
//			
//			+ inventory.getProductType()
//			+ ")";
//	
//			try (Connection conn = connUtil.createConnection()) {
//				statement = conn.createStatement();
//				statement.executeUpdate(sql);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//	}
	
}
