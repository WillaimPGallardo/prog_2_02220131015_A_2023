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
public class Ejercicos5 {
    public static void main(String[] args) {
    
    Scanner datos= new Scanner(System.in);
    float Fahrenheit;
    
    float GradosCelsios;
    float hipotenusa;
        System.out.println("Ingrese el numero Fahrenheit : ");
        Fahrenheit=datos.nextFloat();
        
        GradosCelsios=(Fahrenheit-32)*(5/9);
        
        System.out.println("Sus grados celsios son  "+GradosCelsios);
       
        
         
    
    
    
    }
    
}
