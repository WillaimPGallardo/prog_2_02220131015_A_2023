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
public class Punto2 {
    public static void main(String[] args) {
        Scanner Dato = new Scanner (System.in);
        int day;
    
        
        System.out.println("Ingrese la fecha ");
        day = 32;
        
        
        do{
        System.out.println("DIA (MENOR O IGUAL A 31):");
        day=Dato.nextInt();}while(day>31);
        int month= 13;
        
        
        
        do{
            System.out.println("MES (MENOR O IGUAL A 12):");
            month= Dato.nextInt();
        }while(month>12);
        int year=2030;
        
        do{
            System.out.println("AÑO (MENOR O IGUAL A 2029):");
            year=Dato.nextInt();
            
        }while(year>2029);
        int newdays=0;
        switch(month){
        
            case 1:
                newdays=day;
                System.out.println("La fecha es correacta");
                System.out.println("Se a trascurido "+newdays +" dias del año ");
            
            case 2:
                if((year%4)==0){
                if(day>29){
                    System.out.println("La fecha no es correcta ");
                }else{
                    
                    newdays=(31+day);
                    System.out.println("La fecha es correacta");
                    System.out.println("Se a trascurido"+newdays +" dias del año ");
                
                }
                }else{
                if(day>228){
                    System.out.println("LA FECHA ES INCORRECTA");
                }else{
                    
                    newdays=(31+day);
                    System.out.println("LA FECHA ES CORRECTA");
                    System.out.println("Se a trascurido"+newdays +" dias del año ");
                
                }
                }
                
                
            case 3:
                if((year%4)==0){
                newdays=(30*(month-1))+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");}
                else{
                newdays=(30*(month-1))-1+day;
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido"+newdays +" dias del año ");
                }
                
                
                
            case 4:
                if((year%4)==0){
                newdays=(30*(month-1))+1+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");}}
                else{
                newdays=(30*(month-1))+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");
                }}
                
                
            case 5:
                if((year%4)==0){
                newdays=(30*(month-1))+1+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");}
                else{
                newdays=(30*(month-1))+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");
                }
                
                
                
            case 6:
                if((year%4)==0){
                newdays=(30*(month-1))+2+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido  "+newdays +" dias del año ");}}
                else{
                newdays=(30*(month-1))+1+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");
                }}
                
                
            case 7 :
                if((year%4)==0){
                newdays=(30*(month-1))+2+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");}
                else{
                newdays=(30*(month-1))+1+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido  "+newdays +" dias del año ");
                }
                
                
            case 8:
                if((year%4)==0){
                newdays=(30*(month-1))+3+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido  "+newdays +" dias del año ");}
                else{
                newdays=(30*(month-1))+2+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");
                }
                
                
            case 9 :
                if((year%4)==0){
                newdays=(30*(month-1))+4+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");}}
                else{
                newdays=(30*(month-1))+3+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");
                }}
                
                
            case 10:
                if((year%4)==0){
                newdays=(30*(month-1))+4+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");}
                else{
                newdays=(30*(month-1))+3+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");
                }
                
                
            case 11:
                if((year%4)==0){
                newdays=(30*(month-1))+5+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");}}
                else{
                newdays=(30*(month-1))+4+day;
                if(day>30){System.out.println("LA FECHA ES INCORRECTA");}else{
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido"+newdays +" dias del año ");
                }}
                
                
            case 12:
                if((year%4)==0){
                newdays=(30*(month-1))+4+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");}
                else{
                newdays=(30*(month-1))+3+day;
                
                System.out.println("LA FECHA ES CORRECTA");
                System.out.println("Se a trascurido "+newdays +" dias del año ");
                }
        
        }
        
    }
    
}
