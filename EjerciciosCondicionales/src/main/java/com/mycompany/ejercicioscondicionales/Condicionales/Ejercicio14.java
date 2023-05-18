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
public class Ejercicio14 {
    public static void main(String[] args) {
        
        Scanner Dato= new Scanner(System.in);
        
       int dia;
       
       
       try{
        System.out.println("Ingrese el dia de la semana del 1 al 7: ");
        dia=Dato.nextInt();
        
        if (dia < 1 || dia > 7) {
            
            System.out.println("ERROR:la semana no tiene "+dia+" dias.");
            
            return;
            
        }
        
        String diaCorrespondiente = "";
        
        switch (dia) {
            case 1:
                
                diaCorrespondiente = "lunes";
                break;
                
            case 2:
                
                diaCorrespondiente = "martes";
                break;
                
            case 3:
                
                diaCorrespondiente = "miércoles";
                break;
            case 4:
                
                diaCorrespondiente = "jueves";
                break;
            case 5:
                
                diaCorrespondiente = "Viernes";
                break;
                
            case 6:
                
                diaCorrespondiente = "Sabado";
                break;
            case 7:
                
                diaCorrespondiente = "Domingo";
                break;    
        }
        
        System.out.println("El dia de la semana es: "+diaCorrespondiente);
         }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}           
                    
                    
        
        
        
        
        
        
    }
    
}
