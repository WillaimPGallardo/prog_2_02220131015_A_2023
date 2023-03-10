/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioscondicionales.Condicionales;

import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        double peso;
        int zona;
        double envio;
        
        System.out.println("ingrese la cantidad de kg que desea enviar: ");
        peso=dato.nextDouble();
        
        if (peso > 5) {
            
            System.out.println("ERROR: no se pude enviar el paquete porque supera el peso ");
            System.out.println("Peso minimo 5kg no: "+peso+"Kg ");
            return ;
                  
        }
        
        System.out.println("Ingrese la sona donde se enviara el prodcto.");
        System.out.println("");
        System.out.println("Zona1: America del Norte ");
        System.out.println("");
        System.out.println("Zona2: America Central ");
        System.out.println("");
        System.out.println("Zona3: America del sur");
        System.out.println("");
        System.out.println("Zona4: Europa ");
        System.out.println("");
        System.out.println("Zona5: Asia");
        System.out.println("");
        System.out.println("Dijite el numero de la zona donde enviara: ");
        zona=dato.nextInt();
        
        double costoKg=0;
        
        switch (zona) {
            case 1:
                costoKg = 24;
                break;
            case 2:
                costoKg = 20;
                break;
            case 3:
                costoKg = 21;
                break;
            case 4:
                costoKg = 10;
                break;
            case 5:
                costoKg = 18;
                break;
            
                
                
             
        }
        
        envio = costoKg*peso;
        
        System.out.println("El costo de envío es de " + envio + " euros.");
       
        
        
    }
}

        
    
        
    
        
        
        
          
    
    
    

