package Extra.Extra3;

import java.util.HashSet;
import java.util.Scanner;

public class LibreriaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashSet<Libro> libreria = new HashSet<>();

    public LibreriaService() {
    }

    public LibreriaService(HashSet<Libro> libreria) {
        this.libreria = libreria;
    }

    public HashSet<Libro> getLibreria() {
        return libreria;
    }

    public void setLibreria(HashSet<Libro> libreria) {
        this.libreria = libreria;
    }

    public void crearLibro(){
        int respuesta;
        do {
            Libro libro = new Libro();
            System.out.println("Ingrese el título del libro");
            libro.setTitulo(read.next());
            System.out.println("Ingrese el autor del libro");
            libro.setAutor(read.next());
            System.out.println("ingrese número de ejemplares");
            libro.setNumeroEjemplares(read.nextInt());
            libro.setEjemplaresPrestados(0);
            libreria.add(libro);
            System.out.println("Quiere agregar otro libro? 1.Sí | 2.No");
            respuesta = read.nextInt();
        } while (respuesta==1);
    }

    public void mostrarLibreria(){
        for(Libro libro : libreria){
            System.out.println(libro);
        }
    }

    public boolean prestamo(){
        System.out.println("Ingrese el título del libro que desea llevarse");
        String titulo = read.next();
        for (Libro libro : libreria) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.getNumeroEjemplares()>0){
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()+1);
                    libro.setNumeroEjemplares(libro.getNumeroEjemplares()-1);
                    System.out.println("Préstamo Exitoso");
                    return true;
                }else{
                    System.err.println("No quedan unidades disponibles de este libro");
                    return false;
                }
            }
        }
        System.err.println("Libro no encontrado");
        return false;
    }

    public boolean devolucion(){
        System.out.println("Ingrese el título del libro que desea devolver");
        String titulo = read.next();
        for (Libro libro : libreria) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.getEjemplaresPrestados()>0){
                    libro.setEjemplaresPrestados(libro.getEjemplaresPrestados()-1);
                    libro.setNumeroEjemplares(libro.getNumeroEjemplares()+1);
                    System.out.println("Devolución Exitosa");
                    return true;
                }
            }
        }
        System.err.println("Libro no forma parte de nuestra biblioteca");
        return false;
    }
}
