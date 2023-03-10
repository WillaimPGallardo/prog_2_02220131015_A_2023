/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionales.Condicionales;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);
        
        int año;
        
        System.out.print("Ingrese el año: ");
        año = Dato.nextInt();
        
        
        if (año % 4 == 0 && (año % 100 != 0 || año % 400 == 0)) {
            
      
            System.out.println(año + " Es un año bisiesto.");
            
            
        } else {
            
            System.out.println(año + " No es un año bisiesto.");
            
        }
        
    }
        
    }
    

