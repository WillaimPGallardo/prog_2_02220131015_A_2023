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
public class Ejercico2 {
    
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        
        int num1; 
        
        System.out.print("Introduce un número entero: ");
        num1 = Dato.nextInt();
        

        if (num1 % 2 == 0) {
            
            System.out.println(num1 + " es par");
            
            
        } else {
            
            
            System.out.println(num1 + " es impar");
            
        }
        
        
        
        
        
        
        
    }
    
}
