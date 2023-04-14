/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package co.edu.udes.tallercine;

import co.edu.udes.tallercine.Movie;
import co.edu.udes.tallercine.Sala;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Sebas
 */
public class Cine {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Sala> salas = new ArrayList<>();
        ArrayList<Ticket> tickets = new ArrayList<>();
        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Confectionery> confectionerys = new ArrayList<>();

        boolean salir = false;

        while (!salir) {
            int menu = mostrarMenu(entrada);
            switch (menu) {

                case 1:
                    if (movies.size() == 0) {
                        System.out.println("No puedes agregar una sala , sin antes no agregar una pelicula");
                        break;
                    } else {
                        agregarSala(entrada, salas, movies);
                        break;
                    }
                case 2:
                    if (salas.size() == 0) {
                        System.out.println("No puedes agregar un ticket , sin antes no agregar una sala");
                        break;
                    } else {
                        agregaTicket(entrada, tickets, salas);
                        break;
                    }
                case 3:
                    agregaPelicula(entrada, movies);
                    break;
                case 4:
                    if (salas.size() == 0) {
                        System.out.println("No puedes agregar un empleado , sin antes no agregar una sala o  la confiteria");
                        break;
                    } else {
                        agregaEmployee(entrada, employees, salas);
                        break;
                    }
                case 5:
                    if (confectionerys.size() == 0) {

                        System.out.println("No puedes agregar un cliente sin una confiteria");
                        break;
                    } else {
                        agregaCustomer(entrada, customers, salas);
                        break;
                    }
                case 6:
                    if (employees.size() == 0) {
                        System.out.println("No puedes agregar confiteria sin empleados");
                        break;
                    } else {

                        agregarConfectionery(entrada, confectionerys, employees);
                        break;

                    }
                case 7:
                    System.out.println(salas.toString());
                    System.out.println(tickets.toString());
                    System.out.println(movies.toString());
                    System.out.println(employees.toString());
                    System.out.println(customers.toString());
                    System.out.println(confectionerys.toString());
            }

        }
    }

    public static int mostrarMenu(Scanner entrada) {
        System.out.println("Bienvenido al Sistema");
        System.out.println("Seleccione un menú:");
        System.out.println("1. Salas");
        System.out.println("2. Tickets");
        System.out.println("3. Peliculas");
        System.out.println("4. Empleado");
        System.out.println("5. Cliente");
        System.out.println("6. Confiteria");
        System.out.println("7. Mostrar");
        System.out.println("8. Salir");
        return entrada.nextInt();
    }

   public static void agregarSala(Scanner entrada, ArrayList<Sala> salas, ArrayList<Movie> movies) {
    System.out.println("Agregue la capacidad de la Sala: ");
    int capacity = entrada.nextInt();
    System.out.println("Agregue el número de sala: ");
    int number_hall = entrada.nextInt();
    entrada.nextLine(); // Limpiar el buffer del scanner
    for (Sala sala : salas) {
        if (sala.getNumber_hall() == number_hall) {
            System.out.println("El número de sala ya existe. Ingrese otro número de sala.");
            return;
        }
    }
    System.out.println("Peliculas disponibles");
    for (int i = 0; i < movies.size(); i++) {
        System.out.printf("%d %s%n", (i + 1), movies.get(i).getName());
    }
    System.out.println("Ingrese el numero de la pelicula deseada: ");
    int selectMovie = entrada.nextInt();
    entrada.nextLine(); // Limpiar el buffer del scanner

    String movieUser;
    movieUser = movies.get(selectMovie - 1).getName();

    salas.add(new Sala(capacity, number_hall, movieUser));
}

