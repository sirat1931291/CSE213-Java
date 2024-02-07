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
    private String Name;
    private String Gender;
    private int Age;

    public Customer() {
    }

    public Customer(String Name, String Gender, int Age) {
        this.Name = Name;
        this.Gender = Gender;
        this.Age = Age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    

    @Override
    public String toString() {
        return "" + Name + "," + Gender + "," + Age;
    }
    
    
}
