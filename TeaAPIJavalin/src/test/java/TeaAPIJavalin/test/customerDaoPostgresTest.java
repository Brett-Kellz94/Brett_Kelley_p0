package TeaAPIJavalin.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import TeaAPIJavalin.util.ConnectionUtil;
import TeaAPIJavalin.dao.customerDaoPostgres;
import TeaAPIJavalin.pojos.Customer;

public class customerDaoPostgresTest {
	
	public customerDaoPostgres custdao = new customerDaoPostgres();
	
	@Mock
	private ConnectionUtil connUtil;
	
	@Mock
	private Connection connection;
	
	private Statement stmt;
	
	private Statement spy;
	
	private Connection realConnection;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		
	}

	@Before
	public void setUp() throws Exception {
	realConnection = new ConnectionUtil().createConnection();
		
		//creating a real stmt from a connection
		stmt = realConnection.createStatement(); 
		
		//spying on that real stmt
		spy = Mockito.spy(stmt);
		
		//mock our connection and util, so we will only use the stmt we are spying on
		when(connection.createStatement()).thenReturn(spy);
		when(connUtil.createConnection()).thenReturn(connection);
		
		//set up Dao to use the mocked object
		custdao.setConnUtil(connUtil);
		
	}
	

	@After
	public void tearDown() throws Exception {
	
    stmt.executeUpdate("delete from customer where first_name = 'Buster' AND last_name = 'Keaton'");
		

		realConnection.close();
	}

	@Test
	public void createCustomerTest() throws SQLException {
    
		Customer customer = new Customer("Buster Keaton", "2314527512", "b.keaton@gmail.com");
		
		custdao.createCustomer(customer);
		
		String sql = "insert into customer (first_name, last_name, phone_number, email)"
				+ " values('Buster', 'Keaton', '2314527512', 'b.keaton@gmail.com')";
		
		verify(spy).executeUpdate(sql);
		
		ResultSet rs = stmt.executeQuery("select * from guest where guest_first_name = 'Turkey' AND guest_last_name = 'McTurkey'");
		
		assertTrue(rs.next());
	}
	
//	public void updateCustomerTest() throws SQLException{
//		Customer customer = new Customer('Buster Keaton', '2314527512', 'b.keaton@gmail.com'); 
//		
//	}
//		
		//fail("Not yet implemented");
	}


