package TeaOrder.pojos;

public class Orders {

	private String teaType;
	private String packaging;
	private int quantity;
	private double orderNumber;
	private double orderCost;
	
	public Orders() {
		// TODO Auto-generated constructor stub
	}
	
	public Orders(String teaType2, String packaging2, int quantity2, double orderNumber2, double orderCost2) {
		
		// TODO Auto-generated constructor stub
	}

	// create setters and getters
	public double getOrderNumber() {
		return orderNumber;
	}
	
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	
	public String getPackaging(String packaging) {
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
	
}
