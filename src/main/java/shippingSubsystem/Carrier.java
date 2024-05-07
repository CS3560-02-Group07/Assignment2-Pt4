package shippingSubsystem;

public class Carrier {
	// Attributes of Carrier class class
    
	private int carrierID;
	private int phoneNumber;
	private String emailAddress;
	
	// Carrier constructor
	public Carrier(int carrierID, int phoneNumber, String emailAddress) {
		this.carrierID = carrierID;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	// Getters and setters for Carrier class attributes
	public int getCarrierID() {
		return carrierID;
	}
	public void setCarrierID(int carrierID) {
		this.carrierID = carrierID;
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
	 * addCarrier
	 */
	public void removeCarrier() {
		this.carrierID = 0;
		this.phoneNumber = 0;
		this.emailAddress = null;
		System.out.println("Carrier removed successfully.");
	}
}
