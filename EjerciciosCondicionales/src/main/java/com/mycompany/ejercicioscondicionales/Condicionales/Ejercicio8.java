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
public class Ejercicio8 {
        public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        
        int lado1;
        int lado2;
        int lado3;
        double h1;
        double h2;
        double h3;
        

        System.out.println("Ingrese el dado 1 del triangulo");
        lado1=Dato.nextInt();
        
        System.out.println("Ingrese el dado 2 del triangulo");
        lado2=Dato.nextInt();
        
        System.out.println("Ingrese el dado 3 del triangulo");
        lado3=Dato.nextInt();
    
        
        if(lado1==lado2&&lado1==lado3){
            System.out.println("Es un triangulo equilatero");
        } 
        if(lado1==lado2&&lado1!= lado3||lado2==lado3&&lado2!=lado1){
            System.out.println("Es un triangulo isoseles");
        }
        if(lado1!=lado2&&lado1!=lado3&&lado2!=lado3){
            System.out.println("Es un trianculo Escaleno");
        }
        
        
        
        if(lado1>lado2&&lado1>lado3){
            
            h1= Math.sqrt(Math.pow(lado2,2)+Math.pow(lado3,2));
            if(lado1==h1){
                System.out.println("ES TRIANGULO RECTANGULO");
            }
        }
        if(lado2>lado1&&lado2>lado3){
            
            h2= Math.sqrt(Math.pow(lado1,2)+Math.pow(lado3,2));
            if(lado2==h2){
                System.out.println("ES TRIANGULO RECTANGULO");
            }
        }
        if(lado3>lado2&&lado3>lado1){
            
            h3= Math.sqrt(Math.pow(lado2,2)+Math.pow(lado1,2));
            if(lado3==h3){
                System.out.println("ES TRIANGULO RECTANGULO");
            }
        }   
        }
}           
            
            
    
    
       
    

