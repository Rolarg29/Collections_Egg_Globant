package Extra.Extra4;

public class Ex4_CodigosPostales {

    public static void main(String[] args) {
        CodigosPostales cp = new CodigosPostales();
//        cp.ingresar10Codigos();
        cp.ingresarCodigo(47303,"Hamilton Park");
        cp.ingresarCodigo(47303,"Hyde Park");
        cp.ingresarCodigo(47304,"Brewington Woods");
        cp.mostrarCodigosPostales();
    }
}
