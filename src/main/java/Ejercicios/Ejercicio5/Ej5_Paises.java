package Ejercicios.Ejercicio5;

public class Ej5_Paises {
    public static void main(String[] args) {
        PaisesService PS = new PaisesService();
        PS.agregarPaises();
        PS.mostrarPaises();
        PS.mostrarPaisesOrdenados();
        PS.eliminarPais();
    }
}
