/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Co.edu.udes;

/**
 *
  * @author usuarioWilliam
 */
class Customerss {
    
    private String name;
    private String mail;
    private String cell;

    public Customerss(String name, String mail, String cell) {
        this.name = name;
        this.mail = mail;
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "Customerss{" + "name=" + name + ", mail=" + mail + ", cell=" + cell + '}';
    }

    
    
    
    
    
}
