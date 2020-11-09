package TeaAPIJavalin.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import TeaAPIJavalin.dao.placeOrderDaoPostgres;
import TeaAPIJavalin.pojos.Orders;
import TeaAPIJavalin.util.ConnectionUtil;

public class placeOrderDaoPostgresTest {
	
	
	public placeOrderDaoPostgres orderDao = new placeOrderDaoPostgres();
	
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
		orderDao.setConnUtil(connUtil);
		
	}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void placeOrderTest() {
		
		
		Order newOrder = new Order("Green Tea", "Tea Bags", 25, 100.0 );
		
		orderDao.placeOrder(newOrder);
		
		String sql = "insert into orders (tea_type, packaging, quanity, cost)"
				+ " values('Green Tea', 'Tea Bags', 25, 100.0)";
		
		verify(spy).executeUpdate(sql);
		
		ResultSet rs = stmt.executeQuery("select * from orders where orderId = ");
		
		assertTrue(rs.next());
		
	}
		
		
		//fail("Not yet implemented");
	}

}
