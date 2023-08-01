package Extra.Extra2;

import java.util.ArrayList;
import java.util.Scanner;

public class CantanteFamosoService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList<CantanteFamoso> listaCantantes = new ArrayList<>();

    public CantanteFamoso crearCantante(){
        System.out.println("Ingrese el nombre del cantante.");
        String name = read.next();
        System.out.println("Ingrese el disco con mas ventas del cantante.");
        String disco = read.next();
        return new CantanteFamoso(name, disco);
    }

    public void cincoCantantesIniciales(){
        for (int i = 0; i < 5; i++) {
            agregarCantante();
        }
    }

    public void agregarCantante(){
        listaCantantes.add(crearCantante());
    }

    public void mostrarListaCantantes(){
        for (CantanteFamoso cantante : listaCantantes) {
            System.out.println(cantante);
        }
    }

    public void eliminarCantante() {
        System.out.println("Ingrese el cantante que desea eliminar: ");
        String cantante = read.next();
        for (CantanteFamoso cantanteAEliminar : listaCantantes) {
            if (cantanteAEliminar.getNombre().equalsIgnoreCase(cantante)) {
                listaCantantes.remove(cantanteAEliminar);
                System.out.println("Eliminado con éxito");
                return;
            }
        }
        System.out.println("No se encontro el cantante");
    }

    public void menu() {
        while (true) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar un cantante");
            System.out.println("2. Mostrar todos los cantantes");
            System.out.println("3. Eliminar un cantante");
            System.out.println("4. Salir");

            int opcion = read.nextInt();
            if (opcion == 4){
                break;
            }
            switch (opcion) {
                case 1:
                    agregarCantante();
                    break;
                case 2:
                    mostrarListaCantantes();
                    break;
                case 3:
                    eliminarCantante();
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}
