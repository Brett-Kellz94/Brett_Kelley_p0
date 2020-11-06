package TeaAPIJavalin.pojos;

public class Orders {

	private String teaType;
	private String packaging;
	private int quantity;
	private double orderNumber;
	private double orderCost;
	private int customerId;
	
	public Orders(String teaType, String packaging, int quantity, double orderNumber, double orderCost, int customerId) {
		// TODO Auto-generated constructor stub
		super();
		this.teaType = teaType;
		this.packaging = packaging;
		this.quantity = quantity;
		this.orderNumber = orderNumber;
		this.orderCost = orderCost;
		this.customerId =customerId;	
	}
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}

	// create setters and getters
	public double getOrderNumber() {
		return orderNumber;
	}
	
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getPackaging() {
		return packaging;
	}
	
	public void setPackaging(String packaging) {
		this.packaging = packaging;
	}
	
	public String getTeaType() {
		return teaType;
	}
	
	public void setTeaType(String teaType) {
		this.teaType = teaType;
	} 
	
	public int getQuantity() {
		return quantity;
	}
	
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public double getOrderCost() {
	return orderCost;
}
public void setOrderCost(int orderCost) {
	this.orderCost = orderCost;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomer(int customerId) {
	this.customerId = customerId;
}
	
}
