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
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        double total;
        double recargo;
        int mañana;
        int tarde;
        
        int domingo;
        double minuto;
        double minutos;
        int segundos;
        
        
        
         System.out.println("Es domingo?");
         System.out.println("1=Si y 0=No");
         domingo=dato.nextInt();
 
         System.out.println("Es turno de la mañana?");
         System.out.println("1=Si y 0=No");
         mañana=dato.nextInt();
           
        System.out.println("Es turno de la tarde?");
        System.out.println("1=Si y 0=No");
        tarde=dato.nextInt();
             
         
        
         System.out.println("INGRESE EL TOTAL DE MINUTOS DE LA LLAMADA");
         minuto=dato.nextDouble();
         
         System.out.println("INGRESE EL NUMERO DE SEGUNDOS");
         segundos=dato.nextInt();
         
         
         minutos=minuto+segundos;
         
         total=0;
         if(minutos==5){
         total=total+1;
         
         }
         if(minutos<5){
         total=total+1;
         
         }
         if(minutos>5){
         total=total+0.80;
         
         }
         if(minutos>8){
         total=total+0.7;
         
         }
         if(minutos>10){
         total=total+0.5;
         
         }
         
         if(domingo==1){
             
             recargo=(3*total)/100;
             total=total+recargo;
             
         }
         
         if(mañana==1&&domingo==0){
            recargo=(15*total)/100; 
            total=total+recargo;
            
         }
         if(tarde==1&&domingo==0){
            recargo=(10*total)/100; 
            total=total+recargo;
            
         }
         
         System.out.println("La llamda duro: "+minuto+" minutos y "+segundos+" Segundos, su total a pagar es de "+total+" segun los recargos ");
        
        
        
      
        
    }
    
}
