
package Palabras;

import java.util.Scanner;


public class PalabraAlinversoFor {

    public static void main(String[] args) {
        
       String invertir = "";
       String Palabra;
       Scanner tex = new Scanner(System.in);
       
       System.out.println("Ingrese la palabra que desea invertir: ");
       Palabra= tex.nextLine();
       
       for(int contador = Palabra.length()-1; contador>=0; contador--){
       
       invertir= invertir + Palabra.charAt(contador);
       
       
     
       }
       System.out.println("Esta es tu palabara invertida");
       
       System.out.println(invertir);

        
        
    }
}
