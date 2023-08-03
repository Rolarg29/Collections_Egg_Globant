package DesafioCollections;

import DesafioCollections.Servicios.ReservaService;

public class DesafioCollections {
    public static void main(String[] args) {
        ReservaService rs = new ReservaService();
        rs.crearReserva();
        rs.crearReserva();
        rs.mostrarReservas();
    }
}
