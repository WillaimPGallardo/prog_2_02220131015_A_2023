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
public class Ejercicios14 {
    public static void main(String[] args) {
    
    Scanner dato= new Scanner(System.in);
    
    int num1;
    int invertido = 0;
    int numeros;
        
   
    System.out.println("INGRSE UN NUMERO DE DOS CIFRAS");
    num1=dato.nextInt();
    
    while( num1 > 0 ) {
        
         numeros = num1 % 10;
         
         invertido = invertido * 10 + numeros;
         
         
         num1 /= 10;
         
      }
 
    
      System.out.println( "Número invertido: " + invertido );
   }
    
  
   
        
        
     
        
   
        
    
        
      
    }

   

    
    

    

