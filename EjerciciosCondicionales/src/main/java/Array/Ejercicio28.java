/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio28 {
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        
        int[] numeros = new int[10];
        
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = Dato.nextInt();
            
            
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i] + " ");
            
            if (numeros[i] == maximo) {
                
                System.out.print("(máximo) ");
            }
            
            if (numeros[i] == minimo) {
                
                System.out.print("(mínimo) ");
            }
            System.out.println();
        }
        
        
        
    }
    
}
