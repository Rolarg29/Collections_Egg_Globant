package Extra.Extra3;

public class Ex3_Libreria {

    public static void main(String[] args) {
        LibreriaService libreria = new LibreriaService();
        libreria.crearLibro();
        libreria.mostrarLibreria();
        libreria.prestamo();
        libreria.mostrarLibreria();
        libreria.devolucion();
        libreria.mostrarLibreria();
    }
}
