/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.tallercine;

import java.util.ArrayList;


public class Sala {
     private int capacity;
    private int number_hall;
    private String movie;
   private ArrayList<Ticket> tickets = new ArrayList<Ticket>();

public ArrayList<Ticket> getTickets() {
    return tickets;
}

    public Sala(int capacity, int number_hall, String movie) {
        this.capacity = capacity;
        this.number_hall = number_hall;
        this.movie = movie;
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNumber_hall() {
        return number_hall;
    }

    public void setNumber_hall(int number_hall) {
        this.number_hall = number_hall;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    @Override
    public String toString() {
        return "Sala{" + "Capacidad=" + capacity + ", Numero de sala=" + number_hall + ", Pelicula=" + movie + '}';
    }  

    Object getSeat(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getConfectioneries() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
