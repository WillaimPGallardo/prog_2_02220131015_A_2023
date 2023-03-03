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
public class Ejercicos4 {
    
    public static void main(String[] args) {
    
    Scanner datos= new Scanner(System.in);
    float NumB;
    float NumA;
    float Suma;
    float Resta;
    float division;
    float multiplicacion;
    
    
        System.out.println("Ingrese un numero A: ");
        NumA=datos.nextFloat();
        System.out.println("Ingrese un numero B: ");
        NumB=datos.nextFloat();
        
        Suma= NumA+NumB;
        Resta = NumA-NumB;
        division= NumA/NumB;
        multiplicacion= NumA*NumB;
        if (NumB ==0) {
            System.out.println("no se puede dividir por 0");
            
        }
            
        
        
       
       System.out.println("Esta es su suma : "+Suma);
       System.out.println("Esta es su resta: "+Resta);
       System.out.println("Esta es su multiplicacion: "+multiplicacion);
       System.out.println("Esta es su division: "+division);
    }
         
    
    
    
    }
    
    


