/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionales.Condicionales;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        int pagototal;
        
        int precio100=65;
        
        int precio50=70;
        
        int precio30=95;
      
        int estudiantes;
        
        
        System.out.println("Ingrese el numero de estudiantes que van a viajar");
        estudiantes = dato.nextInt();
        
        
        
        if(estudiantes>=100){
            
            pagototal=precio100*estudiantes;
            System.out.println("El pago total es de "+pagototal+" a cada estudiante le toca de: "+precio100);
        }
        if(estudiantes>=50&&estudiantes<=99){
            
            pagototal=precio50*estudiantes;
            System.out.println("El pago total es de "+pagototal+" a cada estudiante le toca de: "+precio100);
        
        }
        if(estudiantes>=30&&estudiantes<=49){
            
            pagototal=precio30*estudiantes;
            System.out.println("El pago total es de "+pagototal+" a cada estudiante le toca de:  "+precio100);
        
        }
        if(estudiantes<30){
            
            pagototal=4000/estudiantes;
            System.out.println("EL el total es 4000 y a cada estudiante le toca de: "+pagototal);
        
        
        }
        
        
    }
    
}
