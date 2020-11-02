package TeaOrder.pojos;

public class Inventory {

	private int productID;
	private static int quantity;
	private String productType;
	
	
	public Inventory(String pID, int pQuantity, String pType) {
		// TODO Auto-generated constructor stub
	}
	
	public int getProductID() {
		return productID;
	}

    public void setProductID(int productID) {
	this.productID = productID;
    }

    public static int getQuantity() {
	return quantity;
    }

    public void setQuantity(int quantity) {
	Inventory.quantity = quantity;
    }

    public String getProductType() {
	return productType;
    }

    public void setProductType(String productType) {
	this.productType = productType;
    }
	
	
	


}
