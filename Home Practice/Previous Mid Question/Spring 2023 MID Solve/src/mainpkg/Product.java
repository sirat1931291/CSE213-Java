package mainpkg;

import java.time.LocalDate;


public class Product {
    private String product_name;
    private String product_id;
    private String material;
    private int quantity;
    private LocalDate delivery_date;

    public Product() {
    }

    public Product(String product_name, String product_id, String material, int quantity) {
        this.product_name = product_name;
        this.product_id = product_id;
        this.material = material;
        this.quantity = quantity;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
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

    public LocalDate getDelivery_date() {
        return delivery_date;
    }

    public void setDelivery_date(LocalDate delivery_date) {
        this.delivery_date = delivery_date;
    }

    @Override
    public String toString() {
        return "Product{" + "product_name=" + product_name + ", product_id=" + product_id + ", material=" + material + ", quantity=" + quantity + ", delivery_date=" + delivery_date + '}';
    }
    
    
}
