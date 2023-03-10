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
public class Ejercicio7 {
    public static void main(String[] args) {
        
         Scanner Dato = new Scanner(System.in);

        double x1;
        double y1;
        double r1;
        double x2;
        double y2; 
        double r2 ;
         
        
         double distancia;
         
         
        System.out.println("Ingrese el punto X1 Primera circunferencia: ");
        x1 = Dato.nextDouble();
        
        System.out.println("Ingrese el punto Y1 Primera circunferencia: ");
        y1 = Dato.nextDouble();
        
        System.out.println("Ingrese el radio de la Primera circunferencia: ");
        r1 = Dato.nextDouble();
        
        System.out.println("");
        System.out.println("---------------------/////---------------------------------");
        System.out.println("");

        System.out.println("Ingrese el punto X2 segunda circunferencia: ");
        x2 = Dato.nextDouble();
        
        System.out.println("Ingrese el punto Y2 segunda circunferencia: ");
        y2 = Dato.nextDouble();
        
        System.out.println("Ingrese el radio de la segunda circunferencia: ");
        r2 = Dato.nextDouble();

        
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            
            System.out.println("Las circunferencias son concéntricas.");
            
        } else if (distancia > r1 + r2) {
            
            System.out.println("Las circunferencias son exteriores.");
            
        } else if (distancia == r1 + r2) {
            
            System.out.println("Las circunferencias son tangentes exteriores.");
            
        } else if (distancia < Math.abs(r1 - r2)) {
            
            System.out.println("Las circunferencias son interiores.");
            
        } else if (distancia == Math.abs(r1 - r2)) {
            
            System.out.println("Las circunferencias son tangentes interiores.");
            
        } else {
            
            System.out.println("Las circunferencias son secantes.");
            
        }
        
        
    }
    
}
