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
public class Ejercicio20 {
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);   
     
        
        int euro1,euro2;
        float centimos50,centimos20,centimos10;
        float total = 0;
        
        
        
        System.out.println("Ingrese la cantidad de monedas de 2 euros");
        euro2=lectura.nextInt();
        
        int totaleuro2=euro2*2;
        total=total+totaleuro2;
        System.out.println("Total de monedad de 2 Euros es:  "+totaleuro2);
        
        
        System.out.println("Ingrese la cantidad de monedas de 1 euro");
        euro1=lectura.nextInt();
        
        total=total+euro1;
        System.out.println("Total de monedad de 1 Euros es: "+euro1);
        System.out.println("Ingrese la cantidad de monedas de 50 euros: ");
        centimos50=lectura.nextFloat();
        
        
        float totalcentimos50=(centimos50*50)/100;
        total=total+totalcentimos50;
        System.out.println("Total de monedad de 50 Euros es: "+totalcentimos50);
        
        System.out.println("Ingrese la cantidad de monedas de 20 euros: ");
        centimos20=lectura.nextFloat();
        
      
        float totalcentimos20=(centimos20*20)/100;
        total=total+totalcentimos20;
        
        
        System.out.println("Total de monedad de 20 Euros es: "+totalcentimos20);
        System.out.println("Ingrese la cantidad de monedas de 10 euros: ");
    
        centimos10=lectura.nextFloat();
        float totalcentimos10=(centimos10*10)/100;
       
        total=total+totalcentimos10;
        
        
        System.out.println("Total de monedad de 10 Euros es: "+totalcentimos10);
        
        
        
        
        
        System.out.println("El total de dinero en Euros es de:  "+total);
        
        float Centimos =(total*100);
                
         System.out.println("En centimos equivale a: "+Centimos);
        
}
}
    

