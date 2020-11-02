package TeaOrder.customer.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import TeaOrder.order.insertInventoryImpl;
import TeaOrder.order.orderCacheImpl;
import TeaOrder.pojos.Inventory;

public class inventoryTest extends Inventory{
	
	public inventoryTest(String pID, int pQuantity, String pType) {
		super(pID, pQuantity, pType);
		// TODO Auto-generated constructor stub
	}

	private insertInventoryImpl addInventory;
	
	//mock 
	private orderCacheImpl<Inventory> cache;
	
	static private Set<Inventory> testCache;
 
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
		insertInventoryImpl test = new insertInventoryImpl();
		
		Inventory expected = new Inventory("G1111", 20, "Green tea bags");
		Inventory actual = test.createItem("G1111", 20, "Green tea bags");
		
		assertTrue(expected.getProductID().equals(getProductID())
				&& expected.pQuantity.equals(actualpQuantity())
				&& expected.pType.equals(actualpType));
		
		fail("Not yet implemented");
	}
	
	//test
	public void inventoryTest() {
		
		Inventory testInventory = new Inventory();
		//  make sure we get the object we expect
		assertEquals("Should create customer object", testCustomer, guestService.createCustomer("David Bowie", "555-555-5555", "ziggy@startdust.com"));
		// verify is mockito  make sure the method is called
		verify(orderCache).addToCache(testCustomer);
	}

}
