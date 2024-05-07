package shippingSubsystem;

public class Package {
	// Attributes of Package class classs
	private int packageID;
	private double weight;
	private double size[] = new double[3]; // Array of size 3 for size attribute to contain package length, width, and height
	private String status;
	private String destination;
	private String pickupLocation; // May not need these 2 due to relationship with address? Not too sure right now
	
	// Package class constructor
	public Package(int packageID, double weight, double[] size, String status, String destination, String pickupLocation) {
		this.packageID = packageID;
		this.weight = weight;
		this.size = size;
		this.status = status;
		this.destination = destination;
		this.pickupLocation = pickupLocation;
	}
	
	// Getters and setters for Package class attributes
        
	public int getPackageID() {
		return packageID;
	}
	public void setPackageID(int packageID) {
		this.packageID = packageID;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double[] getSize() {
		return size;
	}
	public void setSize(double[] size) {
		this.size = size;
	}
	public void displaySize(double[] size) {
		System.out.println("Length: " + size[0]);
		System.out.println("Width: " + size[1]);
		System.out.println("Height: " + size[2]);
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	
	/*
	 * Possible methods:
	 * setDelivery
	 */
	public void getPackageInfo() {
		System.out.println("Package ID: " + getPackageID());
		System.out.println("Weight" + getWeight() + "lbs");
		displaySize(size);
		System.out.println("Status: " + getStatus());
		System.out.println("Destination: " + getDestination());
		System.out.println("Pickup location: " + getPickupLocation());
	}
}
