package Extra.Extra1;

import java.util.ArrayList;

public class ListaEnteros {
    public static final int FINAL_INPUT = -99;
    ArrayList<Integer> numeros;

    public ListaEnteros() {
        numeros = new ArrayList<>();
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public void agregarNumeros(int num) {
        if(num!=FINAL_INPUT){
            numeros.add(num);
        }
    }

    public int sumarNumeros(){
        return numeros.stream().reduce(0, Integer::sum);
    }

    public double promedioNumeros(){
        return (float) sumarNumeros() /numeros.size();

    }
}
