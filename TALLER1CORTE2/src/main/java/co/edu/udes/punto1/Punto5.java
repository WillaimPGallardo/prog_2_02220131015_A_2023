/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.punto1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Punto5 {
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner (System.in);
    
        int num;
        int alineacion;
        try{
        System.out.println("Ingrase la altura del triangulo");
        num = Dato.nextInt();
        
        System.out.println("Que aliniasion quiere para el triangulo");
        System.out.println("1.IZQUIERDA 2.DERECHA");
        alineacion=Dato.nextInt();
        
        
        if(alineacion==2){
        for(int fila=0;fila<num;fila++){

            for(int a=fila;a<num;a++){
                System.out.print(" ");
                
            }
            
            for(int asterisco = 0;asterisco<=fila;asterisco++){
            System.out.print("*");
            
        }
            System.out.println("\n");
        }

        }
        
        if(alineacion==1){
        for(int fila=0;fila<num;fila++){
            
            for(int asterisco = 0;asterisco<=fila;asterisco++){
            System.out.print("*");
            
        }
            
            for(int a=fila;a<num;a++){
                System.out.print(" ");
                
            }
            
            System.out.println("\n");
        }
        
    }
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
}

    

