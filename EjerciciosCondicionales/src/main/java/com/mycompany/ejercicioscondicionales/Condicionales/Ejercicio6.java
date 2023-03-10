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
public class Ejercicio6 {
    public static void main(String[] args) {
        
         Scanner Dato = new Scanner(System.in);
        
        int edad;
        double nota;
        char Genero;
        String aceptacion = "NO ACEPTADA";
        
        System.out.println("Ingrese la edad del solicitante:");
        edad = Dato.nextInt();
        
        System.out.println("Ingrese la nota del solicitante:");
        nota = Dato.nextDouble();
        
        System.out.println("Ingrese el sexo del solicitante (M o F):");
        Genero = Dato.next().charAt(0);
        
        if (nota >= 5 && edad >= 18 && Genero == 'M') {
            aceptacion = "POSIBLE";
            
        } else if (nota >= 5 && edad >= 18 && Genero == 'F') {
            
            aceptacion = "ACEPTADA";
            
        }
        
        
        System.out.println("La solicitud del solicitante es " + aceptacion);
    }
        
        
        
    }
    

