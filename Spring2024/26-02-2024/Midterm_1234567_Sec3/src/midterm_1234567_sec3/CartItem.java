/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midterm_1234567_sec3;

/**
 *
 * @author asifm
 */
public class CartItem {
    private String productName;
    private float unitPrice;
    private int vatRate, quantity;

    public CartItem() {
    }

    public CartItem(String productName, float unitPrice, int vatRate, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.vatRate = vatRate;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getVatRate() {
        return vatRate;
    }

    public void setVatRate(int vatRate) {
        this.vatRate = vatRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" + "productName=" + productName + ", unitPrice=" + unitPrice + ", vatRate=" + vatRate + ", quantity=" + quantity + '}';
    }
    
    float getVatAmount() {
        return unitPrice * quantity * vatRate / 100;
    }
    
    float getTotalAmount() {
        return unitPrice * quantity + getVatAmount();
    }
}
