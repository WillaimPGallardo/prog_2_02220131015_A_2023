package Co.edu.udes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Employee {

    private String name;
    private String document_type;
    private int ID;
    private String blood_type;
    private int cell_phone_number;
    private String post;
    private String address;
    private String mail;
    private double salary;
    private int code;
    
    private String section_area;
    
   
   
   
    public Employee(String name, String document_type, int ID, String blood_type,String section_area, int cell_phone_number, String post, String address, String mail, double salary, int code) {
        this.name = name;
        this.document_type = document_type;
        this.ID = ID;
        this.blood_type = blood_type;
        this.cell_phone_number = cell_phone_number;
        this.post = post;
        this.address = address;
        this.mail = mail;
        this.salary = salary;
        this.code = code;
        this.section_area = section_area;
    }

    public String getSection_area() {
        return section_area;
    }

    public void setSection_area(String section_area) {
        this.section_area = section_area;
    }

    
    
    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    
    
    
    public String getDocument_type() {
        return document_type;
    }

    public void setDocument_type(String document_type) {
        this.document_type = document_type;
    }

    
    
    public String getBlood_type() {
        return blood_type;
    }

    public void setBlood_type(String blood_type) {
        this.blood_type = blood_type;
    }

    
    
    public int getCell_phone_number() {
        return cell_phone_number;
    }

    public void setCell_phone_number(int cell_phone_number) {
        this.cell_phone_number = cell_phone_number;
    }

    
    
    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Empleado{" + "name=" + name + ", document_type=" + document_type + ", ID=" + ID + ", blood_type=" + blood_type + ", cell_phone_number=" + cell_phone_number + ", post=" + post + ", address=" + address + ", mail=" + mail + ", salary=" + salary + ", code=" + code + '}';
    }

    
    
    
    
    
    
}
