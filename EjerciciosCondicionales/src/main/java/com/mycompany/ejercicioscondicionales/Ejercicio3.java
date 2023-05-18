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
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);
        
        double num1;
        double num2; 
        double resultado;
        
        
        try{
        System.out.println("Introduce el primer número: ");
        num1 = Dato.nextDouble();
        
        System.out.println("Introduce el segundo número: ");
        num2 = Dato.nextDouble();
        
        if (num2 == 0) {
            
            System.out.println("ERRROR no es posible dividir por 0");
            
        } else {
            
            resultado = num1 / num2;
            
            System.out.println("El resultado de la división es: " + resultado);
        }
        }
    catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

    }
        
        
        
    }
    
    
}
