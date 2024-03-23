package shippingSubsystem;

public class ProductItem {
	// Attributes of ProductItem class
	private int itemID;
	private String name;
	private String type;
	private double price;
	private String itemDescription;
	private String manufacturer;
	private String supplier;
	
	// ProductItem constructor
	public ProductItem(int itemID, String name, String type, double price, String itemDescription, String manufacturer,
			String supplier) {
		this.itemID = itemID;
		this.name = name;
		this.type = type;
		this.price = price;
		this.itemDescription = itemDescription;
		this.manufacturer = manufacturer;
		this.supplier = supplier;
	}
	
	// Getters and setters for ProductItemClass attributes
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	
	/*
	 * Possible methods:
	 * addProductItem
	 */
	public void removeProductItem() {
		this.itemID = null;
		this.name = null;
		this.type = null;
		this.price = null;
		this.itemDescription = null;
		this.manufacturer = null;
		this.supplier = null;
	}
	public void lookupItem(int itemID) {
		if (itemID == null) {
			System.out.println("Item does not exist.");
		}
		else {
			System.out.println("Item ID: " + getItemID());
			System.out.println("Name: " + getName());
			System.out.println("Type: " + getType());
			System.out.println("Price: " + getPrice());
			System.out.println("Item Description: " + getItemDescription());
			System.out.println("Manufacturer: " + getManufacturer());
			System.out.println("Supplier: " + getSupplier());
		}
	}
}
