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
public class Ejercicio16 {
    public static void main(String[] args) {
    
   Scanner dato= new Scanner(System.in);
   
   int distancia;
   int vel1;
   int vel2;
   int dif;
   
   float x, minutos;
    

        System.out.println("Ingrese la distancia a la que se encuentran los vehiculos (km): ");
        distancia=dato.nextInt();
        
        System.out.println("Ingrese la velocidad del primer carro (km/h): ");
        vel1=dato.nextInt();
        
        System.out.println("Ingrese la velocidad del segundo carro (km/h): ");
        vel2=dato.nextInt();
        
        
        
        if(vel1<vel2){
            
            
            
            dif=vel2-vel1;
            
            x=distancia/dif;
            
            minutos=x*60;
            
            
            System.out.println("El segundo carro alcanzo al primero en: " +minutos+" si matienen la misma velosidad ");
            
        
        }else{
            
            
            
            System.out.println("La velocidad del segundo carro es menor");
            System.out.println("No podra ser alcanzado");
        }
    
   }    
}
    

