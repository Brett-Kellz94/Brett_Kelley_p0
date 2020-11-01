package TeaOrder.customer.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import TeaOrder.order.customerOrderImpl;
import TeaOrder.order.orderCache;
import TeaOrder.pojos.Customer;


public class customerOrderTest {
	
	private customerOrderImpl customerOrder;
	
	private orderCache<Customer> customerCache;
	
	List<Customer> customerList;
	
	

}
