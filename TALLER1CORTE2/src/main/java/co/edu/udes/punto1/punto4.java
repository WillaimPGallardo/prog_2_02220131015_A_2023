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
public class punto4 {
    public static void main(String[] args) {
        Scanner Dato = new Scanner (System.in);
        
        int num;
        int Serie=0;
        int seg=1;
        try{
        System.out.println("Ingrese la cantidad que desea ver en la serie ");
        num = Dato.nextInt();
        
        System.out.println("-----------------------------------------------");
        
        for(int i=0;i<num;i++){
        
        int fibonacci=Serie+seg;
        System.out.println(fibonacci);
        Serie = seg;
        seg= fibonacci;
        
        }
        
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
}
        
      
        
        
    
     
      
      

    
    
    
