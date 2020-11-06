package TeaOrder.customer.test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import TeaOrder.order.insertInventory;
import TeaOrder.order.insertInventoryImpl;
import TeaOrder.order.orderCacheImpl;
import TeaOrder.pojos.Inventory;

public class inventoryTest extends Inventory{

	
	public inventoryTest() {
	    super();
	}

	private insertInventoryImpl insert;
	
	//mock 
	private orderCacheImpl<Inventory> cache;
	
	//static private Set<Inventory> testCache;
 
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
		insertInventory test = new insertInventoryImpl();
		
		Inventory expected = new Inventory("G1111", 20, "Green tea bags");
		Inventory actual = test.updateItem("G1111", 20, "Green tea bags");
		
		assertTrue(expected.getProductID().equals(actual.getProductID()) &&
				   expected.getQuantity() == (actual.getQuantity()) &&
				   expected.getProductType().equals(actual.getProductType()));
		
	}
	
	
	//test
	
	public void inventoryTest() {
		
		Inventory testInventory = new Inventory();
		//  make sure we get the object we expect
		assertEquals("Should create inventory object", testInventory, insert.updateItem("G1111", 20, "Green tea bags"));
		// verify is mockito  make sure the method is called
		verify(cache).addToCache(testInventory);
	}
	
	

}
