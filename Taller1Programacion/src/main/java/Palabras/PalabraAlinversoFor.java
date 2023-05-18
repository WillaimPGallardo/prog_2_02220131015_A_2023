
package Palabras;

import java.util.Scanner;


public class PalabraAlinversoFor {

    public static void main(String[] args) {
        
       String invertir = "";
       String Palabra;
       Scanner tex = new Scanner(System.in);
       
       try{
       
       System.out.println("Ingrese la palabra que desea invertir: ");
       Palabra= tex.nextLine();
       
       for(int contador = Palabra.length()-1; contador>=0; contador--){
       
       invertir= invertir + Palabra.charAt(contador);
       
       
     
       }
       System.out.println("Esta es tu palabara invertida");
       
       System.out.println(invertir);

        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
        
    }
}
