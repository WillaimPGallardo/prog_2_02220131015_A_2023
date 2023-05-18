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
public class Ejercicio20 {
    public static void main(String[] args) {
        
       Scanner Dato = new Scanner(System.in);
       
       int num1;
       int num2;
        
       
       try{
        System.out.print("Ingresa el primer número: ");
        num1 = Dato.nextInt();
        
        System.out.print("Ingresa el segundo número: ");
        num2 = Dato.nextInt();
        
        int menor = Math.min(num1, num2);
        
        int mayor = Math.max(num1, num2);
        
        
        
        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                
                System.out.println(i);
                
            }
        }
        
         }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    
    }
    
}
