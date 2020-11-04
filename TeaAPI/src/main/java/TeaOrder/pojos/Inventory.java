package TeaOrder.pojos;

public class Inventory {

	private String productID;
	private int quantity;
	private String productType;
	
	
	public Inventory(String productID, int quantity, String productType){
		super();
		this.productID = productID;
		this.quantity = quantity;
		this.productType = productType;
		
	}
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public String getProductID() {
		return productID;
	}

    public void setProductID(String productID) {
	this.productID = productID;
    }

    public int getQuantity() {
	return quantity;
    }

    public void setQuantity(int quantity) {
	this.quantity = quantity;
    }

    public String getProductType() {
	return productType;
    }

    public void setProductType(String productType) {
	this.productType = productType;
    }
	
	
	


}
