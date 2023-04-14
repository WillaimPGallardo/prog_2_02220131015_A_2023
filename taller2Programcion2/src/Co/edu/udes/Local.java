/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Co.edu.udes;

/**
 *
 * @author usuario
 */
public class Local {
    
   private int Postal_Code;
   private int number_of_branches;
   private double Area;
   private int number;
   private String address;

    public Local(int Postal_Code, int number_of_branches, double Area, int number, String address) {
        this.Postal_Code = Postal_Code;
        this.number_of_branches = number_of_branches;
        this.Area = Area;
        this.number = number;
        this.address = address;
    }
   
   

    public int getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(int Postal_Code) {
        this.Postal_Code = Postal_Code;
    }

    public int getNumber_of_branches() {
        return number_of_branches;
    }

    public void setNumber_of_branches(int number_of_branches) {
        this.number_of_branches = number_of_branches;
    }

    public double getArea() {
        return Area;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Local{" + "Postal_Code=" + Postal_Code + ", number_of_branches=" + number_of_branches + ", Area=" + Area + ", number=" + number + ", address=" + address + '}';
    }
    
    
    
    
 
    
    
}
