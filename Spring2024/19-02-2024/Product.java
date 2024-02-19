/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author cis101
 */
public class Product {
    private String productName;
    private String productId;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public Product(String productName, String productId) {
        this.productName = productName;
        this.productId = productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
