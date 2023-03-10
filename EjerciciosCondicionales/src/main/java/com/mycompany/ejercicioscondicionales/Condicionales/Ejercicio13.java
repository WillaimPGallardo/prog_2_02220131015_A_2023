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
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);
        
        int resultado;

     
        System.out.print("Ingrese el resultado obtenido al lanzar el dado: ");
        resultado = Dato.nextInt();

        // Verificar que el número ingresado sea válido
        if (resultado < 1 || resultado > 6) {
            
            System.out.println("ERROR: número incorrecto");
            
            return;
            
        }
        
        int opuesto = 0;
        switch (resultado) {
            case 1:
                opuesto = 6;
                break;
            case 2:
                opuesto = 5;
                break;
            case 3:
                opuesto = 4;
                break;
            case 4:
                opuesto = 3;
                break;
            case 5:
                opuesto = 2;
                break;
            case 6:
                opuesto = 1;
                break;
        }

        
        String numeroEnLetras = "";
        switch (opuesto) {
            case 1:
                
                numeroEnLetras = "uno";
                break;
                
            case 2:
                
                numeroEnLetras = "dos";
                break;
                
            case 3:
                
                numeroEnLetras = "tres";
                break;
                
            case 4:
                
                numeroEnLetras = "cuatro";
                break;
                
            case 5:
                
                numeroEnLetras = "cinco";
                break;
                
            case 6:
                
                numeroEnLetras = "seis";
                break;
        }
        
        System.out.println("El número en letras de la cara opuesta al resultado obtenido es: " + numeroEnLetras);
    }
        
        
        
        
        
    }
    

