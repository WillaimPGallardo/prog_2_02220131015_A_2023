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
public class Ejercicos7 {
    public static void main(String[] args) {
    
    Scanner datos= new Scanner(System.in);
    int Minutos;
    int Hora;
    int Min;
    
   
    
    
        System.out.println("Ingrese los minutos: ");
        Minutos=datos.nextInt();
        
        
        Hora= (Minutos)/60;
        Min=Minutos%60;
        
        
        System.out.println("Estan son las horas que lleva : "+Hora+" ---- "+" Minutos rsteantes son: "+Min);
       
        
         
    
    
    
    }
    
}
