/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.udes.TALLER1;

import java.util.List;
import java.util.*;


public class Taller1_P3 {

    public static void main(String[] args) {
        
        
        Secretario secretario1 = new Secretario("W", "P", 1040457200, "", 222352481, 1000000, "Despacho 1", "234");
        Secretario secretario2 = new Secretario("L", "G", 1094004572, "", 921888871, 3000, "Despacho 2", "8889");

        
        
        Coche carro1 = new Coche("AAA 32O", "Chevrolet", "Aveo");
        Coche carro2 = new Coche("HAA 555", "Suzuki", "New Baleno");
        Coche carro3 = new Coche("CRL 200", "Renault", "Logan");
        Vendedor vendedor1 = new Vendedor("P ", "G", 82555523, "L", 04144563112, 100000, carro3, "Zona 3", 20);
        Vendedor vendedor2 = new Vendedor("O", "D", 333232425, "C", 213213213, 350023, carro1, "Zona 4", 15);

        
        List<Vendedor> vendedores = new ArrayList<>();
        vendedores.add(vendedor2);

        
        JefeZona jz1 = new JefeZona(secretario2, carro2, vendedores, "William", "Peña", 1237412365, "Ceiba", 302444943, 33500);

       
        System.out.println("Datos de los empleados:");
        System.out.println("----------------");
        System.out.println("----------------");
        System.out.println("Secreatarios: \n");
        secretario1.imprimir();
        
        
        System.out.println("----------------");
        System.out.println("----------------");
        secretario2.imprimir();
        
      
        System.out.println("Vendedores: \n");
        vendedor1.imprimir();
        
        System.out.println("----------------");
        vendedor2.imprimir();
        System.out.println("----------------");
        System.out.println("");
        
        System.out.println("Jefe de zona: \n");
        jz1.imprimir();
        System.out.println("----------------");

       
        System.out.println("Cambio de el supervisor " + vendedor1.getNombre() + ":");
        vendedor1.cambiarSupervisor(secretario2);
        
        System.out.println("Nuevo Supervisor: " + vendedor1 + ": " + vendedor1.getSupervisor().getNombre());
        System.out.println("----------------");

        
        System.out.println("INCREMENTO DE SALARIO: ");
        secretario1.incrementarSalario(100);
        vendedor2.incrementarSalario(200);
        jz1.incrementarSalario(400);
        System.out.println("----------------");

        System.out.println("Nuevos salarios segun el incremento al empleado:");
        System.out.println("----------------");
        secretario1.imprimir();
        
        System.out.println("----------------");
        vendedor2.imprimir();
        
        System.out.println("----------------");
        jz1.imprimir();
        System.out.println("----------------");

        System.out.println("Cambio de carro de: " + vendedor1.getNombre() + ":");
        vendedor1.cambiarCoche(carro2);
        System.out.println("Nuevo carro de " + vendedor1.getNombre() + ": " + vendedor1.getCoche().getMatricula() + " " + vendedor1.getCoche().getMarca() + " " + vendedor1.getCoche().getModelo());
        
        System.out.println("Cambio de carro de: "+ jz1.getNombre()+ ":");
        jz1.cambiarCoche(carro3);
        System.out.println("Nuevo carro de: "+jz1.getNombre()+":"+ jz1.getCoche().getMatricula()+" "+jz1.getCoche().getMarca()+" "+jz1.getCoche().getModelo());

        

    }
}
