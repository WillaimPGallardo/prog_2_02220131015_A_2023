/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tablamultiplicadorawjdpg;



public class TablaMultiplicadoraFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int NumA =(int)(Math.random()*2023+1);
        int NumB =(int)(Math.random()*2023+1);
        
        try{
        
        System.out.println("Esta es la tabla de multiplicar con el For");
        System.out.println("Numeros Ramdos");
        
        System.out.println("A:"+NumA+" B:"+NumB);
        
        for(int i= 0; i<=NumB; i++){
            
         int Resultado1 = NumA * i;
        System.out.println(NumA+" x "+i+" = "+Resultado1 );
        
        
        
        }
        
        }
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}
    }
    
}
