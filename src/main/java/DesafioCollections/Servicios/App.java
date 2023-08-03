package DesafioCollections.Servicios;

public class App {

    public void menu(){
        System.out.println("Bienvenido al Hotel");
        System.out.println("Seleccione una opción:");
        System.out.println("1.-Crear una reservación");
        System.out.println("2.-Buscar mi reservación");
        System.out.println("3.-Check In");//busca por id, muestra reserva, confirmacion, quitamos de lista reservas y agregamos a map<id, reserva>
        System.out.println("4.-Check Out");//busca por id, muestra reserva, confirmacion, QUITAMOS DEL MAPA
        System.out.println("5.-Lista de reservaciones");
        System.out.println("6.-Lista de alojamientos");
        System.out.println("7.-Modificar una reservación");
        System.out.println("8.-Cancelar una reservación");
    }
}
