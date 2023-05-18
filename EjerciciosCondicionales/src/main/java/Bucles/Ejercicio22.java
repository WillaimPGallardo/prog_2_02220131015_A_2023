/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio22 {
    public static void main(String[] args) {
        
         Scanner Dato = new Scanner(System.in);
        
         double base;
         int exponente;
         
         try{
        System.out.println("Introduce la base: ");
        base = Dato.nextDouble();
        
        System.out.println("Introduce el exponente: ");
        exponente = Dato.nextInt();
        
        double resultado = 1;
        
        for (int i = 1; i <= exponente; i++) {
            
            resultado *= base;
        }
        
        System.out.println(base + " elevado a " + exponente + " es igual a " + resultado);
    
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
    
}
