package TeaAPIJavalin.pojos;

public class Inventory {

	private int productID;
	private int quantity;
	private String productType;
	
	
	public Inventory(int productID, int quantity, String productType){
		super();
		this.productID = productID;
		this.quantity = quantity;
		this.productType = productType;
		
	}
	
	public Inventory() {
		// TODO Auto-generated constructor stub
	}

	public int getProductID() {
		return productID;
	}

    public void setProductID(int productID) {
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
