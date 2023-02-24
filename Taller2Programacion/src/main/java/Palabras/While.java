/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Palabras;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class While {
    
    
    public static void main(String[] args) {
        
       String invertir = "";
       String Palabra;
       Scanner tex = new Scanner(System.in);
       int Contador;
       
       
       
       
       
     System.out.println("Ingrese la palabra que desea invertir: ");
     Palabra= tex.nextLine();
     Contador=Palabra.length();
     
     while(Contador!=0){
         
         invertir=invertir + Palabra.charAt(Contador-1);
         Contador--;
         
     
     
     }
      
     
     
     System.out.println("Esta es tu palabara invertida: ");
       
       System.out.println(invertir);
    
    
    
 
    
    }
       
       
          
       
}
