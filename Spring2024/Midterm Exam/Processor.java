/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author nahia
 */
public class Processor {
    private String processor_name;
    private String series;
    private String brand;
    private int numberOfCores;
    private int price;
    private float rating;

    public Processor() {
    }

    public Processor(String processor_name, String series, String brand, int numberOfCores, int price, float rating) {
        this.processor_name = processor_name;
        this.series = series;
        this.brand = brand;
        this.numberOfCores = numberOfCores;
        this.price = price;
        this.rating = rating;
    }

    public String getProcessor_name() {
        return processor_name;
    }

    public void setProcessor_name(String processor_name) {
        this.processor_name = processor_name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Processor{" + "processor_name=" + processor_name + ", series=" + series + ", brand=" + brand + ", numberOfCores=" + numberOfCores + ", price=" + price + ", rating=" + rating + '}';
    }
    
    public float getPricePerCore() {
        return getPrice() / getNumberOfCores();
    }
}
