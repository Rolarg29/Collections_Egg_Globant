package Extra.Extra1;

import java.util.Scanner;

public class App {
    public final static String mensaje1 = "Por favor introduzca los números para su lista.";
    public final static String mensaje2 = "Para finalizar indique el numero " + ListaEnteros.FINAL_INPUT;
    public final static String mensaje3 = "La suma de los números es ";
    public final static String mensaje4 = "El promedio de los números es ";
    public final static String mensaje5 = "Los números de la lista son ";
    public final static String mensaje6 = "La cantidad de números de la lista son ";
    final Scanner scanner;

    private ListaEnteros listaEnteros = new ListaEnteros();

    public App(Scanner scanner) {
        this.scanner = scanner;
    }

    public double inicializar(){
        imprimirMensaje(mensaje1);
        imprimirMensaje(mensaje2);
        Integer numero;
        do {
            numero = scanner.nextInt();
            listaEnteros.agregarNumeros(numero);
        } while (numero != ListaEnteros.FINAL_INPUT);

        System.out.println(mensaje5);
        System.out.println(listaEnteros.getNumeros());
        System.out.println(mensaje6 + listaEnteros.getNumeros().size());
        System.out.println(mensaje3 + listaEnteros.sumarNumeros());
        Double promedio = listaEnteros.promedioNumeros();
        System.out.println(mensaje4 + promedio);
        return promedio;
    }

    public void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }


}
