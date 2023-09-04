package DesafioCollections.Servicios;

import DesafioCollections.Entidades.Reserva;

import java.util.HashSet;
import java.util.Scanner;

public class ReservaService {
    private Scanner read;
    public HashSet<Reserva> listaReservas;

    public ReservaService() {
        this.read = new Scanner(System.in).useDelimiter("\n");
        this.listaReservas = new HashSet<>();
    }

    public void crearReserva(){
        System.out.println("Ingrese la cantidad de personas.");
        Integer cantidadPersonas = read.nextInt();
        //crearPersonas(cantidad
        switch (cantidadPersonas) {
            case 1:
                System.out.println("Puede escoger habitación de la 9-10");
                break;
            case 2:
                System.out.println("Puede escoger habitación de la 1-5");
                break;
            case 3:
                System.out.println("Puede escoger habitación de la 6-8");
                break;
        }
        boolean disponible = false;
        Integer habitacion;
        do {
            System.out.println("Ingrese la habitación que desea ocupar.");
            habitacion = read.nextInt();
            if (!listaReservas.isEmpty()) {
                for(Reserva reserva : listaReservas){
                    if (reserva.getNumeroHabitacion()==habitacion){
                        System.err.println("La habitación ya está ocupada.");
                    }else{
                        System.out.println("La habitación está disponible.");
                        disponible = true;
                    }
                }
            }else{
                disponible = true;
            }
        } while (!disponible);
        System.out.println("Ingrese la fecha de llegada: 'dd--mm-yyyy'");
        String fechaLlegada = read.next();
        System.out.println("Ingrese la fecha de salida: 'dd--mm-yyyy'");
        String fechaSalida = read.next();
        Reserva newReserva = new Reserva(listaReservas.size(), habitacion,cantidadPersonas,fechaLlegada,fechaSalida);
        listaReservas.add(newReserva);
    }

    public void mostrarReservas(){
        for(Reserva reserva : listaReservas){
            System.out.println(reserva);
        }
    }
}
