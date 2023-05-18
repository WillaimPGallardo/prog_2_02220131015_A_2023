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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);

        double base;
        int exponente;
        
        try{
        System.out.print("Ingrese el número base: ");
        base = Dato.nextDouble();

        System.out.print("Ingrese el exponente: ");
        exponente = Dato.nextInt();

        double resultado = 1.0;

        if (exponente > 0) {
            
            
            for (int i = 0; i < exponente; i++) {
                
               resultado *= base;
               
            }
        } else if (exponente < 0) {
            
            exponente *= -1;
            
            for (int i = 0; i < exponente; i++) {
                
                resultado *= base;
                
            }
            resultado = 1.0 / resultado;
            
        } 
        
        

        System.out.println("El resultado es: " + resultado);

        
     }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}   
        
        
        
        
        
        
    }
    
}
