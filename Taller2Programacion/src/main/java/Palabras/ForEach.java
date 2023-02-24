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
public class ForEach {
    
    public static void main(String[] args) {
        
       String invertir = "";
       String Palabra;
       Scanner tex = new Scanner(System.in);
       
       System.out.println("Ingrese la palabra que desea invertir: ");
       Palabra= tex.nextLine();
       
       int []W= new int [Palabra.length()];
       int i =Palabra.length();
       
     for(int j:W){
     
     invertir=invertir + Palabra.charAt(i-1);
     
     i--;
     
     
     }
       
    System.out.println("Esta es tu palabara invertida");
       
       System.out.println(invertir);
       
       }
       
    

        
        
    }
    
    
    
    
    
    
    
    
    
    

