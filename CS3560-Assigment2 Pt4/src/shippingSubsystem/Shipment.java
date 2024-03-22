package shippingSubsystem;

public class Shipment {
	// Attributes of Shipment class
	private int shipmentID;
	private String shippingMethod;
	private int trackingInformation;
	private String status;
	private double shippingCost;
	
	// Shipment constructor
	public Shipment(int shipmentID, String shippingMethod, int trackingInformation, String status,
			double shippingCost) {
		super();
		this.shipmentID = shipmentID;
		this.shippingMethod = shippingMethod;
		this.trackingInformation = trackingInformation;
		this.status = status;
		this.shippingCost = shippingCost;
	}
	
	// Getters and setters for Shipment class attributes
	public int getShipmentID() {
		return shipmentID;
	}
	public void setShipmentID(int shipmentID) {
		this.shipmentID = shipmentID;
	}
	public String getShippingMethod() {
		return shippingMethod;
	}
	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}
	public int getTrackingInformation() {
		return trackingInformation;
	}
	public void setTrackingInformation(int trackingInformation) {
		this.trackingInformation = trackingInformation;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getShippingCost() {
		return shippingCost;
	}
	public void setShippingCost(double shippingCost) {
		this.shippingCost = shippingCost;
	}
	
	/*
	 * Possible methods:
	 * shipmentConfirmation
	 * createShipment
	 * shippingCostCalculation
	 * updateStatus
	 * statusUpdateNotification
	 */
}
