package TeaOrder.customer.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import TeaOrder.order.customerOrder;
import TeaOrder.order.customerOrderImpl;
import TeaOrder.order.orderCacheImpl;
import TeaOrder.pojos.Customer;

public class customerOrderTestTest extends Customer{
	
	/*public customerOrderTestTest(String name, String phone, String email) {
		super(name, phone, email);

	}
	*/
	
	public customerOrderTestTest() {
		super();
	}
	

	private customerOrderImpl custOrder;
	
	//mock 
	private orderCacheImpl<Customer> cache;
	
	//static private Set<Customer> testCache;
 
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
		customerOrder test = new customerOrderImpl();
		
		Customer expected = new Customer("Branden", "803-466-7984", "branden.addicott@hubby.com");
		Customer actual = test.createCustomer("Branden", "803-466-7984", "branden.addicott@hubby.com");
		
		assertTrue(expected.getCustomerName().equals(actual.getCustomerName()) &&
				   expected.getPhoneNumber().equals(actual.getPhoneNumber()) &&
				   expected.getEmailAddress().equals(actual.getEmailAddress()));
		
		//fail("Not yet implemented");
	}
	
	//test
	
	
	public void createCustomerTest() {
		
		Customer testCustomer = new Customer("David Bowie", "555-555-5555", "ziggy@startdust.com");
		//  make sure we get the object we expect
		assertEquals("Should create customer object", testCustomer, custOrder.createCustomer("David Bowie", "555-555-5555", "ziggy@startdust.com"));
		// verify is mockito  make sure the method is called
		verify(cache).addToCache(testCustomer);
	}
	
	

}
