package Ejercicios.Ejercicio6;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TiendaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashMap<String, Double> Productos = new HashMap<>();

    /*
    TODO
    Introducir un elemento
    Modificar su precio
    Eliminar un producto
    Mostrar productos con su precio
    */

    public void agregarProducto() {
        System.out.println("<-- AGREGAR PRODUCTO -->");
        String answer;
        do {
            System.out.print("Ingrese el nombre del producto.\n>=>");
            String nombre = read.next();
            System.out.print("Ingrese el precio del producto.\n>$");
            Double precio = read.nextDouble();
            Productos.put(nombre, precio);
            System.out.println("Desea agregar otro producto? s/n");
            answer = read.next();
        } while (answer.equalsIgnoreCase("s"));
    }

    public void modificarPrecio(){
        System.out.println("<-- MODIFICAR PRECIO -->");
        System.out.print("Ingrese el nombre del producto cuyo precio desea modificar: ");
        String nombre = read.next();
        boolean noEncontrado = true;
        for(Map.Entry<String,Double> entry :Productos.entrySet()){
            if(entry.getKey().equalsIgnoreCase(nombre)){
                System.out.println("Precio anterior => "+entry.getKey()+": $"+entry.getValue());
                System.out.print("Introduzca nuevo precio : $");
                Double newPrice = read.nextDouble();
                entry.setValue(newPrice);
                System.out.println("Precio Nuevo => "+entry.getKey()+": $"+entry.getValue());
                noEncontrado  = false;
            }
        }
        if (noEncontrado) System.err.println("No se encontró ningún producto con ese nombre.");
        System.out.println("<-------------------------->");
    }

    public void mostrarProductos(){
        System.out.println("<-- LISTA DE PRODUCTOS -->");
        for(Map.Entry<String,Double> entry :Productos.entrySet()){
            System.out.println(">> [ " + entry.getKey() + ": $" + entry.getValue() + " ]");
        }
        System.out.println("<-------------------------->");
    }

    public void eliminarProductos(){
        System.out.println("<-- ELIMINAR PRODUCTO -->");
        System.out.print("Ingrese el nombre del producto cuyo precio desea eliminar: ");
        String nombre = read.next();
        boolean noEncontrado = true;
        Iterator<Map.Entry<String, Double>> itProductos = Productos.entrySet().iterator();
        while(itProductos.hasNext()){
            if (itProductos.next().getKey().equalsIgnoreCase(nombre)){
                itProductos.remove();
                System.out.println("Producto eliminado correctamente!");
                noEncontrado = false;
            }
        }
        if (noEncontrado) System.err.println("No se encontró ningún producto con ese nombre.");
        System.out.println("<-------------------------->");
    }

}
