package Extra.EjercicioGrupal1;

import java.util.Scanner;

public class ProductoService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Producto crearProducto(){
        System.out.println("Cual es el nombre del producto?");
        String nombre = read.next();
        System.out.println("Cual es la categoría del producto?");
        String cat = read.next();
        System.out.println("Cual es el precio del producto?");
        double precio = read.nextDouble();
        System.out.println("Cual es la cantidad de inventario del producto?");
        int inventario = read.nextInt();
        return new Producto(nombre, cat, precio, inventario);
    }

    public void mostrarProducto(Producto producto){
        System.out.println(producto);
    }

    public void reducirInventario(Producto producto) {
        producto.setInventario(producto.getInventario()-1);
    }

    public void aumentarInventario(Producto producto) {
        producto.setInventario(producto.getInventario()+1);
    }
}
