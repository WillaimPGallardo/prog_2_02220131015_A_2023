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
public class punto3 {
    public static void main(String[] args) {
         
    Scanner Dato = new Scanner (System.in);
    int contar=0;
    
    try{
    System.out.println("INGRESE EL NUMERO DE LATAS");
    int latas= Dato.nextInt();
    
    for(int i=0; contar<latas;i++){
    contar=contar+(i+1);
        System.out.println(i+1);
        
    if(contar>latas){
    contar = contar-(i+1);
        System.out.println("NO SE PUEDEN APILAR EXACTAMENTE "+latas+" LATAS");
        System.out.println("EL NUMERO MAXIMO QUE SE PODRIA APLIAR DE ESTAS LATAS ES DE "+contar);
        System.out.println(i+1);
        break;
    }
    
    if(contar==latas){
        System.out.println("SE PUEDEN APLICAR LAS "+latas+" LATAS SIN QUE SOBRE NINGUNA");
    }
}}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
}
    

