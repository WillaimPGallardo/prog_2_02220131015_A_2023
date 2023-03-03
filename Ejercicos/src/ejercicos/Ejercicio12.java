
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Ejercicio12 {
    public static void main(String[] args) {
    
    Scanner dato= new Scanner(System.in);
    
    double x1;
    double x2;
    double y1;
    double y2;
    
    double Distancia;
    
        System.out.println("Ingrese el punto X1: ");
        x1=dato.nextDouble();
        System.out.println("Ingrese el punto y1: ");
        y1=dato.nextDouble();
        System.out.println("Ingrese el punto X2: ");
        x2=dato.nextDouble();
        System.out.println("Ingrese el punto y2: ");
        y2=dato.nextDouble();
     
 
    Distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        
        System.out.println("La distancia de los puntos son de: "+Distancia);
    
  
   
        
        
     
        
   
        
    
        
      
    }

   

    
    
}

    

