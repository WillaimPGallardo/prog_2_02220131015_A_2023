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
public class Ejercicio18 {
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        int n; 
        int positivos = 0; 
        int negativos = 0; 
        int ceros = 0;
        
        try{
        System.out.print("Introduce la cantidad de números a introducir: ");
        n = Dato.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            System.out.print("Introduce un número: ");
            
            int num = Dato.nextInt();
            if (num > 0) {
                positivos++;
                
            } else if (num < 0) {
                negativos++;
                
            } else {
                ceros++;
                
            }
        }
        
        System.out.println("Números positivos introducidos: " + positivos);
        
        System.out.println("Números negativos introducidos: " + negativos);
        
        System.out.println("Números iguales a cero introducidos: " + ceros);
        
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
        
        
 }
    

