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
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import TeaAPIJavalin.dao.inventoryDaoPostgres;
import TeaAPIJavalin.pojos.Inventory;
import TeaAPIJavalin.util.ConnectionUtil;

public class inventoryDaoPostgresTest {
	
	public inventoryDaoPostgres inventoryDao = new inventoryDaoPostgres();
	
	
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
		inventoryDao.setConnUtil(connUtil);
	}

	@After
	public void tearDown() throws Exception {

		stmt.executeUpdate("delete from inventory where productid = 1");
		
		realConnection.close();
	}

	@Test
	public void creatItemTest() throws SQLException{
		
		Inventory newItem = new Inventory(1, 200, "Green Tea");
		
		inventoryDao.addItem(newItem);
		
		String sql = "insert into guest (productid, quantity, product_type)"
				+ " values(1, 200, 'Green Tea')";
		
		verify(spy).executeUpdate(sql);
		
		ResultSet rs = stmt.executeQuery("select * from guest where productid = 1");
		
		assertTrue(rs.next());
		
		//fail("Not yet implemented");
	}

}
