package DesafioCollections.Entidades;

import java.time.LocalDate;

public class Reserva {
    //Reserva (ID, Numero de habitación, cantidad de personas, fechas)
    private Integer id = 0;
    private Integer numeroHabitacion;
    private Integer cantidadPersonas;
    private String fechaLlegada;
    private String fechaSalida;


    public Reserva(Integer id,Integer numeroHabitacion, Integer cantidadPersonas, String fechaLlegada, String fechaSalida) {
        this.id = id+1;
        this.numeroHabitacion = numeroHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(Integer numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(String fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", numeroHabitacion=" + numeroHabitacion +
                ", cantidadPersonas=" + cantidadPersonas +
                ", fechaLlegada='" + fechaLlegada + '\'' +
                ", fechaSalida='" + fechaSalida + '\'' +
                '}';
    }
}
