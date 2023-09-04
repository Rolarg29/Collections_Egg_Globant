package Ejercicios.Ejercicio6;

import java.util.Scanner;

public class AppTienda {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    TiendaService TS = new TiendaService();

    public void menu() {
        int option;
        do {
            System.out.println("<==> Bienvenido a la Tienda <==>");
            System.out.println("Seleccione una opción del menú:");
            System.out.println("1.-Introducir un producto.\n2.-Modificar el precio de un producto.\n3.-Mostrar lista de productos.\n4.-Eliminar un producto.\n5.-Salir.");
            System.out.println("-----------------------------------");
            System.out.print(">");
            option = comprobarOpcion(read.nextInt());
            ejecutarAcciones(option);
        } while (continuarMenu(option));
    }

    private void ejecutarAcciones(int option){
        switch (option) {
            case 1:
                TS.agregarProducto();
                break;
            case 2:
                TS.modificarPrecio();
                break;
            case 3:
                TS.mostrarProductos();
                break;
            case 4:
                TS.eliminarProductos();
                break;
            case 5:
                System.out.println("Gracias...Vuelva Pronto!!!");
                break;
        }
    }

    private boolean continuarMenu(int num){
        return num != 5;
    }

    private int comprobarOpcion(int option){
        if (option>0 && option<6){
            return option;
        }else{
            System.err.println("Escoja una opción correcta: 1-5");
            int newOption = read.nextInt();
            return comprobarOpcion(newOption);
        }
    }
}
