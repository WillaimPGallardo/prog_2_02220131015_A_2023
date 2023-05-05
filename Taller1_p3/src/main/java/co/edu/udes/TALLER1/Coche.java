/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.TALLER1;


public class Coche {
    private String Placa;
    private String marca;
    private String modelo;
    
    public Coche(String matricula, String marca, String modelo) {
        this.Placa = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return Placa;
    }

    public void setMatricula(String matricula) {
        this.Placa = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

      @Override
    public String toString() {
        return "Placa: " + Placa + ", Marca: " + marca + ", Modelo: " + modelo;
    }
}
