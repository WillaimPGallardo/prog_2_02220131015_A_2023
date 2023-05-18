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
public class Ejercicio4 {
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        
        String letra;
        
        try{
        System.out.print("Introduce una letra: ");
        letra = Dato.nextLine();
        
        if (letra.length() != 1) {
            
            System.out.println("No has introducido una letra");
            
        } else if (Character.isUpperCase(letra.charAt(0))) {
            
            System.out.println("La letra introducida es mayúscula");
            
        } else {
            
            System.out.println("La letra introducida no es mayúscula");
            
        }
        }
    catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
