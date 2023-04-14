/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Co.edu.udes;

/**
 *
 * @author usuarioWilliam
 */
public class ATM {
   
    private String number;

    private double money;

    private String payment_method;

    private String name_of_the_employee;

    public ATM(String number, double money, String payment_method, String name_of_the_employee) {
        this.number = number;
        this.money = money;
        this.payment_method = payment_method;
        this.name_of_the_employee = name_of_the_employee;
    }
    
    
    
    

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public String getName_of_the_employee() {
        return name_of_the_employee;
    }

    public void setName_of_the_employee(String name_of_the_employee) {
        this.name_of_the_employee = name_of_the_employee;
    }

    @Override
    public String toString() {
        return "Cajero{" + "number=" + number + ", money=" + money + ", payment_method=" + payment_method + ", name_of_the_employee=" + name_of_the_employee + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
