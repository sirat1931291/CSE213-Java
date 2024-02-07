/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author cis101
 */
public class Customer {
    public String Name;
    public String Gender;
    public int Age;

    public Customer() {
    }

    public Customer(String Name, String Gender, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
    }

    @Override
    public String toString() {
        return "" + Name + "," + Gender + "," + Age;
    }
    
    
}
