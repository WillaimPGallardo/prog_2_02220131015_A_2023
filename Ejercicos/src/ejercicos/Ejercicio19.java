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
public class Ejercicio19 {
     public static void main (String[] args){
    
    Scanner Dato= new Scanner(System.in);
     int total = 0;
        
        
        
        
        System.out.println("Ingrese la cantidad de preguntas a calificar");
        int respuestas=Dato.nextInt();
        
        
        
        for(int dato = 0; dato < respuestas; dato++){
            System.out.println("La respuesta de la pregunta "+(dato)+" es ?:");
            System.out.println("Correcta 1: ");
            System.out.println("Incorrecta 2: ");
            System.out.println("Sin respuesta 3: ");
            String opcion=Dato.nextLine();
            
            
            switch (opcion){
                
                case "1" -> {
                    
                    total=total+5;
                    
                    
                    System.out.println("SE SUMARON 5 PUNTOS");
                    
                    System.out.println("SE TIENE UN TOTAL DE "+total);
                    
                    
                    
            }
                case "2" -> {
                    
                    total=total-1;
                    
                    
                    System.out.println("SE RESTO 1 PUNTO");
                    
                    System.out.println("SE TIENE UN TOTAL DE "+total);
                    
                    
            }
                case "3" -> {
                    
                    
                    System.out.println("NO SE MODIFICARON LOS PUNTOS");
                    System.out.println("SE TIENE UN TOTAL DE "+total);
                   
                    
                    break;
                    
                }
 
            
            }
                    
            
        }
        System.out.println("Puntaje total es: "+total);
        System.out.println("Las respuestas: "+respuestas);
    }
    
}

