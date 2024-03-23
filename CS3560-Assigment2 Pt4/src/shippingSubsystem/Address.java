package shippingSubsystem;

public class Address{
	// Attributes of Address class
	private String street;
	private String city;
	private String state;
	private int zipcode;
	private String country;
	
	// Address constructor
	public Address(String street, String city, String state, int zipcode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}

	// Getters and setters for Address class attributes
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	/*
	 * Possible methods:
	 * addAddress //add address from the customer
	 */
	public void removeAddress() {
		this.street = null;
		this.city = null;
		this.state = null;
		this.zipcode = null;
		this.country = null;
		System.out.println("Address removed successfully.");
}
