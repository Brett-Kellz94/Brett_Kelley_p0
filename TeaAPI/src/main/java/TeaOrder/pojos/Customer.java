package TeaOrder.pojos;

public class Customer {

	private String PhoneNumber;
	private String customerName;
	private String phoneNumber;
	private String emailAddress;
    // email, address customer number etc 
	 
	
	
	public Customer(String name, String phone, String email) {
		super();
		this.customerName = name;
		this.phoneNumber = phone;
		this.emailAddress = email;
	}


	// create setters and getters
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	

	
	
}
