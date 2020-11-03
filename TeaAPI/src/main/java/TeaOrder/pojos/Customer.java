package TeaOrder.pojos;

public class Customer {

	private String PhoneNumber;
	private String customerName;
	private String emailAddress;
    // email, address customer number etc 
	 
	
	
	public Customer(String PhoneNumber, String customerName, String emailAddress)  {
		super();
		this.customerName = customerName;
		this.PhoneNumber = PhoneNumber;
		this.emailAddress = emailAddress;
	}


	// create setters and getters
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.PhoneNumber = phoneNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	

	
	
}
