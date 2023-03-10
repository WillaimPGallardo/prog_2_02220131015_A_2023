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
public class Ejercicio19 {
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        char ch;
        do {
            System.out.print("Introduzca una letra : ");
            ch = Dato.next().charAt(0);
            
            if (ch == ' ') {
                break;
            }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("VOCAL");
                
            } else {
                
                System.out.println("NO VOCAL");
                
            }
        } while (ch != ' ');
        
        
    }
    
}
