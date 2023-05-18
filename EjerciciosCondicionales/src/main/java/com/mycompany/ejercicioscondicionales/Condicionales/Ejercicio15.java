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
public class Ejercicio15 {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        int mes;
        int dias;
        
        
        try{
        System.out.println("Ingrese el mes del 1-12");
        
        System.out.println("Ingrese el numero del mes que desea saber sus dias:  ");
        mes=dato.nextInt();
        
       if (mes < 1 || mes > 12) {
            
            System.out.println("ERROR:no hay mes: "+mes);
            
            return;
            
        }
       
       
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
                
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
                
            case 2:
                dias = 28;
                break;
            default:
                
            return;
                
            
        }
        System.out.println("El mes "+mes+" tiene "+ dias+" dias.");
        
        
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
        
        
        
           
    }
   
 
    
}
