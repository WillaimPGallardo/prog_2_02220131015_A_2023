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
public class Ejercicos8 {
    public static void main(String[] args) {
    
    Scanner sueldo= new Scanner(System.in);
    float Sueldo;
    float v1,v2,v3;
    float Sueldofinal;
    float Salario;
    
        System.out.println("Ingrese Su sueldo: ");
        Sueldo=sueldo.nextFloat();
        
        System.out.println("Ingrese el valor de la primera venta: ");
        v1=sueldo.nextFloat();
        System.out.println("Ingrese el valor de la Segunda venta: ");
        v2=sueldo.nextFloat();
        System.out.println("Ingrese el valor de la tercera  venta: ");
        v3=sueldo.nextFloat();
        
      Sueldofinal=((v1+v2+v3)*10)/100;
      
      Salario=(Sueldofinal+Sueldo);
      
        System.out.println("Las comisiones ganadas este mes son: "+Sueldofinal);
        System.out.println("Su sueldo total es de: "+Salario);
        
        
        
        
        
        
        
 
    
    
    
    }
    
}
