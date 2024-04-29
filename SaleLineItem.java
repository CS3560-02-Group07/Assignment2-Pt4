public class SaleLineItem {
    private int quantity;
    private int orderNumber;
    private int itemID;

    // Constructor
    public SaleLineItem(int quantity, int orderNumber, int itemID) {
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

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }
}
