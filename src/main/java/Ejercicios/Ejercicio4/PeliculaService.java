package Ejercicios.Ejercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    private Pelicula crearPelicula(){
        System.out.println("Ingrese el nombre de la Pelicula.");
        String nombre = read.next();
        System.out.println("Ingrese el nombre del director.");
        String director = read.next();
        System.out.println("Ingrese la duración de la película (en horas).");
        Double duracion = read.nextDouble();
        return new Pelicula(nombre.toUpperCase(), director.toUpperCase(), duracion);
    }

    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public void agregarPeliculas() {
        String answer;
        do {
            System.out.println("=========================");
            listaPeliculas.add(crearPelicula());
            System.out.println("Quiere crear otra película?");
            answer = read.next();
        } while (answer.equalsIgnoreCase("si"));
    }

    public void mostrarPeliculas(){
        System.out.println("===<>===<>[ LISTA DE TODAS LAS PELICULAS ]<>===<>===");
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        System.out.println("===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===");
        System.out.println();
    }

    public void mostrarPeliculasMayorA1Hora(){
        System.out.println("===<>===<>[ LISTA DE PELICULAS CON DURACIÓN MAYOR A 1 HORA ]<>===<>===");
        for (Pelicula listaPelicula : listaPeliculas) {
            if (listaPelicula.getDuracion()>1){
                System.out.println(listaPelicula);
            }
        }
        System.out.println("===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===");
        System.out.println();
    }

    public void mostrarPeliculasPorDuracionDescendente(){
        System.out.println("===<>===<>[ LISTA DE PELICULAS POR DURACIÓN DESCENDENTE ]<>===<>===");
        listaPeliculas.sort(Comparadores.compararDuracionDesc);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        System.out.println("===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===");
        System.out.println();
    }
    public void mostrarPeliculasPorDuracionAscendente(){
        System.out.println("===<>===<>[ LISTA DE PELICULAS POR DURACIÓN ASCENDENTE ]<>===<>===");
        listaPeliculas.sort(Comparadores.compararDuracionAsc);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        System.out.println("===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===");
        System.out.println();
    }

    public void mostrarPeliculasPorTitulo(){
        System.out.println("===<>===<>[ LISTA DE PELICULAS POR TITULO ]<>===<>===");
        listaPeliculas.sort(Comparadores.compararTituloAbc);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        System.out.println("===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===");
        System.out.println();
    }

    public void mostrarPeliculasPorDirector(){
        System.out.println("===<>===<>[ LISTA DE PELICULAS POR DIRECTOR ]<>===<>===");
        listaPeliculas.sort(Comparadores.compararDirectorAbc);
        for (Pelicula listaPelicula : listaPeliculas) {
            System.out.println(listaPelicula);
        }
        System.out.println("===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===<>===");
        System.out.println();
    }
}
