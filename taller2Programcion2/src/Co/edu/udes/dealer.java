/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Co.edu.udes;

/**
 *
 * @author usuario
 */
public class dealer {
    
     private String Name;

    private int Postal_Code;

    private String address;

    private String contract_date;

    public dealer(String Name, int Postal_Code, String address, String contract_date) {
        this.Name = Name;
        this.Postal_Code = Postal_Code;
        this.address = address;
        this.contract_date = contract_date;
    }
    
    
    
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPostal_Code() {
        return Postal_Code;
    }

    public void setPostal_Code(int Postal_Code) {
        this.Postal_Code = Postal_Code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContract_date() {
        return contract_date;
    }

    public void setContract_date(String contract_date) {
        this.contract_date = contract_date;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "Name=" + Name + ", Postal_Code=" + Postal_Code + ", address=" + address + ", contract_date=" + contract_date + '}';
    }
    
    
    
    
    
}
