/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bucles;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        
        int numeroAdivinar;
        numeroAdivinar = new Random().nextInt(100) + 1;
        int intentos = 10;
      
        int numeroUsuario;
        
        try{

        do {
            String mensaje = "Adivina un número del 1 al 100.\n"
                    + "Intentos restantes: " + intentos;
            
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            intentos--;

            if (numeroUsuario > numeroAdivinar) {
                
                JOptionPane.showMessageDialog(null, "El número a adivinar es menor.");
                
            } else if (numeroUsuario < numeroAdivinar) {
                
                JOptionPane.showMessageDialog(null, "El número a adivinar es mayor.");
                
            } else {
                
                JOptionPane.showMessageDialog(null, "¡Felicidades! Has acertado en " + (10 - intentos) + " intentos.");
                
            }

        } while (numeroUsuario != numeroAdivinar && intentos > 0);

        if (intentos == 0) {
            
            JOptionPane.showMessageDialog(null, "Lo siento, has agotado tus intentos. El número a adivinar era: " + numeroAdivinar);
        }
        
        
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
    
}
