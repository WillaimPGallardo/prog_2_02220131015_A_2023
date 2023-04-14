/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udes.tallercine;

import java.util.Date;


public class Movie {
     private String name;
    private String duration;
    private String release_Date;
    private String available_dates; 

    public Movie() {
    }
    

    public Movie(String name, String duration, String release_Date, String available_dates) {
        this.name = name;
        this.duration = duration;
        this.release_Date = release_Date;
        this.available_dates = available_dates;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRelease_Date() {
        return release_Date;
    }

    public void setRelease_Date(String release_Date) {
        this.release_Date = release_Date;
    }

    public String getAvailable_dates() {
        return available_dates;
    }

    public void setAvailable_dates(String available_dates) {
        this.available_dates = available_dates;
    }

    @Override
    public String toString() {
        return "Movie{" + "nombre=" + name + ", duracion=" + duration + ", Fecha de salida=" + release_Date + ", Fecha disponible=" + available_dates + '}';
    }

}
