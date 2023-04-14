/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Co.edu.udes;

/**
 *
 * @author usuario
 */
public class inventory {
    
    
    private String Product_name;
    private int units_purchased;
    private double price;
    private int sold_units;
    private int remaining_units_in_warehouse;
    private int counter_units;
    private String date_of_purchase;  

    public inventory(String Product_name, int units_purchased, double price, int sold_units, int remaining_units_in_warehouse, int counter_units, String date_of_purchase) {
        this.Product_name = Product_name;
        this.units_purchased = units_purchased;
        this.price = price;
        this.sold_units = sold_units;
        this.remaining_units_in_warehouse = remaining_units_in_warehouse;
        this.counter_units = counter_units;
        this.date_of_purchase = date_of_purchase;
    }
    
    
    
    
    
    
    

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String Product_name) {
        this.Product_name = Product_name;
    }

    public int getUnits_purchased() {
        return units_purchased;
    }

    public void setUnits_purchased(int units_purchased) {
        this.units_purchased = units_purchased;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSold_units() {
        return sold_units;
    }

    public void setSold_units(int sold_units) {
        this.sold_units = sold_units;
    }

    public int getRemaining_units_in_warehouse() {
        return remaining_units_in_warehouse;
    }

    public void setRemaining_units_in_warehouse(int remaining_units_in_warehouse) {
        this.remaining_units_in_warehouse = remaining_units_in_warehouse;
    }

    public int getCounter_units() {
        return counter_units;
    }

    public void setCounter_units(int counter_units) {
        this.counter_units = counter_units;
    }

    public String getDate_of_purchase() {
        return date_of_purchase;
    }

    public void setDate_of_purchase(String date_of_purchase) {
        this.date_of_purchase = date_of_purchase;
    }

    @Override
    public String toString() {
        return "Inventario{" + "Product_name=" + Product_name + ", units_purchased=" + units_purchased + ", price=" + price + ", sold_units=" + sold_units + ", remaining_units_in_warehouse=" + remaining_units_in_warehouse + ", counter_units=" + counter_units + ", date_of_purchase=" + date_of_purchase + '}';
    }

    
    
    
    
    
    
    
    
}
