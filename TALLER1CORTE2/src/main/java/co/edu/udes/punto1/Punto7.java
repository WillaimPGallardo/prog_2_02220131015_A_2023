/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.punto1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Punto7 {
    
    public static void main(String[] args) {
         
        Scanner Dato = new Scanner(System.in);

        
        try{
        // Pedir el tamaño de los vectores
        System.out.print("Ingrese el tamaño de los vectores: ");
        int n = Dato.nextInt();

        // Crear los dos vectores
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];

        
        System.out.println("Ingrese los valores para el primer vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            vector1[i] = Dato.nextInt();
        }

       
        System.out.println("Ingrese los valores para el segundo vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i+1) + ": ");
            vector2[i] = Dato.nextInt();
        }
        
        System.out.println("se intento ");
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
    
}
