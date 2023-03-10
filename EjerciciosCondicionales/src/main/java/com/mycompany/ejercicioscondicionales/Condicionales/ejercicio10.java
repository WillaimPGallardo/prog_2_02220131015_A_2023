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
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner Dato = new Scanner(System.in);
        double preciofinal; 
        double precioinicial;
        int tamaño;
        int tipo;
        
        System.out.println("Ingrese el precio del kilo de uva");
        precioinicial=Dato.nextDouble();
        
        System.out.println("Ingrese el tamaño de la uva(1 O 2)");
        tamaño=Dato.nextInt();
        
        System.out.println("Ingrese el tipo de la uva(TIPO A O B)");
        System.out.println("1=A y 0=B");
        tipo=Dato.nextInt();
        
        if(tipo==1&&tamaño==1){
            
        preciofinal=precioinicial+0.20;
            System.out.println("El Precio De La Entrega Del Kilo De Uva Es De "+preciofinal);
            
        }
        if(tipo==1&&tamaño==2){
            
        preciofinal=precioinicial+0.30;
            System.out.println("El Precio De La Entrega Del Kilo De Uva Es De "+preciofinal);
            
        }
        if(tipo==0&&tamaño==1){
            
        preciofinal=precioinicial-0.30;
            System.out.println("El Precio De La Entrega Del Kilo De Uva Es De "+preciofinal);
            
        }
        if(tipo==0&&tamaño==2){
            
        preciofinal=precioinicial-0.50;
            System.out.println("El Precio De La Entrega Del Kilo De Uva Es De "+preciofinal);
            
        }
    }
}
        
    
    

