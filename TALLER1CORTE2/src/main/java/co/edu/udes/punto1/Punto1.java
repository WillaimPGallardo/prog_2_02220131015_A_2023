/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.udes.punto1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Punto1 {

    public static void main(String[] args) {
        
        Scanner Dato = new Scanner(System.in);
        System.out.println("Ingresa un número entero que representa el tiempo en segundos: ");
        int tiempoSegundos = Dato.nextInt();
        
        int dias = tiempoSegundos / 86400;
        tiempoSegundos = tiempoSegundos % 86400;
        
        int horas = tiempoSegundos / 3600;
        tiempoSegundos = tiempoSegundos % 3600;
        
        int minutos = tiempoSegundos / 60;
        tiempoSegundos = tiempoSegundos % 60;
        
        int segundos = tiempoSegundos;
        
        
        int horas12 = horas % 12;
        String ampm = horas < 12 ? "AM" : "PM";
        
        System.out.println("Tiempo equivalente en formato de 24 horas: " + dias + "d " + horas + "h " + minutos + "m " + segundos + "s");
        System.out.println("Tiempo equivalente en formato de 12 horas: " + dias + "d " + horas12 + "h " + minutos + "m " + segundos + "s " + ampm);
    }
}
        
    



