package mainpkg;

import java.util.ArrayList;

public class CartItem {
    private String product_name;
    private float unit_price;
    private int quantity;
    private int vat_rate;

    public CartItem() {
    }

    public CartItem(String product_name, float unit_price, int quantity, int vat_rate) {
        this.product_name = product_name;
        this.unit_price = unit_price;
        this.quantity = quantity;
        this.vat_rate = vat_rate;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public float getUnit_price() {
        return unit_price;
    }

    public void setUnit_price(float unit_price) {
        this.unit_price = unit_price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getVat_rate() {
        return vat_rate;
    }

    public void setVat_rate(int vat_rate) {
        this.vat_rate = vat_rate;
    }

    @Override
    public String toString() {
        return "CartItem{" + "product_name=" + product_name + ", unit_price=" + unit_price + ", quantity=" + quantity + ", vat_rate=" + vat_rate + '}';
    }
    
    public float getVatAmount() {
        return (unit_price * quantity) * vat_rate / 100;
    }
    
    public float getTotalAmount() {
        return unit_price * quantity + getVatAmount();
    }
}
