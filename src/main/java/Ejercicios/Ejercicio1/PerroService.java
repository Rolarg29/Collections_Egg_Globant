package Ejercicios.Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {
    ArrayList<String> razasPerro = new ArrayList<>();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void agregarRaza() {
        do {
            System.out.println("Ingrese una raza de perro:");
            razasPerro.add(read.next());
            System.out.println("<---Raza agregada correctamente--->");
        } while (agregarOtro());
        System.out.println("Saliendo...");
        mostrarRazas();

    }

    private boolean agregarOtro() {
        int answer;
        boolean invalidAnswer;
        do {
            System.out.println("¿Desea agregar otro perro o desea salir?");
            System.out.println("1.- Agregar otro.");
            System.out.println("2.- Salir.");
            answer = read.nextInt();
            invalidAnswer = answer != 1 && answer != 2;
            if (invalidAnswer) {
                System.err.println("Elija una respuesta correcta!");
            }
        } while (invalidAnswer);
        return answer == 1;
    }

    private void mostrarRazas(){
        System.out.println("<---LISTA DE RAZAS DE PERROS--->");
        for(String raza : razasPerro){
            System.out.println(raza);
        }
    }
}
