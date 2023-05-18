/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package MediModaMediana;
 
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MediModaMedianaFor {

    public static void main(String[] args) {
        
        Random numero = new Random();
        int Numero;
        Numero=numero.nextInt(15)+1;
        int [] Dato =new int[Numero] ;
        Scanner tex = new Scanner(System.in);
        
        int Mediana=0;
        double Promedio=0;
        double sumadepromedio=0;
        try{
        
        
        System.out.println("La lista sera de : "+ Numero );
        
        
        for (int i = 0; i <Dato.length; i++) {
            
            System.out.println("Dijite un numero: #"+(i+1));
            Dato[i]=tex.nextInt();
            
            sumadepromedio=sumadepromedio + Dato [i];
               
        }
        
        Promedio= sumadepromedio/Numero;
        Arrays.sort(Dato);
        
        System.out.println("Promedio de los numeros "+Promedio);
        
        if (Dato.length%2==0) {
            Mediana= Dato[(Numero/2)+1]+ Dato[Numero/2];
            
            Mediana = Mediana/2;
            
        } else {
            
            Mediana=Dato[Numero/2];
            
            
        }
        
        System.out.println("Mediana de la lista es: "+Mediana);
        
        
        
  
        
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
        
        
    }
}
