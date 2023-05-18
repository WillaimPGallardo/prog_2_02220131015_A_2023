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
public class Ejercicio21 {
        public static void main(String[] args) {
            
         Scanner Dato = new Scanner(System.in);
         
        int limiteInferior; 
        int limiteSuperior;
        
        try{
        
        do {
            
            System.out.print("Introduce el límite inferior del intervalo: ");
            limiteInferior = Dato.nextInt();
            
        } while (limiteInferior > 0);
        
       
        do {
            
            System.out.print("Introduce el límite superior del intervalo: ");
            limiteSuperior = Dato.nextInt();
            
        } while (limiteSuperior <= limiteInferior);
        
        int suma = 0, dentroIntervalo = 0, fueraIntervalo = 0;
        
        boolean igualesLimites = false;
        
        int num;
        
        do {
            System.out.print("Introduce un número (0 para terminar): ");
            num = Dato.nextInt();
            
            if (num != 0) {
                if (num > limiteInferior && num < limiteSuperior) {
                    
                    suma += num;
                    dentroIntervalo++;
                    
                } else {
                    
                    if (num == limiteInferior || num == limiteSuperior) {
                        igualesLimites = true;
                        
                    }
                    
                    fueraIntervalo++;
                }
            }
        } while (num != 0);
        
        System.out.println("La suma de los números dentro del intervalo es: " + suma);
        System.out.println("Hay " + fueraIntervalo + " números fuera del intervalo.");
        
        if (igualesLimites) {
            
            System.out.println("Se ha introducido algún número igual a los límites del intervalo.");
            
        } else {
            
            System.out.println("No se ha introducido ningún número igual a los límites del intervalo.");
            
        }
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
    
}
