/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author habib
 */
public class FactoryManager {
    String fact_name, location;

    public FactoryManager() {
    }

    public FactoryManager(String fact_name, String location) {
        this.fact_name = fact_name;
        this.location = location;
    }

    public String getFact_name() {
        return fact_name;
    }

    public void setFact_name(String fact_name) {
        this.fact_name = fact_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "FactoryManager{" + "fact_name=" + fact_name + ", location=" + location + '}';
    }
    
    
}
