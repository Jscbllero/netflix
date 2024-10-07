package org.example.Modelos;

import java.time.LocalDate;

public class Pelicula {

    private Long id;

    private String nombre;

    private LocalDate fechaEstreno;

    private Integer duracionMinutos;

    private String sinopsis;

    public Pelicula() {
    }

    public Pelicula(Long id, String nombre, LocalDate fechaEstreno, Integer duracionMinutos, String sinopsis) {
        this.id = id;
        this.nombre = nombre;
        this.fechaEstreno = fechaEstreno;
        this.duracionMinutos = duracionMinutos;
        this.sinopsis = sinopsis;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaEstreno() {
        return fechaEstreno;
    }

    public void setFechaEstreno(LocalDate fechaEstreno) {
        this.fechaEstreno = fechaEstreno;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}

