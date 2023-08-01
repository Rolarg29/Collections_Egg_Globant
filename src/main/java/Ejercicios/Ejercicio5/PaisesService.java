package Ejercicios.Ejercicio5;

import java.util.*;

public class PaisesService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashSet<String> paises = new HashSet<>();

    public void agregarPaises(){
        String response;
        do {
            System.out.println("Ingrese el nombre de un país.");
            String pais = read.next();
            paises.add(pais);
            System.out.println("Quiere agregar otro país? S/N");
            response = read.next();
        }while(response.equalsIgnoreCase("s"));
    }

    public void mostrarPaises(){
        System.out.println("<-- PAISES -->");
        for (String pais : paises){
            System.out.println("> " + pais);
        }
    }

    public void mostrarPaisesOrdenados(){
        ArrayList<String> paises2 = new ArrayList<>(paises);
        Collections.sort(paises2);
        System.out.println("<-- PAISES [Orden Ascendente] -->");
        for (String pais : paises2){
            System.out.println("> " + pais);
        }
    }

    public void eliminarPais(){
        System.out.println("Ingrese el pais que desea eliminar");
        String nombre = read.next();
        boolean eliminado = false;
        Iterator<String> itPaises = paises.iterator();
        while (itPaises.hasNext()){
            if (itPaises.next().equalsIgnoreCase(nombre)){
                itPaises.remove();
                eliminado=true;
            }
        }
        if (!eliminado){
            System.err.println("El pais no se encuentra en el set");
        }
        mostrarPaises();
    }
}
