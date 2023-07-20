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
        } while (agregarOtro());

    }

    public boolean agregarOtro() {
        System.out.println("¿Desea agregar otro perro o desea salir?");
        System.out.println("1.- Agregar otro.");
        System.out.println("2.- Salir.");
        int answer = read.nextInt();
        if (answer != 1 && answer != 2) {
            System.err.println("Elija una respuesta correcta!");
            agregarOtro();
        }
        return answer == 1;
    }
}
