package Extra.EjercicioGrupal1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Tienda {
    private ArrayList<Producto> inventarioProductos;
    private ProductoService prodService = new ProductoService();
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Tienda() {
        this.inventarioProductos = new ArrayList<>();
    }

    public void agregarProducto(){
        Producto producto = prodService.crearProducto();
        inventarioProductos.add(producto);
        System.out.println("Producto creado y agregado correctamente!");
    }

    public boolean venta(String nombre){
        boolean ventaRealizada = false;
        for (Producto producto : inventarioProductos){
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                if(producto.getInventario()>0){
                    prodService.reducirInventario(producto);
                    ventaRealizada=true;
                }
            }
        }
        return ventaRealizada;
    }

    public boolean reposicion(String nombre){
        boolean reposicionInventario = false;
        for (Producto producto : inventarioProductos){
            if (producto.getNombre().equalsIgnoreCase(nombre)){
                prodService.aumentarInventario(producto);
                reposicionInventario =true;

            }
        }
        return reposicionInventario;
    }

    private void listarProductos(){
        System.out.println("===Lista de Productos===");
        if(inventarioProductos.size()==0){
            System.out.println("[ No haz agregado ningún producto al inventario ]");
        }else{
            for (Producto producto : inventarioProductos){
                prodService.mostrarProducto(producto);
            }
        }
        System.out.println("==========================");
    }

    private void eliminarProducto(String nombre){
        boolean productoEliminado = false;
        if (inventarioProductos.size()==0){
            System.out.println("[ No se puede realizar la operación. Inventario vacío.]");
        } else {
            Iterator<Producto> itInventario = inventarioProductos.iterator();
            while (itInventario.hasNext()) {
                if (itInventario.next().getNombre().equalsIgnoreCase(nombre)) {
                    itInventario.remove();
                    productoEliminado = true;
                }
            }
            if (productoEliminado){
                System.out.println("El producto se ha eliminado del inventario.");
            }else{
                System.out.println("[ No se encontró ningún producto con ese nombre. ]");
            }
        }
        System.out.println("_________________________");
    }

    private String nombreProducto(){
        System.out.println("Ingrese el nombre del producto que desea.");
        return read.next();
    }

    public void menu(){
        System.out.println("===<>===<>[Bienvenido a la Tienda]<>===<>===");
        System.out.println("Seleccione la operación que desea realizar.");
        System.out.println("1.- Agregar productos al inventario.");
        System.out.println("2.- Comprar un producto.");
        System.out.println("3.- Reponer un producto");
        System.out.println("4.- Eliminar un producto");
        System.out.println("5.- Listar productos");
        System.out.println("6.- Salir");
        System.out.println("===<>===<>===<>===<>===<>===<>===<>===<>===");
        System.out.print(">");
        int respuesta = read.nextInt();
        switch(respuesta){
            case 1:
                agregarProducto();
                menu();
                break;
            case 2:
                if(venta(nombreProducto())){
                    System.out.println("La compra se ha realizado correctamente!");
                }else{
                    System.err.println("No ha podido realizarse la compra, producto insuficiente.");
                }
                menu();
                break;
            case 3:
                reposicion(nombreProducto());
                System.out.println("La reposición del producto se ha realizado correctamente!");
                menu();
                break;
            case 4:
                eliminarProducto(nombreProducto());
                menu();
                break;
            case 5:
                listarProductos();
                menu();
                break;
            case 6:
                System.out.println("Gracias, vuelva pronto!");
                break;
            default:
                System.err.println("Seleccione una opción válida del menú");
                menu();
                break;
        }
    }


}
