/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicos;

import java.util.Scanner;

/**
 *
 * @author LabSispc02
 */
public class Ejercicos10 {
    public static void main(String[] args) {
    
    Scanner Parcial= new Scanner(System.in);
    
  
    
    float Califi1;
    float Califi2;
    float Califi3;
    float ExamenFinal;
    float TrabajoFinal;
    float parcial;
    float CaliFinal;
    float TrabajoFin;
    float Notafinal;
    
        System.out.println("Ingrese la primera calificacion 1 : ");
        Califi1=Parcial.nextFloat();
        System.out.println("Ingrese la primera calificacion 2 : ");
        Califi2=Parcial.nextFloat();
        System.out.println("Ingrese la primera calificacion 3 : ");
        Califi3=Parcial.nextFloat();
        System.out.println("Nota del Examne  final: ");
        ExamenFinal=Parcial.nextFloat();
        System.out.println("Nota del Trabajo Final: ");
        TrabajoFinal=Parcial.nextFloat();
        
        parcial=((Califi1+Califi2+Califi3)*55)/100;
        
        CaliFinal=(ExamenFinal*30)/100;
        
        TrabajoFin=(TrabajoFinal*15)/100;
        
        Notafinal=(parcial+CaliFinal+TrabajoFin);
        
        System.out.println("La calaificacion dinal de la materia algoritmos es: "+Notafinal);
        
        
     
        
   
        
    
        
        
        
   
    
    
    }
    
}
