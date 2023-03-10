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
public class Ejercicio26 {
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        
        int n;
        
        
        System.out.print("Ingrese el número de filas de la pirámide: ");
        n = Dato.nextInt();
        
        int num = 1;
        
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n-i; j++) {
                
                System.out.print(" ");
                
            }
            for (int k = 1; k <= i; k++) {
                
                System.out.print(num + " ");
                num++;
                
            }
            System.out.println();
        }
    }
}   

