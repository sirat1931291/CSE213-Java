package mainpkg;

import java.time.LocalDate;


public class Product {
    private String productName;
    private String productID;
    private String material;
    private int quantity;
    private LocalDate deliveryDate;

    public Product(String productName, String productID, String material, int quantity, LocalDate deliveryDate) {
        this.productName = productName;
        this.productID = productID;
        this.material = material;
        this.quantity = quantity;
        this.deliveryDate = deliveryDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "Product{" + "productName=" + productName + ", productID=" + productID + ", material=" + material + ", quantity=" + quantity + ", deliveryDate=" + deliveryDate + '}';
    }
    
    
}
