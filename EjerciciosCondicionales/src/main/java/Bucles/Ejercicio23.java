/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio23 {
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        
        int pago;
        int plazo;
        try{
        System.out.println("Ingrese el plazo de la compra (meses) ");
        plazo = Dato.nextInt();
        
        System.out.println("Ingrese el pago del primer mes");
        pago=Dato.nextInt();
        
        for(int i=1 ;i<plazo;i++){
            
        pago=pago+pago;
        
        }
        System.out.println("Se pagara un total de: "+pago+" Euros.");
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
        
    
}
