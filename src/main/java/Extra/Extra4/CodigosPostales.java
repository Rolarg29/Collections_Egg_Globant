package Extra.Extra4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodigosPostales {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    HashMap<Integer,String> codigosPostales = new HashMap<>();

    /*

• 	Pide un código postal y muestra la ciudad asociada si existe sino avisa al usuario.
• 	Muestra por pantalla los datos
• 	Agregar una ciudad con su código postal correspondiente más al HashMap.
• 	Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
• 	Muestra por pantalla los datos
     */

    public void ingresar10Codigos(){
        System.out.println("Ingrese el codigo postal de 10 ciudades.");
        for (int i = 0; i < 10; i++) {
            System.out.printf("[CÓDIGO %d/10]\n", (i+1));
            System.out.print("Ingrese el codigo postal: ");
            Integer codigo = read.nextInt();
            System.out.print("Ingrese la ciudad correspondiente: ");
            String ciudad = read.next();
            mostrarDatos(codigo,ciudad);
            ingresarCodigo(codigo,ciudad);
        }
    }

    public void ingresarCodigo(Integer code, String city){
        codigosPostales.put(code, city);
    }

    public void mostrarDatos(Integer code, String city){
        System.out.println("---Codigo ingresado---");
        System.out.printf("Código postal: %d\nCiudad: %s\n", code, city);
        System.out.println("----------------------");
    }

    public void mostrarCodigosPostales(){
        System.out.println("<==> LISTA DE CÓDIGOS Y CIUDADES <==>");
        for (Map.Entry<Integer,String> entry : codigosPostales.entrySet()){
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.printf("[Código postal: %d / Ciudad: %s]\n",key,value);
        }
        System.out.println("============================");
    }

    public void buscarCodigo() {
        System.out.println("Ingrese el codigo de la cuidad que quiere mostrar");
        Integer codigo = read.nextInt();
        if ( codigosPostales.containsKey(codigo)){
            System.out.println(codigosPostales.get(codigo));
        } else {
            System.out.println("La ciudad que busca no se encuentra");
        }
    }
}
