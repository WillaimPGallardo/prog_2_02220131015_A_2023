/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicos;

import java.util.Scanner;

/**
 *
 * @author LabSispc02
 */
public class Ejercicos9 {
    public static void main(String[] args) {
    
    Scanner Compra= new Scanner(System.in);
    
    float P1,P2,P3;
    float factura;
    
    
    String v1,v2,v3;
    
        System.out.println("Ingrese la primera prenda: ");
        v1=Compra.nextLine();
        System.out.println("Precio: "+v1);
        P1=Compra.nextFloat();
        System.out.println("Ingrese la segunda prenda: ");
        v2=Compra.nextLine();
        System.out.println("Precio: "+v2);
        P2=Compra.nextFloat();
        System.out.println("Ingrese la tercera prenda: ");
        v3=Compra.nextLine();
        System.out.println("Precio: "+v3);
        P3=Compra.nextFloat();
        
        factura=((P1+P2+P3)*15)/100;
        
        System.out.println("Su promedio de compra es de: "+factura);
        
        
        
        
        
        
    
        
        
        
   
    
    
    }
    
    
}
