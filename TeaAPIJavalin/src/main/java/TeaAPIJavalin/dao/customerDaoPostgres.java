package TeaAPIJavalin.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;
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

		String sql = "insert into customers (first_name, last_name, phone_number, email) "
					+ "values('"
					+ customer.getCustomerName().split(" ")[0]
				    + "', '"
				    + customer.getCustomerName().split(" ")[1]
				    + "', '"
					+ customer.getPhoneNumber()
					+ "', '"
				    + customer.getEmailAddress()
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
	public Customer updateCustomer(Customer customer)  {
String sql = "update customers set first_name = ?, last_name = ?, phone_number = ? where email = ?";

		try (Connection conn = connUtil.createConnection()) {
			
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getCustomerName().split(" ")[0]);
     		pstmt.setString(2, customer.getCustomerName().split(" ")[1]);
			pstmt.setString(3, customer.getPhoneNumber());
			pstmt.setString(4, customer.getEmailAddress());

			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public void deleteCustomer(Customer customer) {
		 String sql = "delete from customers where email = ?";
			try (Connection conn = connUtil.createConnection()) {
					
		    PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getEmailAddress());
			pstmt.executeUpdate();
			
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			
		}

		
	}


