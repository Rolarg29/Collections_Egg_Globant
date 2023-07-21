package Ejercicios.Ejercicio1y2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PerroService {
    ArrayList<String> razasPerro = new ArrayList<>();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void agregarRaza() {
        do {
            System.out.println("Ingrese una raza de perro:");
            razasPerro.add(read.next());
            System.out.println("<---Raza agregada correctamente--->\n");
        } while (agregarOtro());
        System.out.println("Saliendo...");
        mostrarRazas();
        buscarRaza();
        mostrarRazas();
    }

    private boolean agregarOtro() {
        int answer;
        boolean invalidAnswer;
        do {
            System.out.println("¿Desea agregar otro perro o desea salir?");
            System.out.println("1.- Agregar otro.");
            System.out.println("2.- Salir.");
            answer = comprobarInt();
            invalidAnswer = answer != 1 && answer != 2;
            if (invalidAnswer) {
                System.err.println("Elija una respuesta correcta!");
            }
        } while (invalidAnswer);
        return answer == 1;
    }

    private void mostrarRazas() {
        System.out.println("<---LISTA DE RAZAS DE PERROS--->");
        Collections.sort(razasPerro);
        for (String raza : razasPerro) {
            System.out.println(raza);
        }
        System.out.println("<------------------------------>");
    }

    private void buscarRaza() {
        System.out.println("[=<>= Ingrese una raza de perro para buscar =<>=]");
        String razaBuscada = read.next();
        boolean encontrado = false;
        for (String raza : razasPerro) {
            if (raza.equalsIgnoreCase(razaBuscada)) {
                eliminarRaza(raza);
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("La raza ingresada no se encuentra en la lista.");
        }
    }

    private void eliminarRaza(String raza) {
        razasPerro.remove(raza);
    }

    private int comprobarInt() {
        System.out.print("> ");
        while (!read.hasNextInt()) {
            read.next();
            System.err.println("Tipo de dato incorrecto. Intentalo nuevamente.");
            System.err.print("> ");
        }
        return read.nextInt();
    }
}
