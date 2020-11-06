package TeaAPIJavalin.pojos;

public class Customer {

	private String PhoneNumber;
	private String customerName;
	private String emailAddress;
    // email, address customer number etc 
	 
	
	
	public Customer(String customerName, String PhoneNumber, String emailAddress)  {
		super();
		this.customerName = customerName;
		this.PhoneNumber = PhoneNumber;
		this.emailAddress = emailAddress;
	}


	public Customer() {
		// TODO Auto-generated constructor stub
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
