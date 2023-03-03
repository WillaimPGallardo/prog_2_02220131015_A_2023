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
public class Ejercicos6 {
    public static void main(String[] args) {
    
    Scanner datos= new Scanner(System.in);
    float Media;
    float NumA,NumB,NumC;
    
    
        System.out.println("Ingrese el numero 1 : ");
        NumA=datos.nextFloat();
        System.out.println("Ingrese el numero 2 : ");
        NumB=datos.nextFloat();
        System.out.println("Ingrese el numero 3 : ");
        NumC=datos.nextFloat();
        
        Media= (NumA+NumB+NumC)/3;
        
        
        System.out.println("La media de estos 3 numeros nos: "+Media);
       
        
         
    
    
    
    }
}
