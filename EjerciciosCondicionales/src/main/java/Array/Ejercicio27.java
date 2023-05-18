/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio27 {
    
    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        int[] numeros = new int[10];

        try{
        System.out.println("Ingrese 10 números:");
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = Dato.nextInt();
        }

        
        System.out.println("Los números ingresados en orden inverso son:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
        
    }
    
}
