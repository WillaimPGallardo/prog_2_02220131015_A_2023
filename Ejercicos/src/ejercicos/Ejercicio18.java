/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio18 {
    public static void main (String[] args){
        
        Scanner Dato= new Scanner(System.in);
        
        String Apellido1;
        
        String Apellido2;
        
    
    
        System.out.println("Ingrese el primer apellido: ");
        Apellido1=Dato.nextLine();
        
        System.out.println("Ingrese el segundo apellido: ");
        Apellido2=Dato.nextLine();
        
        
        char Letra1=Apellido1.charAt(0);
        
        char Letra2=Apellido2.charAt(0);
        
        
        
        
        
        
        
        System.out.println("La inicial del apellido: "+Apellido1+" es'" +Letra1);
        System.out.println("La inicial del segundo apellido: "+Apellido2+" es "+Letra2);
        
    }    
    
}
