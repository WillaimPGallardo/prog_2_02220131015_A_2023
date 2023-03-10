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
public class Ejercico29 {
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        int[][] numeros = new int[4][5];
        
        int[] sumasFilas = new int[4];
        
        int[] sumasColumnas = new int[5];
        
        int sumaTotal = 0;

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Introduce el número en la fila " + (i+1) + " y columna " + (j+1) + ": ");
                numeros[i][j] = Dato.nextInt();
                
                
                sumasFilas[i] += numeros[i][j];
                
                sumasColumnas[j] += numeros[i][j];
                
                sumaTotal += numeros[i][j];
            }
        }

        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            
            System.out.print(sumasFilas[i]);
            System.out.println();
        }
        for (int j = 0; j < 5; j++) {
            System.out.print(sumasColumnas[j] + "\t");
        }
        System.out.println(sumaTotal);
        
        
    }
    
}
