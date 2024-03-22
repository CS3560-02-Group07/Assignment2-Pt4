package shippingSubsystem;

public class Package {
	// Attributes of Package class
	private int packageID;
	private double weight;
	private double size[] = new double[3]; // Array of size 3 for size attribute to contain package length, width, and height
	private String status;
	
	// Package class constructor
	public Package(int packageID, double weight, double[] size, String status) {
		super();
		this.packageID = packageID;
		this.weight = weight;
		this.size = size;
		this.status = status;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	/*
	 * Possible methods:
	 * getPackageInfo
	 */
}
