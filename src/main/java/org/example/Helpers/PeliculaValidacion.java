package org.example.Helpers;

import org.example.Modelos.Pelicula;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PeliculaValidacion {


    //referente a como se valida
    //se traerá otra clase, esto se llama "Inyeccion de dependencias"

    private Pelicula pelicula=new Pelicula();

    //implementacion de metodos para validar informacion

    public boolean validarId(Integer id){

        //id no puede ser un numero negativo
        //id no puede ser mayor a 5 millones

        if(id<0){
            return false;
        }else if (id>5000000){
            return false;
        }else{
            return true;
        }

    }

    public boolean validarNombre(String nombre){

        //se prohiben los numeros
        //se prohiben caracteres especiales

        return true;
    }

    public boolean validarFecha(LocalDate fecha){

        //peliculas anteriores a 1920

        Long diferencia;
        int anio= fecha.getYear();
        if (anio<1920){
            return false;
        }else{
        return true;
    }

    public boolean validarDuracion(Integer duracion){

        //peliculas prohibidas i duran más de 200 min
            if(duracion > 200){
                return false;
            }else{
        return true;
    }

    public boolean validarSinopsis(String sinopsis){

        //No debe ser menor a 100 caracteres
        //no debe tener más de 500 caracteres

            if (sinopsis.length()<100 || sinopsis.length()>500){
                return false;
            }else{
        return true;
    }
}
