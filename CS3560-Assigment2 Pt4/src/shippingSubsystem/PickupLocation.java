package shippingSubsystem;

public class PickupLocation {
	// Attributes of PickupLocation class
	private int warehouseID;
	private String manufacturer;
	private String street;
	private String city;
	private String state;
	private int zipcode;
	private String country;
	
	// Constructor for PickupLocation
	public PickupLocation(int warehouseID, String manufacturer, String street, String city, String state, int zipcode, String country) {
		this.warehouseID = warehouseID;
		this.manufacturer = manufacturer;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}
	
	// Getters and setters for PickupLocation class attributes
	public Integer getWarehouseID() {
		return warehouseID;
	}
	public void setWarehouseID(int warehouseID) {
		this.warehouseID = warehouseID;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
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
	 * addPickupLocation
	 */
	// removePickupLocation method
	public void removePickupLocation() {
		this.warehouseID = 0;
		this.manufacturer = null;
		this.street = null;
		this.city = null;
		this.state = null;
		this.zipcode = 0;
		this.country = null;
	}
	// lookupPickupLocation
	public void lookupPickupLocation(Integer warehouseID) {
		if (warehouseID == 0) {
			System.out.println("Item does not exist.");
		}
		else {
			System.out.println("Warehouse ID: " + getWarehouseID());
			System.out.println("Manufacturer: " + getManufacturer());
			System.out.println("Street: " + getStreet());
			System.out.println("City: " + getCity());
			System.out.println("State: " + getState());
			System.out.println("Zipcode: " + getZipcode());
			System.out.println("Country: " + getCountry());
		}
	}
}
