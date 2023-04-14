/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Co.edu.udes;

/**
 *
 * @author usuario
 */
public class customer {
    
    private String name;
    private String lastName;
    private String phoneNumber;
    private String id;
    private String clientType;

    public customer(String name, String lastName, String phoneNumber, String id, String clientType) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.id = id;
        this.clientType = clientType;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", Id=" + id + ", clientType=" + clientType + '}';
    }
    
}
