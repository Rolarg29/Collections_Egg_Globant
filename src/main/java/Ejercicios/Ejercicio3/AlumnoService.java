package Ejercicios.Ejercicio3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoService {
    ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public void crearAlumno(){
        do {
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese el nombre del alumno:");
            String name = read.next();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota "+(i+1)+" del alumno:");
                notas.add(read.nextInt());
            }
            Alumno newAlumno = new Alumno(name, notas);
            listaAlumnos.add(newAlumno);
        } while (agregarOtro());
    }

    private boolean agregarOtro() {
        int answer;
        boolean invalidAnswer;
        do {
            System.out.println("¿Desea agregar otro alumno o desea salir?");
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

    private void notaFinal(Alumno alumno){
        int suma=0;
        for (int i = 0; i < alumno.getNotas().size(); i++) {
            suma+=alumno.getNotas().get(i);
        }
        float promedio = (float) suma /alumno.getNotas().size();
        System.out.printf("El promedio de %s es de: %f%n",alumno.getNombre(), promedio);

    }

    public void buscarAlumno(){
        System.out.println("Ingrese el nombre del alumno a buscar:");
        String name = read.next();
        for (Alumno alumno : listaAlumnos) {
            if (alumno.getNombre().equals(name)) {
                notaFinal(alumno);
                break;
            } else {
                System.out.println("El alumno no se encuentra en la lista.");
            }
        }
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
