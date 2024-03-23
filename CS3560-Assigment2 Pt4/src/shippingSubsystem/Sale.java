package shippingSubsystem;

public class Sale {
	// Attributes of Sale class
	private int orderNumber;
	private int saleDate;
	private int saleTime;
	private double tax;
	private double totalAmount;
	private int productItems;
	
	// Sale constructor
	public Sale(int orderNumber, int saleDate, int saleTime, double tax, double totalAmount, int productItems) {
		this.orderNumber = orderNumber;
		this.saleDate = saleDate;
		this.saleTime = saleTime;
		this.tax = tax;
		this.totalAmount = totalAmount;
		this.productItems = productItems;
	}

	// Getters and setters for Sale class attributes
	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public int getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(int saleDate) {
		this.saleDate = saleDate;
	}

	public int getSaleTime() {
		return saleTime;
	}

	public void setSaleTime(int saleTime) {
		this.saleTime = saleTime;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(float tax) {
		this.tax = tax;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getProductItems() {
		return productItems;
	}

	public void setProductItems(int productItems) {
		this.productItems = productItems;
	}
	
	/*
	 * Possible methods: 
	 * lookupOrder
	 * archiveOrder
	 * returnRequest
	 * refundRequest
	 * cancelOrder
	 */
	public void receipt() {
		System.out.println("Order number: " + getOrderNumber());
		System.out.println("Sale Date: " + getSaleDate());
		System.out.println("Sale Time: " + getSaleTime());
		System.out.println("Tax: " + getTax());
		System.out.println("Tax Amount: " + calculateTax());
		System.out.println("Total Amount: " + getTotalAmount());
		System.out.println("Total Amount After Tax: " + calculateTotalAmount());
	}
	public double calculateTax() {
		return getTax() * getTotalAmount();
	}
	public double calculateTotalAmount() {
		return calculateTax() + getTotalAmount();
	}
}
