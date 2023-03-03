/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicos;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class ejercicio17 {
    public static void main (String[] args){
    Scanner dato = new Scanner(System.in);
    
    int H1;
    int Minutos;
    int Seg;
    int  SegundosV;
    int Horasviaje;
    int Minutosviaje;
    
        System.out.println("Ingrese la hora de salida en Horas: ");
        H1=dato.nextInt();
        
        System.out.println("Ingrese la hora de salida pero en MINUTOS: ");
        Minutos=dato.nextInt();
        
        System.out.println("Ingrese la hora de salida pero en SEGUNDOS");
        Seg=dato.nextInt();
        
        System.out.println("Duracion del viaje en SEGUNDOS");
        SegundosV=dato.nextInt();
        
        
        

        Horasviaje=SegundosV/3600;
        
        Minutosviaje=(SegundosV%3600)/60;
        
        SegundosV=(SegundosV%3600)%60;
        
        
        
        
        System.out.println("El viaje dura: "+Horasviaje+" en horas, "+Minutosviaje+" en minutos y "+SegundosV+" en segundos");
        
        int Horallegada;
        int Minutosllegada;
        int Segundosllegada;  
        
        Horallegada = H1+Horasviaje;
        Minutosllegada = Minutos+Minutosviaje;
        
        Segundosllegada = Seg+SegundosV;
        
        
        System.out.println("Llego a las: "+Horallegada+" en horas, "+Minutosllegada+" en minutos y "+Segundosllegada+" en segundos.");
    }    
}
    
    

