/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionales;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercici1 {
    public static void main(String[] args) {
    
     Scanner Dato = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.print("Ingrese el primer número: ");
        num1 = Dato.nextInt();
        
        System.out.print("Ingrese el segundo número: ");
        num2 = Dato.nextInt();
        
        
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
            
        } else if (num2 > num1) {
            
            System.out.println(num2 + " es mayor que " + num1);
            
        } else {
            
            System.out.println(num1 + " y " + num2 + " son iguales");
            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
