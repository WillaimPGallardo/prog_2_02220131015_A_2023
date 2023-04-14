/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Co.edu.udes;

/**
 *
 * @author usuario
 */
public class products {
    
    private String Productname;
    private String kind_of_product;
    private double Price;
    private int Barcode;
    private int content_number;
    private double expiration_date;
    private String batch;

    public products(String Productname, String kind_of_product, double Price, int Barcode, int content_number, double expiration_date) {
        this.Productname = Productname;
        this.kind_of_product = kind_of_product;
        this.Price = Price;
        this.Barcode = Barcode;
        this.content_number = content_number;
        this.expiration_date = expiration_date;
    }
    
    
  

    public String getProductname() {
        return Productname;
    }

    public void setProductname(String Productname) {
        this.Productname = Productname;
    }

    public String getKind_of_product() {
        return kind_of_product;
    }

    public void setKind_of_product(String kind_of_product) {
        this.kind_of_product = kind_of_product;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public int getBarcode() {
        return Barcode;
    }

    public void setBarcode(int Barcode) {
        this.Barcode = Barcode;
    }

    public int getContent_number() {
        return content_number;
    }

    public void setContent_number(int content_number) {
        this.content_number = content_number;
    }

    public double getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(double expiration_date) {
        this.expiration_date = expiration_date;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    @Override
    public String toString() {
        return "Productos{" + "Productname=" + Productname + ", kind_of_product=" + kind_of_product + ", Price=" + Price + ", Barcode=" + Barcode + ", content_number=" + content_number + ", expiration_date=" + expiration_date + ", batch=" + batch + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
