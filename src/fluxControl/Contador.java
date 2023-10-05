package fluxControl;
public class Contador {

    public static void contar(int firstParameter, int secondParameter) throws ParametrosInvalidosException {
        if (firstParameter > secondParameter) {
            throw new ParametrosInvalidosException();
        }
        int count = secondParameter - firstParameter;

        for(int i = 1; i < count; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
