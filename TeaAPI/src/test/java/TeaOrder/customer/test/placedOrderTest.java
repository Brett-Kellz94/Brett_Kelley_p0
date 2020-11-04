package TeaOrder.customer.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.verify;

import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import TeaOrder.order.customerOrderImpl;
import TeaOrder.order.orderCacheImpl;
import TeaOrder.pojos.Customer;
import TeaOrder.pojos.Orders;

public class placedOrderTest extends Orders {

	public placedOrderTest(String teaType, String packaging, int quantity, double orderId, double price, Customer customer) {
		super(teaType, packaging, quantity, orderId, price, customer);
		
	}
	
	public placedOrderTest() {
		super();
	}
	
	private customerOrderImpl custOrder;
	
	//mock 
	private orderCacheImpl<Orders> cache;
	
	static private Set<Orders> testCache;
 
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		customerOrderImpl test = new customerOrderImpl();
		
		Customer newCustomer = new Customer("2314527152", "Patrick", "patio54@live.com");
		
		Orders expected = new Orders("Green", "teabags", 2, 1111.0, 10.00, newCustomer );
		Orders actual = test.placeOrder("Green", "teabags", 2, 1111.0, 10.00, newCustomer);
		
		assertTrue(expected.equals(actual));
		
		fail("Not yet implemented");
	}
	
	/*
	 * public void placeOrderTest() {
	 
		
		Orders testOrder = new Orders();
		//  make sure we get the object we expect
		assertEquals("Should create order object", testOrder, custOrder.placeOrder("Green", "teabags", 2, 1111.0, 10.00));
		// verify is mockito  make sure the method is called
		verify(cache).addToCache(testOrder);
	}
	*/
	
}
