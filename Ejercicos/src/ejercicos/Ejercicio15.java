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
public class Ejercicio15 {
    public static void main(String[] args) {
    
    Scanner dato= new Scanner(System.in);
    
    
    int num1;
    
    int num2;
    
    int num3;
    
    int num4;
    
    System.out.println("INGRESE UN NUMERO A");
    num1=dato.nextInt();
    
    System.out.println("INGRESE UN NUMERO B");
    num2=dato.nextInt();
    
    
    num4=num2;
    
    num3=num1;
    
    num1=(num1-num1)+num4;
    
    num2=(num2-num2)+num3;
    
    
    
    
    
        System.out.println("EL NUMERO A ("+num3+") AHORA VALE "+num1);
        System.out.println("EL NUMERO B ("+num4+") AHORA VALE "+num2);
    
    
    
    
    
    
    
    
    
    }
}
    
