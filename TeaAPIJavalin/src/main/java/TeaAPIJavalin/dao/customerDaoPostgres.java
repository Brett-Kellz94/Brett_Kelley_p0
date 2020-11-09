package TeaAPIJavalin.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import TeaAPIJavalin.pojos.Customer;
import TeaAPIJavalin.util.ConnectionUtil;

public class customerDaoPostgres implements customerDao {
	
private Statement statement;
	
	private ConnectionUtil connUtil = new ConnectionUtil();
	
	public void setConnUtil(ConnectionUtil connUtil) {
		this.connUtil = connUtil;
	}


	public void createCustomer(Customer customer) {
		String sql = "insert into customers (first_name, last_name, phone_number, email_address) "
				+ "values('"
				+ customer.getCustomerName().split(" ")[0]
				+ "', '"
				+ customer.getCustomerName().split(" ")[1]
				+ "', '"
				+ customer.getPhoneNumber()
				+ "', "
				+ customer.getEmailAddress()
				+ ")";
		
		try (Connection conn = connUtil.createConnection()) {
			statement = conn.createStatement();
			statement.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}


	@Override
	public Customer updateCustomer(int customertId, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void deleteCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

}
