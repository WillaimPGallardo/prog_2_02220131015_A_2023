/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablamultiplicadorawjdpg;


public class While {
    
    public static void main(String[] args) {
        
        int NumA =(int)(Math.random()*2023+1);
        int NumB =(int)(Math.random()*2023+1);
        
        try{
        
        System.out.println("Esta es la tabla de multiplicar con el While");
        System.out.println("Numeros Ramdos");
        
        System.out.println("A:"+NumA+" B:"+NumB);
        
      while(NumA !=NumB){
      
       NumB++;
       
       int Resultado = NumA*NumB;
       
       System.out.println(NumA+" x "+NumB+" = ");
          
      
      }
        
}
catch(Exception e){
    System.out.println("Haz cometido un error, vuelve a intentarlo");

    main(args);

}












}
    
   
}