public static ArrayList<Movie> agregaPelicula(Scanner entrada, ArrayList<Movie> movies) {
    System.out.println("Agregue el título de la película:");
    String name = entrada.next();
    entrada.nextLine();
    System.out.println("Agregue la hora en formato HH:mm");
    String duration = entrada.next();

    LocalTime localTime;
    try {
        localTime = LocalTime.parse(duration);
    } catch (DateTimeParseException e) {
        System.out.println("Error: Formato de hora incorrecto. Ingrese la hora en formato HH:mm.");
        return movies; // Retornar el arreglo sin agregar la nueva película
    }

    System.out.println("Agregue la fecha de lanzamiento:");
    String release_Date = entrada.next();

    LocalDate localDate;
    try {
        localDate = LocalDate.parse(release_Date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    } catch (DateTimeParseException e) {
        System.out.println("Error: Formato de fecha incorrecto. Ingrese la fecha en formato DD/MM/AAAA.");
        return movies; // Retornar el arreglo sin agregar la nueva película
    }

    System.out.println("Agregue la fecha hasta que estará disponible:");
    String available_dates = entrada.next();

    LocalDate localDate2;
    try {
        localDate2 = LocalDate.parse(available_dates, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    } catch (DateTimeParseException e) {
        System.out.println("Error: Formato de fecha incorrecto. Ingrese la fecha en formato DD/MM/AAAA.");
        return movies; // Retornar el arreglo sin agregar la nueva película
    }

    movies.add(new Movie(name, duration, release_Date, available_dates));

    return movies;
}

public static void agregaTicket(Scanner entrada, ArrayList<Ticket> tickets, ArrayList<Sala> sala) {
    System.out.println("Seleccione la sala: ");
    for (int i = 0; i < sala.size(); i++) {
        System.out.printf("%d. Sala %d: %s%n", (i + 1), sala.get(i).getNumber_hall(), sala.get(i).getMovie());
    }

    int selectedHall = entrada.nextInt();
    entrada.nextLine();

    Sala selectedSala = sala.get(selectedHall - 1);
    String selectedMovie = selectedSala.getMovie();

    System.out.println("Seleccione el asiento (letra");
    
}
public static void listarPeliculas(ArrayList<Movie> movies) {
System.out.println("Listado de películas:");
for (int i = 0; i < movies.size(); i++) {
System.out.println((i + 1) + ". " + movies.get(i).getName());
}
}
public static void listarSalas(ArrayList<Sala> salas) {
    System.out.println("Listado de salas:");
    for (int i = 0; i < salas.size(); i++) {
        System.out.println((i + 1) + ". Sala " + salas.get(i).getNumber_hall() + ": " + salas.get(i).getMovie());
    }
}

public static void listarEmpleados(ArrayList<Employee> employees) {
    System.out.println("Listado de empleados:");
    for (int i = 0; i < employees.size(); i++) {
        System.out.println((i + 1) + ". " + employees.get(i).getName() + ", " + employees.get(i).getId() + ", " + employees.get(i).getSalary() + ", " + employees.get(i).getWorks_area());
    }
}

public static void listarClientes(ArrayList<Customer> customers) {
    System.out.println("Listado de clientes:");
    for (int i = 0; i < customers.size(); i++) {
        System.out.println((i + 1) + ". " + customers.get(i).getName() + ", " + customers.get(i).getId() + ", " + customers.get(i).getCell_number());
    }
}

public static void listarTickets(ArrayList<Ticket> tickets) {
    System.out.println("Listado de tickets:");
    for (int i = 0; i < tickets.size(); i++) {
        System.out.println((i + 1) + ". Película: " + tickets.get(i).getMovie() + ", Sala: " + tickets.get(i).getHall() + ", Asiento: " + tickets.get(i).getSeat() + ", Precio: " + tickets.get(i).getPrice());
    }
}

public static void menu() {
    System.out.println("1. Agregar una sala");
    System.out.println("2. Agregar una película");
    System.out.println("3. Agregar un ticket");
    System.out.println("4. Agregar un empleado");
    System.out.println("5. Agregar un cliente");
    System.out.println("6. Listar películas");
    System.out.println("7. Listar salas");
    System.out.println("8. Listar empleados");
    System.out.println("9. Listar clientes");
    System.out.println("10. Listar tickets");
    System.out.println("11. Salir");
    System.out.println("Ingrese el número de la opción deseada:");
}

    private static void agregaCustomer(Scanner entrada, ArrayList<Customer> customers, ArrayList<Sala> salas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void agregaEmployee(Scanner entrada, ArrayList<Employee> employees, ArrayList<Sala> salas) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void agregarConfectionery(Scanner entrada, ArrayList<Confectionery> confectionerys, ArrayList<Employee> employees) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
