package shippingSubsystem;

public class Customer {
	// Attributes of Customer class
	private int customerID;
	private String name;
	private int phoneNumber;
	private String emailAddress;
	
	// Customer constructor
	public Customer(int customerID, String name, int phoneNumber, String emailAddress) {
		this.customerID = customerID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	
	// Getters and setters for Customer class attributes
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	/*
	 * Possible methods:
	 * addCustomer
	 */
}
