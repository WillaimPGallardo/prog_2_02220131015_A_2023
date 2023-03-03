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
public class Ejercicos3 {
    public static void main(String[] args) {
    
    Scanner datos= new Scanner(System.in);
    float Cateto1;
    
    float Cateto2;
    float hipotenusa;
        System.out.println("Ingrese el cateto1 : ");
        Cateto1=datos.nextFloat();
        System.out.println("Ingrese el cateto2: ");
        Cateto2=datos.nextFloat();
        
        hipotenusa=((Cateto1*Cateto1)+(Cateto2*Cateto2));
        System.out.println("El perimetro de su ractangulo es: "+hipotenusa);
       
        
         
    
    
    
    }
    
}
