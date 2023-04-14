/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Co.edu.udes;

import java.util.ArrayList;
import java.util.Scanner;


public class superm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Productss> Productss = new ArrayList<>();
        ArrayList<Customerss> Customerss = new ArrayList<>();

        System.out.println("Bienvenido al supermercado");

        int date = 0;
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Administrar productos");
            System.out.println("2. Administrar clientes");
            System.out.println("3. Salir");
            date = sc.nextInt();

            switch (date) {
                case 1:
                    administrarProductos(sc, Productss);
                    break;
                case 2:
                    administrarClientes(sc, Customerss);
                    break;
                case 3:
                    System.out.println("¡Gracias por su visita!");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (date != 3);
    }

    public static void administrarProductos(Scanner sc, ArrayList<Productss> productos) {
        int opcion = 0;
        do {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Ver productos");
            System.out.println("4. Volver");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    agregarProducto(sc, productos);
                    break;
                case 2:
                    eliminarProducto(sc, productos);
                    break;
                case 3:
                    verProductos(productos);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }
        } while (opcion != 4);
    }

    public static void agregarProducto(Scanner sc, ArrayList<Productss> productos) {
        System.out.println("Ingrese el nombre del producto:");
        String nombre = sc.next();

        System.out.println("Ingrese el precio del producto:");
        double precio = sc.nextDouble();

        System.out.println("Ingrese la cantidad del producto:");
        int cantidad = sc.nextInt();

        productos.add(new Productss(nombre, precio, cantidad));
        System.out.println("Producto agregado exitosamente");
    }

    public static void eliminarProducto(Scanner sc, ArrayList<Productss> productos) {
        System.out.println("Ingrese el nombre del producto a eliminar:");
        String nombre = sc.next();

        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getName().equalsIgnoreCase(nombre)) {
                productos.remove(i);
                System.out.println("Producto eliminado exitosamente");
                return;
            }
        }

        System.out.println("No se encontró ningún producto con ese nombre");
    }

    public static void verProductos(ArrayList<Productss> productos) {
        System.out.println("Lista de productos:");

        for (Productss p : productos) {
            System.out.println(p);
        }
    }

    public static void administrarClientes(Scanner sc, ArrayList<Customerss> Customerss) {
    int opcion = 0;
    do {
        System.out.println("¿Qué desea hacer?");
        System.out.println("1. Agregar cliente");
        System.out.println("2. Eliminar cliente");
        System.out.println("3. Ver clientes");
        System.out.println("4. Volver");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                agregarClientes(sc, Customerss);
                break;

            case 2:
                eliminarClientes(sc, Customerss);
                break;

            case 3:
                verClientes(Customerss);
                break;

            case 4:
                System.out.println("Volviendo al menú principal");
                break;

            default:
                System.out.println("Ingrese una opción válida");
                break;
        } 
    } while (opcion != 4);
}

public static void agregarClientes(Scanner sc, ArrayList<Customerss> clientes) {
    System.out.println("Ingrese el nombre del cliente:");
    String nombre = sc.next();

    System.out.println("Ingrese el correo electrónico del cliente:");
    String correo = sc.next();

    System.out.println("Ingrese el número de teléfono del cliente:");
    String telefono = sc.next();

    clientes.add(new Customerss(nombre, correo, telefono));
    System.out.println("Cliente agregado exitosamente");
}

        public static void eliminarClientes(Scanner sc, ArrayList<Customerss> clientes) {
            System.out.println("Ingrese el correo electrónico del cliente a eliminar:");
            String correo = sc.next();

            for (int i = 0; i < clientes.size(); i++) {
                if (clientes.get(i).getMail().equalsIgnoreCase(correo)) {
                    clientes.remove(i);
                    System.out.println("Cliente eliminado exitosamente");
                    return;
                }
            }

            System.out.println("No se encontró ningún cliente con ese correo electrónico");
        }

        public static void verClientes(ArrayList<Customerss> clientes) {
            System.out.println("Lista de clientes:");

            for (Customerss c : clientes) {
                System.out.println(c);
            }
        } 
}    


    




