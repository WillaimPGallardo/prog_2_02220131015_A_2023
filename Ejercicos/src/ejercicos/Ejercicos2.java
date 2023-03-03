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
public class Ejercicos2 {
    public static void main(String[] args) {
    
    Scanner datos= new Scanner(System.in);
    float Perimetro;
    float Area;
    float base;
    float Altura;
        System.out.println("Ingrese la base del rectangulo: ");
        base=datos.nextFloat();
        System.out.println("Ingrese la altura del rectangulo: ");
        Altura=datos.nextFloat();
        
        Perimetro=(2*(base+Altura));
        Area=base*Altura;
        System.out.println("El perimetro de su ractangulo es: "+Perimetro);
       System.out.println("El Area de su ractangulo es: "+Area);
        
         
    
    
    
    }
    
}
