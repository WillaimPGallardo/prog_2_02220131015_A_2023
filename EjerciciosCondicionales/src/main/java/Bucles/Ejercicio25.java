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
public class Ejercicio25 {
       public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);
        
        int n;
        
        
        System.out.print("Introduce la cantidad de números primos que deseas mostrar: ");
        n = Dato.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {
            boolean esPrimo = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                
                if (num % i == 0) {
                    
                    esPrimo = false;
                    break;
                    
                }
            }
            if (esPrimo) {
                
                System.out.print(num + " ");
                count++;
                
            }
            num++;
        }
        
           
           
           
    }
    
}
