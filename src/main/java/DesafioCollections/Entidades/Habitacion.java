package DesafioCollections.Entidades;

import java.time.LocalDate;

public class Habitacion {
    //Habitacion (Numero de habitacion, fecha de ocupacion si tuviera)
    private Integer numero;
    private LocalDate fecha;

    public Habitacion() {
    }

    public Habitacion(Integer numero, LocalDate fecha) {
        this.numero = numero;
        this.fecha = fecha;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
