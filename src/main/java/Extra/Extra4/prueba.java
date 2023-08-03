package Extra.Extra4;

public class prueba {
    public static void main(String[] args) {
        String nombre = "Rolando";
        String apellido = "Ramirez";
        int edad = 21;
        String texto = String.format("Mi nombre es %s %s, y tengo %d años.\n",apellido,nombre,edad);
        System.out.printf(texto);
    }
}
