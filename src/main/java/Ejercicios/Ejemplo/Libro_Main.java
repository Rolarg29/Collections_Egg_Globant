package Ejercicios.Ejemplo;

import java.util.ArrayList;

public class Libro_Main {
    public static void main(String[] args) {
        ArrayList<Libro> listaLibros = new ArrayList<>();
        Libro libro1 = new Libro("Libro uno", "Rolando", "Terror");
        Libro libro2 = new Libro("Libro dos", "Norberto", "Acción");
        Libro libro3 = new Libro("Libro tres", "Rodrigo", "Suspenso");

        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);

        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
}
