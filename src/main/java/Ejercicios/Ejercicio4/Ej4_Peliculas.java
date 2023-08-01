package Ejercicios.Ejercicio4;

public class Ej4_Peliculas {
    public static void main(String[] args) {
        PeliculaService PS = new PeliculaService();
        PS.agregarPeliculas();
        PS.mostrarPeliculas();
        PS.mostrarPeliculasMayorA1Hora();
        PS.mostrarPeliculasPorDuracionDescendente();
        PS.mostrarPeliculasPorDuracionAscendente();
        PS.mostrarPeliculasPorTitulo();
        PS.mostrarPeliculasPorDirector();

    }
}
