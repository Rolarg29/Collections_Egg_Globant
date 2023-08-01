package Extra;

import Extra.Extra1.App;
import Extra.Extra1.ConsoleOutputCapture;
import Extra.Extra1.ListaEnteros;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class ListaEnterosTest {
    static ListaEnteros listaEnteros;
    static ConsoleOutputCapture consoleOutputCapture;

    @BeforeClass
    public static void setUpClass(){
        consoleOutputCapture = new ConsoleOutputCapture();
        listaEnteros = new ListaEnteros();
    }

    @Before
    public void clear() {
        consoleOutputCapture.clear();
        listaEnteros.getNumeros().clear();
        listaEnteros.getNumeros().clear();
        listaEnteros.agregarNumeros(10);
        listaEnteros.agregarNumeros(20);
        listaEnteros.agregarNumeros(30);
        listaEnteros.agregarNumeros(40);
    }

    @Test
    public void addNumbersToListTest(){
        assertFalse(listaEnteros.getNumeros().isEmpty());
        assertEquals(4, listaEnteros.getNumeros().size(),0);
    }

    @Test
    public void additionNumbersTest(){
        assertFalse(listaEnteros.getNumeros().isEmpty());
        assertEquals(100,listaEnteros.sumarNumeros(),0);
    }

    @Test
    public void averageNumbersTest(){
        assertFalse(listaEnteros.getNumeros().isEmpty());
        assertEquals(25, listaEnteros.promedioNumeros(),0);
    }

    @Test
    public void testApp(){
        String sampleInput = "10\n20\n30\n40\n-99\n";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sampleInput.getBytes());
        Scanner read = new Scanner(inputStream);
        App app = new App(read);
        Double result = app.inicializar();

        assertEquals(25, result,0);
        assertFalse(result!=25);
    }

    @Test
    public void testImprimirMensaje() {
        consoleOutputCapture.start();

        Scanner scanner = new Scanner(System.in);
        App app = new App(scanner);
        app.imprimirMensaje("Prueba");

        String output = consoleOutputCapture.getOutput();
        consoleOutputCapture.stop();
        assertEquals("Prueba", output);
    }
}
