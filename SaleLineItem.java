public class SaleLineItem {
    private int quantity;
    private String orderNumber;
    private String itemID;

    // Constructor
    public SaleLineItem(int quantity, String orderNumber, String itemID) {
        this.quantity = quantity;
        this.orderNumber = orderNumber;
        this.itemID = itemID;
    }

    // Getter and setter methods
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }
}