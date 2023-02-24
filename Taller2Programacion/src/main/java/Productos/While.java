/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Productos;

import java.util.Random;
import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        
        
        
        Random numero = new Random();
        int Numero;
        Numero=numero.nextInt(22)+1;
        int Num = Numero;
        
        String [] Productos= new String[Num];
        String [] Precio = new String[Num];
        String [] Cantidad = new String[Num];
        Scanner dato= new Scanner(System.in);
       
       
       
      
        System.out.println("El numero de Productos que debes ingrasar son: "+ Numero );
        System.out.println("Debera ingresar el nombre del Producto             | ");
        System.out.println("Debera ingresar el precio del producto             | ");     
        System.out.println("Debera ingresar la cantidad que lleva del producto V ");  
        
        int W =0;
        int i=0;
        while(i!=Num){
        W++;
           System.out.println("Ingrese el nombre del Producto: "+W);
           Productos[i]=dato.nextLine();
           
           System.out.println("Ingrese el precio del producto:  ");
           Precio[i]=dato.nextLine();
           
           System.out.println("Ingrese la cantidad que lleva del producto:  ");
           Cantidad[i]=dato.nextLine();
         i++;
 
        }
        System.out.println("");
        System.out.println("");
        System.out.println("--------FACTURA--------");
        System.out.println("");
        System.out.println("");
        System.out.println("Su factura segun los productos Digitados:  ");
        W=0;
        i=0;
        while(i!=Num){
        
        
        W++;
        System.out.println("Producto Numero: "+W+ " = "+Productos[i]+" Precio: $"+Precio[i]+" Cantidad: "+Cantidad[i]);
        i++;
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
