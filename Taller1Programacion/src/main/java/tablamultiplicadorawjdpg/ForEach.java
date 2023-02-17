/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablamultiplicadorawjdpg;



/**
 *
 * @author usuario
 */
public class ForEach {
    
    public static void main(String[] args) {
        
        int NumA =(int)(Math.random()*2023+1);
        int NumB =(int)(Math.random()*2023+1);
        int [] arrayN = new int [NumB];
        
        
        System.out.println("Esta es la tabla de multiplicar con el Do While");
        System.out.println("Numeros Ramdos");
        
        System.out.println("A:"+NumA+" B:"+NumB);
        
        
        for(int w: arrayN){
            
            w++;
            int i = 0;
            arrayN[i]=NumB*i;
            
            System.out.println(NumB+" x "+w+" = "+arrayN[i]);
            

        
        }
        
    
    
    
    
    
    
    
    
    }

   
    
}
