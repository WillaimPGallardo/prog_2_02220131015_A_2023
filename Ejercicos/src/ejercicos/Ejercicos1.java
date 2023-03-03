/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicos;

import java.util.Scanner;

/**
 *
 * @author LabSispc02
 */
public class Ejercicos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dato= new Scanner(System.in);
        String nombre;
        
        System.out.println("Porfavor ningrese su nombre");
        nombre=dato.nextLine();
        
        System.out.println("Hola buenos dias señor(a)"+nombre);
    }
    
}
